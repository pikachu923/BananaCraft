package com.pikachu923.bananacraft.proxy;

import com.pikachu923.bananacraft.init.Tier1Items;

import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by pikac on 6/20/2016.
 */
//@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {
	 public World worldObj;

	//@Override
	public void registerTile() {
	}
	
	//@SideOnly(Side.CLIENT)
	public void registerRendering() {
		//if(!this.worldObj.isRemote) {
		//RenderingRegistry.registerEntityRenderingHandler(EntityAbe.class, new RenderAbe(new  ModelAbe(), 0.5F));
		//@SideOnly(Side.CLIENT)
		/*RenderingRegistry.registerEntityRenderingHandler(BossEntity.class, new BossRender(new BossModel(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBananaCreeper.class, new RenderCreeper());
		RenderingRegistry.registerEntityRenderingHandler(EntityBananaBomb.class, new RenderBananaBomb(Other.BananaBomb0));
		RenderingRegistry.registerEntityRenderingHandler(EntityBananaBomb1.class, new RenderBananaBomb1(Other.BananaBomb1));
		RenderingRegistry.registerEntityRenderingHandler(EntityBananaBomb2.class, new RenderBananaBomb2(Other.BananaBomb2));
		RenderingRegistry.registerEntityRenderingHandler(EntityBananaBomb3.class, new RenderBananaBomb3(Other.BananaBomb3));
		//}*/
	}
	
	public ClientProxy getClientProxy() {
		return this;
	}

	@Override
	public void ItemRender() {
		Tier1Items.Render();
	}
	
}
