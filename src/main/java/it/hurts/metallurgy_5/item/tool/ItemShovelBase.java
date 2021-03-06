package it.hurts.metallurgy_5.item.tool;

import it.hurts.metallurgy_5.Metallurgy_5;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/*************************************************
 * Author: Davoleo
 * Date: 20/08/2018
 * Hour: 13.26
 * Project: Metallurgy 5
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class ItemShovelBase extends ItemSpade {

    private String name;

    public ItemShovelBase(ToolMaterial material, String name)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        this.name = name;
        setCreativeTab(Metallurgy_5.tabTool);
    }

    @SideOnly(Side.CLIENT)
    public void registerItemModel(Item item, int meta)
    {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Metallurgy_5.MODID + ":tool/" + name, "inventory"));
    }

}
