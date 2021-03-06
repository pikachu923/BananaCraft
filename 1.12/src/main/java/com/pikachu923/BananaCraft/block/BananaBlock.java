package com.pikachu923.BananaCraft.block;

        import com.pikachu923.BananaCraft.Items1.BananaLifeCore;
import com.pikachu923.BananaCraft.init.Tier1Items;
import com.pikachu923.BananaCraft.init.Tier2Blocks;
import com.pikachu923.BananaCraft.reference.Reference;
import com.pikachu923.BananaCraft.utility.LogHelper;
import com.pikachu923.BananaCraft.utility.func;

import cpw.mods.fml.relauncher.Side;
        import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

public class BananaBlock extends Block{
    String unlocalName;
    String Texture;
    ItemStack item;
    Block block;
    Block block2;
    public BananaBlock(String unlocalName){
        super(Material.rock);
        this.setBlockName(Reference.RESOURCE_PREFIX + unlocalName);
        Texture = Reference.RESOURCE_PREFIX + unlocalName;
        this.setCreativeTab(Reference.CreativeTab);
        setHardness(3.0F);
		setResistance(5.0F);
		setStepSound(soundTypeStone);
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        this.blockIcon = iconRegister.registerIcon(Texture);
    }
    
    public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player) {
    	item = player.inventory.getCurrentItem();
    	block = world.getBlock(x, y, z);
    	block2 = world.getBlock(x, y + 1, z);
    	if (player.getCurrentEquippedItem() != null) {
    		if (item.getItem() instanceof BananaLifeCore && block instanceof BananaBlock && block2 instanceof BananaBlock) {
    			world.playSoundAtEntity(player, "random.explode" , 1F, 0.5F);
    			world.spawnParticle("hugeexplosion", x, y + 1, z, 0.0D, 0.0D, 0.0D);
    			world.setBlock(x, y, z, Tier2Blocks.AwakenedBlock);
    			world.setBlock(x, y + 1, z, Blocks.air);
    			item.damageItem(2, player);
    			if (item.getItemDamage() == 0) {
    				func.removeItem(player, item);
    			}
    		}
    	}
    }
}
