package ru.redenergy.shop.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderMagmaCube;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class ShopRenderer extends TileEntitySpecialRenderer {


    @Override
    public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float ticks) {
        Tessellator tessellator = Tessellator.instance;
        bindTexture(TextureMap.locationBlocksTexture);
        GL11.glPushMatrix();
        EntityItem displayItem = new EntityItem(tile.getWorldObj(), x, y, z, new ItemStack(Items.diamond));
        displayItem.hoverStart = 0.0F;


        RenderItem.renderInFrame = true;
        GL11.glTranslatef((float)x + 0.5F, (float)y + 1.02F, (float)z + 0.7F);
        GL11.glRotatef(180, 0, 1, 0);
        GL11.glRotatef(45, 1, 0, 0);
        RenderManager.instance.renderEntityWithPosYaw(displayItem, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
        RenderItem.renderInFrame = false;

        GL11.glPopMatrix();
    }
}
