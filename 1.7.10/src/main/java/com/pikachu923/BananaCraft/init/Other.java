package com.pikachu923.BananaCraft.init;

import java.util.Random;

import org.apache.logging.log4j.Level;

import com.pikachu923.BananaCraft.Projectiles.BananaBomb0.*;
import com.pikachu923.BananaCraft.Projectiles.BananaBomb1.*;
import com.pikachu923.BananaCraft.Projectiles.BananaBomb2.*;
import com.pikachu923.BananaCraft.Projectiles.BananaBomb3.*;
import com.pikachu923.BananaCraft.items.ItemWrapper;
import com.pikachu923.BananaCraft.reference.Reference;
import com.pikachu923.BananaCraft.utility.LogHelper;
import com.pikachu923.BananaCraft.Gen.*;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.DamageSource;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;


import com.pikachu923.BananaCraft.items.ItemWrapper;

public class Other{
	public static final BananaBomb BananaBomb0 = new BananaBomb("BananaBomb", 5F); 
	public static final BananaBomb1 BananaBomb1 = new BananaBomb1("BananaBomb1", 7.5F); 
	public static final BananaBomb2 BananaBomb2 = new BananaBomb2("BananaBomb2", 10F); 
	public static final BananaBomb3 BananaBomb3 = new BananaBomb3("BananaBomb3", 12.5F); 
	public static final DamageSource Boss = (new DamageSource("Boss"));
	public static final BiomeGenBase BananaBiome = new BananaBiomeGen(30);
	
public static void init() {
		Tier1Items.BananaLifeCore.setContainerItem(Tier1Items.BananaLifeCore);
		Tier1Items.BananaLifeCore.setMaxStackSize(1);
		Tier3Items.Purifier.setContainerItem(Tier3Items.Purifier).setMaxStackSize(1);
		
		GameRegistry.registerWorldGenerator(new OreGen(), 0);
		
		
		GameRegistry.registerItem(BananaBomb0, "BananaBomb");
		GameRegistry.registerItem(BananaBomb1, "BananaBomb1");
		GameRegistry.registerItem(BananaBomb2, "BananaBomb2");
		GameRegistry.registerItem(BananaBomb3, "BananaBomb3");
		
		EntityRegistry.registerGlobalEntityID(EntityBananaBomb.class, "BananaBomb", EntityRegistry.findGlobalUniqueEntityId());
	    EntityRegistry.registerModEntity(EntityBananaBomb.class, "BananaBomb", 2, Reference.MOD_ID, 256, 1, true);
	    
	    EntityRegistry.registerGlobalEntityID(EntityBananaBomb1.class, "BananaBomb1", EntityRegistry.findGlobalUniqueEntityId());
	    EntityRegistry.registerModEntity(EntityBananaBomb1.class, "BananaBomb1", 3, Reference.MOD_ID, 256, 1, true);
	    
	    EntityRegistry.registerGlobalEntityID(EntityBananaBomb2.class, "BananaBomb2", EntityRegistry.findGlobalUniqueEntityId());
	    EntityRegistry.registerModEntity(EntityBananaBomb2.class, "BananaBomb2", 4, Reference.MOD_ID, 256, 1, true);
	    
	    EntityRegistry.registerGlobalEntityID(EntityBananaBomb3.class, "BananaBomb3", EntityRegistry.findGlobalUniqueEntityId());
	    EntityRegistry.registerModEntity(EntityBananaBomb3.class, "BananaBomb3", 5, Reference.MOD_ID, 256, 1, true);
	    
	    
	    
	    //BiomeManager.addSpawnBiome(BananaBiome);
	    //BiomeDictionary.registerBiomeType(BananaBiome, BiomeDictionary.Type.PLAINS);
	    //LogHelper.Log(BiomeManager.getBiomes(BiomeType.WARM).toString());
	    BiomeManager.addBiome((BiomeManager.BiomeType)BiomeManager.BiomeType.WARM, (BiomeManager.BiomeEntry)new BiomeManager.BiomeEntry(BananaBiome, 100));
	}
}
