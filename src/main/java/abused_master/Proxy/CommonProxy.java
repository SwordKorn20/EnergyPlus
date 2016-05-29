package abused_master.Proxy;

import abused_master.Registry.ModBlocks;
import abused_master.Registry.ModCrafting;
import abused_master.Registry.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		 
		 ModItems.init();
		 ModBlocks.init();;
		 ModCrafting.initCrafting();

	    }

	    public void init(FMLInitializationEvent e) {
	    	
	        //NetworkRegistry.INSTANCE.registerGuiHandler(EnergyPlus.instance, new ModGuiHandler());
	        //GameRegistry.registerWorldGenerator(new EnergyPlusGeneration(), 0);

	    }

	    public void postInit(FMLPostInitializationEvent e) {

	    }
	
}
