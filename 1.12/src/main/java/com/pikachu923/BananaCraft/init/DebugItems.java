package com.pikachu923.BananaCraft.init;

import com.pikachu923.BananaCraft.items.DebugGem;
import com.pikachu923.BananaCraft.items.DebugSword;
import com.pikachu923.BananaCraft.items.SamItem;
import com.pikachu923.BananaCraft.utility.BananaRegistry;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class DebugItems {
	public static ToolMaterial Debug = EnumHelper.addToolMaterial("Debug", 2, 700,  7.0F,  12904F, 12);
	public static final DebugSword DebugSword = new DebugSword("DebugSword");
	public static final DebugGem DebugGem = new DebugGem("DebugGem");
	public static final SamItem SamItem = new SamItem("SamItem");
	
	public static void Init() {
		BananaRegistry.registerItem(DebugSword, "DebugSword");
		BananaRegistry.registerItem(DebugGem, "DebugGem");
		BananaRegistry.registerItem(SamItem, "SamItem");
		
	}
}
