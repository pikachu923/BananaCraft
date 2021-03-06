package com.pikachu923.BananaCraft.Recipes;

import com.pikachu923.BananaCraft.Handler.IngotizerRecipes;
import com.pikachu923.BananaCraft.armor.ArmorInit;
import com.pikachu923.BananaCraft.init.Tier1Items;
import com.pikachu923.BananaCraft.init.Tier2Items;
import com.pikachu923.BananaCraft.init.Tier2Tools;
import com.pikachu923.BananaCraft.init.Tier3Items;
import com.pikachu923.BananaCraft.init.Tier3Tools;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class Tier3Recipes {
	//public static final IngotizerRecipes Recipe1 = new IngotizerRecipes(Tier3Items.CorroptFragment, new ItemStack(Tier1Items.BananaArmorCore), 0F);
	public static void Init() {
		//Items
		GameRegistry.addRecipe(new ItemStack(Tier3Items.CorruptCore), " C ", "CDC", " C ", 'C', new ItemStack(Tier3Items.CorruptIngot), 'D', new ItemStack(Items.diamond));
		GameRegistry.addShapelessRecipe(new ItemStack(Tier3Items.PurifiedBanana), new ItemStack(Tier3Items.CorruptBanana), new ItemStack(Tier3Items.Purifier, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(Tier3Items.Purifier), new ItemStack(Tier1Items.BananaLifeCore, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Items.water_bucket));
		GameRegistry.addShapelessRecipe(new ItemStack(Tier3Items.CorruptBanana), new ItemStack(Tier3Items.CorruptCore, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Tier2Items.AwakenedBanana));
		//Tools
		GameRegistry.addRecipe(new ItemStack(Tier3Tools.CorruptPickaxe), "AAA", " S ", " S ", 'S', new ItemStack(Items.stick), 'A', new ItemStack(Tier3Items.CorruptBanana));
		GameRegistry.addRecipe(new ItemStack(Tier3Tools.CorruptAxe), "AA", "AS", " S", 'S', new ItemStack(Items.stick), 'A', new ItemStack(Tier3Items.CorruptBanana));
		GameRegistry.addRecipe(new ItemStack(Tier3Tools.CorruptHoe), "AA ", " S ", " S ", 'S', new ItemStack(Items.stick), 'A', new ItemStack(Tier3Items.CorruptBanana));
		GameRegistry.addRecipe(new ItemStack(Tier3Tools.CorruptShovel), "A", "S", "S", 'S', new ItemStack(Items.stick), 'A', new ItemStack(Tier3Items.CorruptBanana));
		GameRegistry.addRecipe(new ItemStack(Tier3Tools.CorruptSword), "A", "A", "S", 'S', new ItemStack(Items.stick), 'A', new ItemStack(Tier3Items.CorruptBanana));
		//Armor
		GameRegistry.addRecipe(new ItemStack(ArmorInit.CorruptHelmet), "BBB", "B B", 'B', new ItemStack(Tier3Items.CorruptIngot));
		GameRegistry.addRecipe(new ItemStack(ArmorInit.CorruptChestplate), "B B", "BBB", "BBB", 'B', new ItemStack(Tier3Items.CorruptIngot));
		GameRegistry.addRecipe(new ItemStack(ArmorInit.CorruptLeggings), "BBB", "B B", "B B", 'B', new ItemStack(Tier3Items.CorruptIngot));
		GameRegistry.addRecipe(new ItemStack(ArmorInit.CorruptBoots), "B B", "B B", 'B', new ItemStack(Tier3Items.CorruptIngot));
	}
}