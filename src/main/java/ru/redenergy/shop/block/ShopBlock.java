package ru.redenergy.shop.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import ru.redenergy.shop.tile.ShopTile;

public class ShopBlock extends BlockContainer {

    public ShopBlock(Material material) {
        super(material);
        setCreativeTab(CreativeTabs.tabDecorations);
        setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new ShopTile();
    }

    @Override
    public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
        return Blocks.stone_slab.getIcon(p_149691_1_, p_149691_2_);
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }
}
