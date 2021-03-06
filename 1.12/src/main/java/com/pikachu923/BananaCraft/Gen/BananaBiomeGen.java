package com.pikachu923.BananaCraft.Gen;

import com.pikachu923.BananaCraft.init.Tier1Blocks;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import com.pikachu923.BananaCraft.Entity.BananaCreeper.*;

public class BananaBiomeGen extends BiomeGenBase {

	public BananaBiomeGen(int p_i1971_1_) {
		super(p_i1971_1_);
		this.setBiomeName("The Banana Biome");
        
        this.topBlock = Tier1Blocks.BananaGrass;
        this.fillerBlock = Blocks.dirt;
        
        
        this.theBiomeDecorator.flowersPerChunk = 5;
        this.theBiomeDecorator.treesPerChunk = 5;

        //this.spawnableCreatureList.add(new SpawnListEntry(EntitySnowman.class, 25, 4, 8));
        this.spawnableMonsterList.add(new SpawnListEntry(EntityBananaCreeper.class, 20, 4, 8));

        this.setTemperatureRainfall(0.5F, 1.5F);
	}
}