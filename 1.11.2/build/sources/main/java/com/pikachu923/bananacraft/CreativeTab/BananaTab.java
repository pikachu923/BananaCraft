package com.pikachu923.bananacraft.CreativeTab;

import com.pikachu923.bananacraft.init.Tier1Items;
import com.pikachu923.bananacraft.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BananaTab {
public static final CreativeTabs BananaTab = new CreativeTabs(Reference.MOD_ID){
	@Override
	public ItemStack getTabIconItem(){
		return new ItemStack(Tier1Items.Banana);
	}
	public String getTranslatedTabLable(){
		return "BananaCraft";
	}
};
}
