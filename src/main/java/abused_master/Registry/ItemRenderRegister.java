package abused_master.Registry;

import abused_master.Info;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderRegister {

	public static String modid = Info.MODID;

	public static void registerItemRenderer() {
		
		reg(ModItems.Wrench, 0, "inventory");
		
	}
	
	public static void reg(Item item, int meta, String variants) {
	     Minecraft.getMinecraft()
	          .getRenderItem()
	          .getItemModelMesher()
	          .register(item, meta, new ModelResourceLocation(item.getRegistryName(), variants));
	}
}
