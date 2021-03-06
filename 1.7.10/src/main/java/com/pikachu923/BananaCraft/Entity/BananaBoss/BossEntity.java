package com.pikachu923.BananaCraft.Entity.BananaBoss;

import com.pikachu923.BananaCraft.init.Other;
import com.pikachu923.BananaCraft.init.Tier3Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class BossEntity extends EntityMob implements IBossDisplayData, IMob
{
    public Object capabilities;
    public BossEntity(World par1World)
	{
        super(par1World);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, false));
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.setSize(0.9F, 2F);      
    }
    @Override
	protected void applyEntityAttributes()
	{
	    super.applyEntityAttributes(); 

	    // standard attributes registered to EntityLivingBase
	   getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(700.0D);
	   getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.40D);
	   getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0D);
	   getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(32.0D);

	    // need to register any additional attributes
	   getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(15.0D);
	}
    
     protected void entityInit()
     {
         super.entityInit();
         this.dataWatcher.addObject(13, new Byte((byte)0));
        
         
     }
     
     public void onLivingUpdate()
     {
         this.updateArmSwingProgress();
         float f = this.getBrightness(1.0F);

         if (f > 0.5F)
         {
             this.entityAge += 2;
         }
         
         BossStatus.setBossStatus(this, true);

         super.onLivingUpdate();
     }



    
    public boolean isAIEnabled()
    {
        return true;
    }
       
	public void initCreature() {
		// TODO Auto-generated method stub
		
	}
	
	public Item getDropItem() {
		return Tier3Items.CorroptFragment;
		
	}
	
	public void dropFewItems(boolean par1, int par2)
    {
        Item item = this.getDropItem();

        if (item != null)
        {
            int j = this.rand.nextInt(3) + 1;

            if (par2 > 0)
            {
                j += this.rand.nextInt(par2);
            }

            for (int k = 0; k < j; ++k)
            {
                this.dropItem(item, 1);
            }
        }
    }
	
	protected void updateAITick() {
		super.updateAITick();
	}
	
	 public boolean attackEntityFrom(DamageSource p_70097_1_, float p_70097_2_)
	    {
	        if (this.isEntityInvulnerable())
	        {
	            return false;
	        }
	        else if (super.attackEntityFrom(Other.Boss, p_70097_2_))
	        {
	            Entity var3 = p_70097_1_.getEntity();

	            if (this.riddenByEntity != var3 && this.ridingEntity != var3)
	            {
	                if (var3 != this)
	                {
	                    this.entityToAttack = var3;
	                }

	                return true;
	            }
	            else
	            {
	                return true;
	            }
	        }
	        else
	        {
	            return false;
	        }
	    }

    /**
     * Finds the closest player within 16 blocks to attack, or null if this Entity isn't interested in attacking
     * (Animals, Spiders at day, peaceful PigZombies).
     */
    protected Entity findPlayerToAttack()
    {
        EntityPlayer var1 = this.worldObj.getClosestVulnerablePlayerToEntity(this, 16.0D);
        return var1 != null && this.canEntityBeSeen(var1) ? var1 : null;
    }
    
    protected String getHurtSound()
    {
        return "game.hostile.hurt";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return "game.hostile.die";
    }
    
    public boolean attackEntityAsMob(Entity p_70652_1_)
    {
        float var2 = (float)this.getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue();
        int var3 = 0;

        if (p_70652_1_ instanceof EntityLivingBase)
        {
            var2 += EnchantmentHelper.getEnchantmentModifierLiving(this, (EntityLivingBase)p_70652_1_);
            var3 += EnchantmentHelper.getKnockbackModifier(this, (EntityLivingBase)p_70652_1_);
        }

        boolean var4 = p_70652_1_.attackEntityFrom(Other.Boss, var2);

        if (var4)
        {
            if (var3 > 0)
            {
                p_70652_1_.addVelocity((double)(-MathHelper.sin(this.rotationYaw * (float)Math.PI / 180.0F) * (float)var3 * 0.5F), 0.1D, (double)(MathHelper.cos(this.rotationYaw * (float)Math.PI / 180.0F) * (float)var3 * 0.5F));
                this.motionX *= 0.6D;
                this.motionZ *= 0.6D;
            }

            int var5 = EnchantmentHelper.getFireAspectModifier(this);

            if (var5 > 0)
            {
                p_70652_1_.setFire(var5 * 4);
            }

            if (p_70652_1_ instanceof EntityLivingBase)
            {
                EnchantmentHelper.func_151384_a((EntityLivingBase)p_70652_1_, this);
            }

            EnchantmentHelper.func_151385_b(this, p_70652_1_);
        }

        return var4;
    }

    /**
     * Basic mob attack. Default to touch of death in EntityCreature. Overridden by each mob to define their attack.
     */
    protected void attackEntity(Entity p_70785_1_, float p_70785_2_)
    {
        if (this.attackTime <= 0 && p_70785_2_ < 2.0F && p_70785_1_.boundingBox.maxY > this.boundingBox.minY && p_70785_1_.boundingBox.minY < this.boundingBox.maxY)
        {
            this.attackTime = 20;
            ((EntityLivingBase) p_70785_1_).addPotionEffect(new PotionEffect(Potion.confusion.getId(), 200, 4));
            ((EntityLivingBase) p_70785_1_).addPotionEffect(new PotionEffect(Potion.blindness.getId(), 200, 1));
            this.attackEntityAsMob(p_70785_1_);
        }
    }
    
    public void onUpdate()
    {
        super.onUpdate();

        if (this.worldObj.isRemote && this.worldObj.difficultySetting == EnumDifficulty.PEACEFUL)
        {
            this.setDead();
        }
    }
    
    
}
