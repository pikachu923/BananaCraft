/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.registry.GameRegistry
 *  net.minecraft.item.Item
 *  net.minecraft.item.Item$ToolMaterial
 *  net.minecraft.item.ItemPickaxe
 *  net.minecraft.item.ItemSword
 *  net.minecraftforge.common.util.EnumHelper
 */
package com.pikachu923.BananaCraft.init;

import com.pikachu923.BananaCraft.Items2.AwakenedAxe;
import com.pikachu923.BananaCraft.Items2.AwakenedHoe;
import com.pikachu923.BananaCraft.Items2.AwakenedPickaxe;
import com.pikachu923.BananaCraft.Items2.AwakenedShovel;
import com.pikachu923.BananaCraft.Items2.AwakenedSword;
import com.pikachu923.BananaCraft.Items2.BananaGun;
import com.pikachu923.BananaCraft.utility.BananaRegistry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class Tier2Tools {
    public static Item.ToolMaterial AwakenedBanana = EnumHelper.addToolMaterial("AwakenedBanana", 4, 2222, 10.0F, 5, 15);
    public static ItemSword AwakenedSword = new AwakenedSword("AwakenedSword");
    public static ItemPickaxe AwakenedPickaxe = new AwakenedPickaxe("AwakenedPickaxe");
    public static ItemAxe AwakenedAxe = new AwakenedAxe("AwakenedAxe");
    public static ItemSpade AwakenedShovel = new AwakenedShovel("AwakenedShovel");
    public static ItemHoe AwakenedHoe = new AwakenedHoe("AwakenedHoe");
    public static final ItemBow BananaGun = new BananaGun("BananaGun");

    public static void Init() {
    	BananaRegistry.registerItem((Item)AwakenedSword, (String)"AwakenedSword");
    	BananaRegistry.registerItem((Item)AwakenedPickaxe, (String)"AwakenedPickaxe");
    	BananaRegistry.registerItem(AwakenedAxe, "AwakenedAxe");
    	BananaRegistry.registerItem(AwakenedShovel, "AwakenedShovel");
    	BananaRegistry.registerItem(AwakenedHoe, "AwakenedHoe");
    	BananaRegistry.registerItem(BananaGun, "BananaGun");
    }
}

