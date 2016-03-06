package ru.redenergy.shop;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import ru.redenergy.shop.block.ShopBlock;
import ru.redenergy.shop.render.ShopRenderer;
import ru.redenergy.shop.tile.ShopTile;

@Mod(modid = "shop")
public class Shop {

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        GameRegistry.registerBlock(new ShopBlock(Material.cloth), "shopBlock");
        GameRegistry.registerTileEntity(ShopTile.class, "shopTile");
        ClientRegistry.bindTileEntitySpecialRenderer(ShopTile.class, new ShopRenderer());
    }
}
