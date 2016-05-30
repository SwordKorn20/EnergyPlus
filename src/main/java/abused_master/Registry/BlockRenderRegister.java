package abused_master.Registry;

import abused_master.Block.TE.TileEnergyBankT1;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class BlockRenderRegister {

	
	public static void registerBlockRenderer() {

		reg(ModBlocks.EnergyBankT1);
		reg(ModBlocks.EnergyBankT2);
		reg(ModBlocks.EnergyBankT3);

	}
	
	  public static void reg(Block block) {
	        Item item = Item.getItemFromBlock(block);

	        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	                .register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
   }
}
