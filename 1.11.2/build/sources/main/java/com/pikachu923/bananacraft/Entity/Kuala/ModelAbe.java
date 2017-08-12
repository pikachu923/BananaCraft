package com.pikachu923.bananacraft.Entity.Kuala;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelAbe extends ModelBase
{
  //fields
    ModelRenderer rHand;
    ModelRenderer lHand;
    ModelRenderer head;
    ModelRenderer Body;
    ModelRenderer rLeg;
    ModelRenderer lLeg;
    ModelRenderer rArm;
    ModelRenderer lArm;
    ModelRenderer Nose;
  
  public ModelAbe()
  {
    textureWidth = 78;
    textureHeight = 54;
    
      rHand = new ModelRenderer(this, 13, 35);
      rHand.addBox(-2.5F, 8F, -1.5F, 3, 3, 3);
      rHand.setRotationPoint(-5F, 13F, -4F);
      rHand.setTextureSize(78, 54);
      rHand.mirror = true;
      setRotation(rHand, 0F, 0F, 0F);
      lHand = new ModelRenderer(this, 52, 35);
      lHand.addBox(-0.5F, 8F, -1.5F, 3, 3, 3);
      lHand.setRotationPoint(2.5F, 13F, -4F);
      lHand.setTextureSize(78, 54);
      lHand.mirror = true;
      setRotation(lHand, 0F, 0F, 0F);
      head = new ModelRenderer(this, 30, 7);
      head.addBox(-3F, -3F, -2F, 6, 6, 4);
      head.setRotationPoint(-1F, 11.5F, -7F);
      head.setTextureSize(78, 54);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 26, 19);
      Body.addBox(-4F, -2F, -3F, 8, 9, 6);
      Body.setRotationPoint(-1F, 14F, -4F);
      Body.setTextureSize(78, 54);
      Body.mirror = true;
      setRotation(Body, 0.7900455F, 0F, 0F);
      rLeg = new ModelRenderer(this, 30, 40);
      rLeg.addBox(-1F, 0F, -1F, 2, 7, 2);
      rLeg.setRotationPoint(-2.5F, 17F, 1F);
      rLeg.setTextureSize(78, 54);
      rLeg.mirror = true;
      setRotation(rLeg, 0F, 0F, 0F);
      lLeg = new ModelRenderer(this, 40, 40);
      lLeg.addBox(-1F, 0F, -1F, 2, 7, 2);
      lLeg.setRotationPoint(0.5F, 17F, 1F);
      lLeg.setTextureSize(78, 54);
      lLeg.mirror = true;
      setRotation(lLeg, 0F, 0F, 0F);
      rArm = new ModelRenderer(this, 16, 19);
      rArm.addBox(-2F, -1F, -1F, 2, 12, 2);
      rArm.setRotationPoint(-5F, 13F, -4F);
      rArm.setTextureSize(78, 54);
      rArm.mirror = true;
      setRotation(rArm, 0F, 0F, 0F);
      lArm = new ModelRenderer(this, 55, 19);
      lArm.addBox(0F, -1F, -1F, 2, 12, 2);
      lArm.setRotationPoint(2.5F, 13F, -4F);
      lArm.setTextureSize(78, 54);
      lArm.mirror = true;
      setRotation(lArm, 0F, 0F, 0F);
      Nose = new ModelRenderer(this, 36, 1);
      Nose.addBox(-1.5F, 0F, -3F, 3, 2, 1);
      Nose.setRotationPoint(-1F, 12.5F, -7F);
      Nose.setTextureSize(78, 54);
      Nose.mirror = true;
      setRotation(Nose, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    rHand.render(f5);
    lHand.render(f5);
    head.render(f5);
    Body.render(f5);
    rLeg.render(f5);
    lLeg.render(f5);
    rArm.render(f5);
    lArm.render(f5);
    Nose.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
  {
      this.head.rotateAngleY = par4 / (180F / (float)Math.PI);
      this.head.rotateAngleX = par5 / (180F / (float)Math.PI);
      
      this.rArm.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 2.0F * par2 * 0.5F;
      this.lArm.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 2.0F * par2 * 0.5F;
      this.rHand.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 2.0F * par2 * 0.5F;
      this.lHand.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 2.0F * par2 * 0.5F;
      
      this.rLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      this.lLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      this.rLeg.rotateAngleY = 0.0F;
      this.lLeg.rotateAngleY = 0.0F;
  }

}
