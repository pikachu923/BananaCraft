package com.pikachu923.BananaCraft.items;

import com.pikachu923.BananaCraft.reference.Reference;

import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BananaBread extends ItemFood {
	String Texture;
    public BananaBread(String unlocalName, int parHealAmount, float parSaturationModifier){
        super(parHealAmount, parSaturationModifier, false);
        this.setUnlocalizedName(Reference.RESOURCE_PREFIX + unlocalName);
        Texture = Reference.RESOURCE_PREFIX + unlocalName;
        setCreativeTab(Reference.CreativeTab);
		setRegistryName("BananaBread");
    }

    /*@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister){
        this.itemIcon = iconRegister.registerIcon(Texture);
    }*/
}
