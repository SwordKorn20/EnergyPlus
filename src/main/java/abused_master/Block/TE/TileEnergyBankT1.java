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
	
	public int capacity = 500000;
	public int maxReceive = 5000;
	public int maxExtract = 5000;
	int energy;
	//test
	
	public TileEnergyBankT1(int capacity, int maxReceive, int maxExtract) {
		
		  this.capacity = capacity;
		  this.maxReceive = maxReceive;
		  this.maxExtract = maxExtract;
		  
		 }
	
	public TileEnergyBankT1() {
		
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt) {

		super.readFromNBT(nbt);
		this.readFromNBT(nbt);
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbt) {

		super.writeToNBT(nbt);
		this.writeToNBT(nbt);
		return nbt;
	}
	
	@Override
	public int getEnergyStored(EnumFacing from) {
		return energy;
	}

	@Override
	public int getMaxEnergyStored(EnumFacing from) {
		return capacity;
	}

	@Override
	public boolean canConnectEnergy(EnumFacing from) {
		return true;
	}

	@Override
	public int receiveEnergy(EnumFacing from, int maxReceive, boolean simulate) {
		return this.receiveEnergy(from, maxReceive, simulate);
		}

	@Override
	public int extractEnergy(EnumFacing from, int maxExtract, boolean simulate) {
	    return this.extractEnergy(from, maxExtract, simulate);
	}
	
}
