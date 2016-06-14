package abused_master.Block.TE;

import cofh.api.energy.IEnergyProvider;
import cofh.api.energy.IEnergyReceiver;
import cofh.api.energy.IEnergyStorage;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.Event;

public class TileEnergyBankT1 extends TileEntity implements IEnergyProvider, IEnergyReceiver {
	
	protected EnergyStorage capacity = new EnergyStorage(500000);
	private int maxReceive = 5000;
	private int maxExtract = 5000;
	
	public TileEnergyBankT1(int capacity, int maxReceive, int maxExtract) {
		
		  this.capacity = capacity;
		  this.maxReceive = maxReceive;
		  this.maxExtract = maxExtract;
		  
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt) {

		super.readFromNBT(nbt);
		capacity.readFromNBT(nbt);
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbt) {

		super.writeToNBT(nbt);
		capacity.writeToNBT(nbt);
		return nbt;
	}
	
	@Override
	public int getEnergyStored(EnumFacing from) {
		return energy;
	}

	@Override
	public int getMaxEnergyStored(EnumFacing from) {
		return capacity.getEnergyStored();
	}

	@Override
	public boolean canConnectEnergy(EnumFacing from) {
		return true;
	}

	@Override
	public int receiveEnergy(EnumFacing from, int maxReceive, boolean simulate) {
		return capacity.receiveEnergy(this.maxReceive, simulate);
		}

	@Override
	public int extractEnergy(EnumFacing from, int maxExtract, boolean simulate) {
	    return capacity.extractEnergy(this.maxExtract, simulate);
	}
	
}
