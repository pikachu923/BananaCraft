package com.pikachu923.BananaCraft.block;

import java.util.Random;

import com.pikachu923.BananaCraft.init.ModItems;
import com.pikachu923.BananaCraft.reference.Reference;
import com.pikachu923.BananaCraft.utility.Plants;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BananaPlant extends Plants {

    public BananaPlant()
    {
        // Basic block setup
	setBlockName("BananaPlant");
    setBlockTextureName(Reference.RESOURCE_PREFIX + "BananaPlant_0");
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    @Override
    public int quantityDropped(int parMetadata, int parFortune, Random parRand)
    {
        return (parMetadata/2);
    }

    @Override
    public Item getItemDropped(int parMetadata, Random parRand, int parFortune)  
    {
     // DEBUG
     System.out.println("BananaPlant getItemDropped()");
        return (ModItems.Banana);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister parIIconRegister)
    {
          iIcon = new IIcon[maxGrowthStage+1];
          // seems that crops like to have 8 growth icons, but okay to repeat actual texture if you want
          // to make generic should loop to maxGrowthStage
          iIcon[0] = parIIconRegister.registerIcon(Reference.RESOURCE_PREFIX + "BananaPlant_0");
          iIcon[1] = parIIconRegister.registerIcon(Reference.RESOURCE_PREFIX + "BananaPlant_0");
          iIcon[2] = parIIconRegister.registerIcon(Reference.RESOURCE_PREFIX + "BananaPlant_1");
          iIcon[3] = parIIconRegister.registerIcon(Reference.RESOURCE_PREFIX + "BananaPlant_1");
          iIcon[4] = parIIconRegister.registerIcon(Reference.RESOURCE_PREFIX + "BananaPlant_2");
          iIcon[5] = parIIconRegister.registerIcon(Reference.RESOURCE_PREFIX + "BananaPlant_3");
          iIcon[6] = parIIconRegister.registerIcon(Reference.RESOURCE_PREFIX + "BananaPlant_3");
          iIcon[7] = parIIconRegister.registerIcon(Reference.RESOURCE_PREFIX + "BananaPlant_4");
    }
}

