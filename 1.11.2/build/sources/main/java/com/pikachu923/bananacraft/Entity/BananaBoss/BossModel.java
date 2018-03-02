package com.pikachu923.bananacraft.Entity.BananaBoss;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class BossModel extends ModelBase
{
  //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
  
  public BossModel()
  {
    textureWidth = 68;
    textureHeight = 44;
    
      head = new ModelRenderer(this, 16, 0);
      head.addBox(-4F, -8F, -4F, 8, 8, 8);
      head.setRotationPoint(0F, 0F, 0F);
      head.setTextureSize(68, 44);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 21, 18);
      body.addBox(-4F, 0F, -2F, 8, 19, 4);
      body.setRotationPoint(0F, 0F, 0F);
      body.setTextureSize(68, 44);
      body.mirror = true;
      setRotation(body, 0.3717861F, 0F, 0F);
      rightarm = new ModelRenderer(this, 2, 18);
      rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
      rightarm.setRotationPoint(-5F, 2F, 0F);
      rightarm.setTextureSize(68, 44);
      rightarm.mirror = true;
      setRotation(rightarm, -1.375609F, 0.1487144F, -0.2230717F);
      leftarm = new ModelRenderer(this, 49, 18);
      leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
      leftarm.setRotationPoint(5F, 2F, 0F);
      leftarm.setTextureSize(68, 44);
      leftarm.mirror = true;
      setRotation(leftarm, -1.375609F, -0.1487144F, 0.2230717F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    head.render(f5);
    body.render(f5);
    rightarm.render(f5);
    leftarm.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
  {
      /**
       * Arm Oscillations
       */
      super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
      float f6 = MathHelper.sin(this.onGround * (float)Math.PI);
      float f7 = MathHelper.sin((1.0F - (1.0F - this.onGround) * (1.0F - this.onGround)) * (float)Math.PI);
      this.rightarm.rotateAngleZ = 0.0F;
      this.leftarm.rotateAngleZ = 0.0F;
      this.rightarm.rotateAngleY = -(0.1F - f6 * 0.6F);
      this.leftarm.rotateAngleY = 0.1F - f6 * 0.6F;
      this.rightarm.rotateAngleX = -((float)Math.PI / 2F);
      this.leftarm.rotateAngleX = -((float)Math.PI / 2F);
      this.rightarm.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
      this.leftarm.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
      this.rightarm.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
      this.leftarm.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
      this.rightarm.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
      this.leftarm.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;
      
      /**
       * FullBody Floating
       */
      float oscillate = MathHelper.cos(par3 * 0.09F) * 0.05F;
      this.head.rotationPointY += oscillate;
      this.body.rotationPointY += oscillate;
      this.rightarm.rotationPointY += oscillate;
      this.leftarm.rotationPointY += oscillate;
              
  }

}