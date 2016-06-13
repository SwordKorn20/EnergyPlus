package abused_master.Registry;

import abused_master.Block.BaseItemBlock;
import abused_master.Block.EnergyBank.EnergyBankT1;
import abused_master.Block.EnergyBank.EnergyBankT2;
import abused_master.Block.EnergyBank.EnergyBankT3;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks { 


	public static Block EnergyBankT1 = new EnergyBankT1("EnergyBankT1");
	public static Block EnergyBankT2 = new EnergyBankT2("EnergyBankT2");
	public static Block EnergyBankT3 = new EnergyBankT3("EnergyBankT3");
	
	public static void init()
	{

		/*
		 * Register Blocks
		 */
		
		GameRegistry.register(EnergyBankT1.setRegistryName("EnergyBankT1"));
		GameRegistry.register(EnergyBankT2.setRegistryName("EnergyBankT2"));
		GameRegistry.register(EnergyBankT3.setRegistryName("EnergyBankT3"));

		/*
		 * Register ItemBlocks
		 */
		
		GameRegistry.register(new BaseItemBlock(EnergyBankT1).setRegistryName(EnergyBankT1.getRegistryName()));
		GameRegistry.register(new BaseItemBlock(EnergyBankT2).setRegistryName(EnergyBankT2.getRegistryName()));
		GameRegistry.register(new BaseItemBlock(EnergyBankT3).setRegistryName(EnergyBankT3.getRegistryName()));


	}
	
}
	

