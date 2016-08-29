package com.pikachu923.BananaCraft.Entity.BananaBoss;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;

public class MyEntityWraith extends EntityMob implements IBossDisplayData, IMob
{
    public Object capabilities;
    public MyEntityWraith(World par1World)
	{
        super(par1World);
        this.setSize(0.9F, 1.3F);  
        //setHeath();
        
    }
   

	
     
     protected void entityInit()
     {
         super.entityInit();
         this.dataWatcher.addObject(13, new Byte((byte)0));
     }


	@SideOnly(Side.CLIENT)
    public int getBossHealth() {
    	return (int) this.getHealth();
    }
    
    public boolean isAIEnabled()
    {
        return true;
    }


	public void initCreature() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	protected void applyEntityAttributes()
	{
	    super.applyEntityAttributes(); 

	    // standard attributes registered to EntityLivingBase
	   getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200.0D);
	   getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.20D);
	   getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.8D);
	   getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(16.0D);

	    // need to register any additional attributes
	   getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
	   getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(4.0D);
	}
}