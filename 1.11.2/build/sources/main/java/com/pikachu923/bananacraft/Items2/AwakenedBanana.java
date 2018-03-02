package com.pikachu923.bananacraft.Items2;

import net.minecraft.client.renderer.texture.IIconRegister;

import com.pikachu923.bananacraft.items.ItemWrapper;
import com.pikachu923.bananacraft.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class AwakenedBanana extends ItemWrapper {
    String Texture;
    public AwakenedBanana(String unlocalName){
        super();
        this.setUnlocalizedName(unlocalName);
        Texture = Reference.RESOURCE_PREFIX + unlocalName;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister){
        this.itemIcon = iconRegister.registerIcon(Texture);
    }
}
