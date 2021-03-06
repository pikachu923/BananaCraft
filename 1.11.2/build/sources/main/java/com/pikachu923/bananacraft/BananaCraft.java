package com.pikachu923.bananacraft;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.pikachu923.bananacraft.Entity.BananaBoss.BossEntity;
import com.pikachu923.bananacraft.Entity.BananaBoss.BossModel;
import com.pikachu923.bananacraft.Entity.BananaBoss.BossRender;
import com.pikachu923.bananacraft.Entity.Kuala.*;
import com.pikachu923.bananacraft.Handler.ConfigurationHandler;
import com.pikachu923.bananacraft.Recipes.Tier1Recipes;
import com.pikachu923.bananacraft.Recipes.Tier2Recipes;
import com.pikachu923.bananacraft.Recipes.Tier3Recipes;
import com.pikachu923.bananacraft.armor.ArmorInit;
import com.pikachu923.bananacraft.client.gui.GuiFactory;
import com.pikachu923.bananacraft.init.EntityInit;
import com.pikachu923.bananacraft.init.Other;
import com.pikachu923.bananacraft.init.Tier1Blocks;
import com.pikachu923.bananacraft.init.Tier1Items;
import com.pikachu923.bananacraft.init.Tier1Tools;
import com.pikachu923.bananacraft.init.Tier2Blocks;
import com.pikachu923.bananacraft.init.Tier2Items;
import com.pikachu923.bananacraft.init.Tier2Tools;
import com.pikachu923.bananacraft.init.Tier3Items;
import com.pikachu923.bananacraft.proxy.ClientProxy;
import com.pikachu923.bananacraft.proxy.IProxy;
import com.pikachu923.bananacraft.proxy.ServerProxy;
import com.pikachu923.bananacraft.reference.Reference;

import net.minecraftforge.common.MinecraftForge;

/**
 * Created by pikachu on 6/20/2016.
 * Main Class
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class BananaCraft {

	@Instance(Reference.MOD_ID)
	public static BananaCraft modInstance;

    @SidedProxy(clientSide = Reference.PROXYCLIENT, serverSide = Reference.PROXYSERVER)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        //ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        //FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        //FMLCommonHandler.instance().bus().register(new CraftingHandler());

        //Init
        Tier1Items.init();
        Tier1Blocks.init();
        //Tier1Tools.init();
        
        //Tier2Items.Init();
        Tier2Blocks.Init(); 
        /*&Tier2Tools.Init();
    
        Tier3Items.Init();
        //Tier3Tools.Init();
        
        ArmorInit.init();
        
        Tier1Recipes.init();
        Tier2Recipes.Init();
        Tier3Recipes.Init();
        //GemRecipes.Init();
        
        //DebugItems.Init();
        
        Other.init();
        
        //Gems.Init();
        
        
        proxy.registerTile();*/
        
        
    
    }
 
    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){
    	//Recipes.init();
    	
    	//@SideOnly(Side.CLIENT)
    	//proxy.registerRendering();
    	//EntityInit.Init();
    	//NetworkRegistry.INSTANCE.registerGuiHandler(modInstance, new GuiFactory());
    	proxy.ItemRender();
    }

    @Mod.EventHandler
public void PostInit(FMLPostInitializationEvent event){

    }
    
}
