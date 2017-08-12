package com.pikachu923.BananaCraft.items;

import com.pikachu923.BananaCraft.init.DebugItems;
import com.pikachu923.BananaCraft.reference.Reference;

//import cpw.mods.fml.relauncher.Side;
//import cpw.mods.fml.relauncher.SideOnly;
//import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class SamItem extends Item {
	String Texture;
	public SamItem(String unlocalName){
		super();
		this.setUnlocalizedName(Reference.RESOURCE_PREFIX + unlocalName);
        Texture = Reference.RESOURCE_PREFIX + "CorruptIngot";
        setCreativeTab(null);
    }

    /*@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister){
        this.itemIcon = iconRegister.registerIcon(Texture);
    }*/
    
    public void onUpdate(ItemStack p_77663_1_, World p_77663_2_, Entity player, int p_77663_4_, boolean p_77663_5_) {
    	boolean contain = ((EntityPlayer) player).inventory.hasItemStack(new ItemStack(DebugItems.DebugGem));
    	if(!contain){
    		((EntityLivingBase) player).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 100, 126));
    	}
    }
}
