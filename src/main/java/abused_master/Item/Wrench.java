package abused_master.Item;

import abused_master.EnergyPlus;
import buildcraft.api.tools.IToolWrench;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Optional;
import net.minecraftforge.fml.common.Optional.Interface;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Wrench extends Item implements IToolWrench {

	public Wrench() {
		super();
		this.setMaxStackSize(1);
		this.setCreativeTab(EnergyPlus.EnergyPlus);
		this.setUnlocalizedName("Wrench");
	}
/*	            
	@Override
	public EnumActionResult onItemUseFirst(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ, EnumHand hand) {
	    final IBlockState blockState = world.getBlockState(pos);
	    IBlockState bs = blockState;
	    Block block = bs.getBlock();
	    boolean ret = false;
	    if (block != null) {
	    	
	    	  RightClickBlock e = new RightClickBlock(player, hand, player.getHeldItem(hand), pos,side, new Vec3d(hitX, hitY, hitZ));
		      if (MinecraftForge.EVENT_BUS.post(e) || e.getResult() == Result.DENY || e.getUseBlock() == Result.DENY || e.getUseItem() == Result.DENY) {
			        return EnumActionResult.PASS;
		      }
		      if (!player.isSneaking() && block.rotateBlock(world, pos, side)) {
			        if (block == Blocks.CHEST) {
			        	 TileEntityChest te = (TileEntityChest) world.getTileEntity(pos);
				          if (te != null && (te.adjacentChestXNeg != null || te.adjacentChestXPos != null || te.adjacentChestZNeg != null || te.adjacentChestZPos != null)) {
				            // Render master is always the chest to the negative direction
				            TileEntityChest masterChest = te.adjacentChestXNeg == null && te.adjacentChestZNeg == null ? te : te.adjacentChestXNeg == null ? te.adjacentChestZNeg: te.adjacentChestXNeg;
				            if (masterChest != te) {
				            	
				            }
				            	
				            }
				            	
				            }
			        	
			        }  
		      }
	    return ret ? EnumActionResult.SUCCESS: EnumActionResult.PASS;	    	
	    }
		      
	*/	      
	        

	@Override
	public boolean canWrench(EntityPlayer arg0, BlockPos arg1) {
		return true;
	}

	@Override
	public boolean canWrench(EntityPlayer arg0, Entity arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void wrenchUsed(EntityPlayer arg0, BlockPos arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void wrenchUsed(EntityPlayer arg0, Entity arg1) {
		// TODO Auto-generated method stub
		
	}
		
}
