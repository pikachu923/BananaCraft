package com.pikachu923.BananaCraft.Items2;

import com.pikachu923.BananaCraft.init.Tier1Items;
import com.pikachu923.BananaCraft.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;

public class BananaGun extends ItemBow {
	
	String Texture;
	
	public BananaGun(String unlocalName) {
        super();
        this.setUnlocalizedName(Reference.RESOURCE_PREFIX + unlocalName);
        this.Texture = Reference.RESOURCE_PREFIX + unlocalName;
        this.setCreativeTab(Reference.CreativeTab);
        setMaxDamage(700);
    }
	
	@SideOnly(value=Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(this.Texture);
    }
	
	@Override
	public int getMaxItemUseDuration(ItemStack p_77626_1_)
    {
        return 61000;
    }
	
	@Override
	 public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_)
	    {
	       /* ArrowNockEvent event = new ArrowNockEvent(p_77659_3_, p_77659_1_);
	        MinecraftForge.EVENT_BUS.post(event);
	        if (event.isCanceled())
	        {
	            return event.result;
	        }

	        if (p_77659_3_.capabilities.isCreativeMode || p_77659_3_.inventory.hasItem(Items.arrow))
	        {
	            p_77659_3_.setItemInUse(p_77659_1_, this.getMaxItemUseDuration(p_77659_1_));
	        }
*/ 			//onItemRightClick(p_77659_1_, p_77659_2_, p_77659_3_);
	        onPlayerStoppedUsing(p_77659_1_, p_77659_2_, p_77659_3_, getMaxDamage());
	        return p_77659_1_;
	    }

	 public void onPlayerStoppedUsing(ItemStack p_77615_1_, World p_77615_2_, EntityPlayer p_77615_3_, int p_77615_4_)
	    {
	        int j = this.getMaxItemUseDuration(p_77615_1_) - p_77615_4_;

	        ArrowLooseEvent event = new ArrowLooseEvent(p_77615_3_, p_77615_1_, j);
	        MinecraftForge.EVENT_BUS.post(event);
	        if (event.isCanceled())
	        {
	            return;
	        }
	        j = event.charge;

	        boolean flag = p_77615_3_.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, p_77615_1_) > 0;

	        if (flag || p_77615_3_.inventory.hasItem(Items.arrow))
	        {
	            float f = (float)j / 20.0F;
	            f = (f * f + f * 2.0F) / 3.0F;

	            if ((double)f < 0.1D)
	            {
	                return;
	            }

	            if (f > 1.0F)
	            {
	                f = 1.0F;
	            }

	            EntityArrow entityarrow = new EntityArrow(p_77615_2_, p_77615_3_, f * 2.0F);

	            if (f == 1.0F)
	            {
	                entityarrow.setIsCritical(true);
	            }

	            int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, p_77615_1_) + 3;

	            if (k > 0)
	            {
	                entityarrow.setDamage(entityarrow.getDamage() + (double)k * 0.5D + 0.5D);
	            }

	            int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, p_77615_1_);

	            if (l > 0)
	            {
	                entityarrow.setKnockbackStrength(l);
	            }

	            if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, p_77615_1_) > 0)
	            {
	                entityarrow.setFire(100);
	            }

	            p_77615_1_.damageItem(1, p_77615_3_);
	            p_77615_2_.playSoundAtEntity(p_77615_3_, Reference.RESOURCE_PREFIX + "Items.BananaGunFire", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

	            if (flag)
	            {
	                entityarrow.canBePickedUp = 2;
	            }
	            else
	            {
	                p_77615_3_.inventory.consumeInventoryItem(Items.arrow);
	            }

	            if (!p_77615_2_.isRemote)
	            {
	                p_77615_2_.spawnEntityInWorld(entityarrow);
	            }
	        }
	    }
	 @Override
	 public int getItemEnchantability()
	    {
	        return 2;
	    }
}
