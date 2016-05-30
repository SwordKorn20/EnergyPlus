package abused_master.Registry;

import abused_master.Item.Wrench;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
		
	public static Item Wrench= new Wrench();
	
	public static void init() {
	
		GameRegistry.register(Wrench.setRegistryName("Wrench"));

    }

}
