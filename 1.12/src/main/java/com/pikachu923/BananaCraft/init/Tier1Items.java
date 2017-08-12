package com.pikachu923.BananaCraft.init;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;

//import com.pikachu923.BananaCraft.Entity.Kuala.*;
//import com.pikachu923.BananaCraft.Items1.BananaIngot;
import com.pikachu923.BananaCraft.Items1.BananaLifeCore;
import com.pikachu923.BananaCraft.Items1.ReinBanana;
import com.pikachu923.BananaCraft.items.*;
import com.pikachu923.BananaCraft.reference.Reference;
import com.pikachu923.BananaCraft.utility.BananaRegistry;

/**
 * Created by pikac on 6/21/2016.
 */
//@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class Tier1Items {
    public static final ItemWrapper ReinBanana = new ReinBanana("ReinBanana");
    //public static final BananaIngot BananaIngot = new BananaIngot("BananaIngot");
    public static final GoldenBanana GoldenBanana = new GoldenBanana("GoldenBanana", 10, new PotionEffect(MobEffects.REGENERATION, 1, 10), 100F);
    public static final BananaBread BananaBread = new BananaBread("BananaBread", 10, 2.5F);
    public static final BananaLifeCore BananaLifeCore = new BananaLifeCore("BananaLifeCore");
    public static final ItemWrapper BananaNugget = new BananaNugget("BananaNugget");
    public static final ItemWrapper BananaDough = new BananaDough("BananaDough");
    public static final ItemWrapper BananaPowder = new BananaPowder("BananaPowder");
    //public static final Jumps JumpWings = new Jumps("JumpWings");

    public static final Banana Banana = new Banana(2, 2, "BananaPlant");
	
    
    public static void init() {
    	System.out.println("Registering");
        BananaRegistry.registerItem(ReinBanana, "ReinBanana");
        BananaRegistry.registerItem(Banana, "Banana");
        //GameRegistry.registerItem(BananaIngot, "BananaIngot");
        BananaRegistry.registerItem(GoldenBanana, "GoldenBanana");
        BananaRegistry.registerItem(BananaBread, "BananaBread");
        BananaRegistry.registerItem(BananaLifeCore, "BananaLifeCore");
        BananaRegistry.registerItem(BananaNugget, "BananaNugger");
        BananaRegistry.registerItem(BananaDough, "BananaDough"); 
        BananaRegistry.registerItem(BananaPowder, "BananaPowder");
        //GameRegistry.registerItem(JumpWings, "JumpWings");
        System.out.println("Done Registring");
    }
}

