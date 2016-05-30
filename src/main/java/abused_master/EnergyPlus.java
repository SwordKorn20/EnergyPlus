package abused_master;

import abused_master.Proxy.CommonProxy;
import abused_master.Registry.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Info.MODID, name = Info.MODNAME, version = Info.VERSION)
public class EnergyPlus {

	@Instance
    public static EnergyPlus instance = new EnergyPlus();

	@SidedProxy(clientSide="abused_master.Proxy.ClientProxy", serverSide="abused_master.Proxy.ServerProxy")
	public static CommonProxy proxy;
	
		
	 @EventHandler
	    public void preInit(FMLPreInitializationEvent e) 
	    {
		 this.proxy.preInit(e);
		 		 
	    }

	    @EventHandler
	    public void init(FMLInitializationEvent e) 
	    {
	        this.proxy.init(e);
	    	
	    }

	    @EventHandler
	    public void postInit(FMLPostInitializationEvent e) 
	    {
	        this.proxy.postInit(e);
	    	
	    }
	    
	    
	    public static CreativeTabs EnergyPlus = new CreativeTabs("EnergyPlus")
	    {
	        @Override
	        public Item getTabIconItem()
	        {
	            return ModItems.Wrench;
	        }
	        
	    };
	
	
	
}
