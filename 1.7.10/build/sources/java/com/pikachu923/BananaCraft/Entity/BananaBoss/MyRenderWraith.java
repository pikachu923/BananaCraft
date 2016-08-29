package com.pikachu923.BananaCraft.Entity.BananaBoss;

import com.pikachu923.BananaCraft.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.util.ResourceLocation;

public class MyRenderWraith extends RenderLiving  {

    public MyRenderWraith(ModelBase par1ModelBase, float par2) {
        super(par1ModelBase, par2);
    }   

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return new ResourceLocation(Reference.RESOURCE_PREFIX + "textures/entity/BananaBoss.png");
        
       
    }

}
