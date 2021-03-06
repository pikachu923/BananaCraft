package com.pikachu923.bananacraft.init;

import net.minecraftforge.fml.common.registry.GameRegistry;

import com.pikachu923.bananacraft.TileEntity.TileIngotizer;
import com.pikachu923.bananacraft.block.BananaBlock;
import com.pikachu923.bananacraft.block.BananaGrass;
import com.pikachu923.bananacraft.block.BananaIngotizer;
import com.pikachu923.bananacraft.block.BananaOre;
import com.pikachu923.bananacraft.block.BananaPillar;
import com.pikachu923.bananacraft.block.BananaPlant;
import com.pikachu923.bananacraft.block.BananaSlab;
import com.pikachu923.bananacraft.block.BananaStairs;
import com.pikachu923.bananacraft.block.BananaStone;
import com.pikachu923.bananacraft.block.BlockWrapper;
import com.pikachu923.bananacraft.reference.Reference;
import com.pikachu923.bananacraft.utility.Plants;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class Tier1Blocks {
	public static final Block BananaBlock = new BananaBlock("BananaBlock");
	public static final BlockWrapper BananaOre = new BananaOre("BananaOre");
	public static final Block BananaStone = new BananaStone("BananaStone");
	/*public static final BlockWrapper BananaGrass = new BananaGrass("BananaGrass");
	public static final Plants BananaPlant = new BananaPlant();
	public static final BlockWrapper BananaPillar = new BananaPillar("BananaPillar");
	public static final BananaSlab BananaSlab = new BananaSlab(Material.ROCK, "BananaSlab", false);
	public static final BananaSlab BananaDoubleSlab = new BananaSlab(Material.ROCK, "BananaDoubleSlab", true);
	public static final BananaStairs BananaStairs = new BananaStairs(BananaBlock, 0, "BananaStairs");
	
	public static final Block BananaIngotizer = new BananaIngotizer(false, "BananaIngotizer").setCreativeTab(Reference.CreativeTab);
	public static final Block BananaIngotizerActive = new BananaIngotizer(true, "BananaIngotizer");
	*/
	

public static void init() {
    GameRegistry.register(BananaBlock);
    GameRegistry.register(BananaOre);
    GameRegistry.register(BananaStone);
    //GameRegistry.registerBlock(BananaGrass, "BananaGrass");
    //GameRegistry.registerBlock(BananaPlant, "BananaPlant");
    //GameRegistry.registerBlock(BananaPillar, "BananaPillar");
    //GameRegistry.registerBlock(BananaSlab, "BananaSlab");
    //GameRegistry.registerBlock(BananaDoubleSlab, "BananaDoubleSlab");
    //GameRegistry.registerBlock(BananaStairs, "BananaStairs");
    //GameRegistry.registerBlock(BananaIngotizer, "BananaIngotizer");
    //GameRegistry.registerTileEntity(TileIngotizer.class, "BananaIngotizer");
    //GameRegistry.registerBlock(BananaIngotizerActive, "BananaIngotizerActive");
	}
}