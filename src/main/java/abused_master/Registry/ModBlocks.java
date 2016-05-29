package abused_master.Registry;

import abused_master.Block.BaseItemBlock;
import abused_master.Block.EnergyBank.EnergyBankT1;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks { 


	public static Block EnergyBankT1 = new EnergyBankT1("EnergyBankT1");
	
	public static void init()
	{

		/*
		 * Register Blocks
		 */
		
		GameRegistry.register(EnergyBankT1.setRegistryName("EnergyBankT1"));
		
		/*
		 * Register ItemBlocks
		 */
		
		GameRegistry.register(new BaseItemBlock(EnergyBankT1).setRegistryName(EnergyBankT1.getRegistryName()));


	}
	
}
	

