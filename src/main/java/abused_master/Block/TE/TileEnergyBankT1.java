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

	int capacity;
	int maxReceive;
	int maxExtract;
	int energy;
	
	public TileEnergyBankT1(int capacity, int maxReceive, int maxExtract) {

		  this.capacity = 500000;
		  this.maxReceive = 5000;
		  this.maxExtract = 5000;
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
		return maxReceive;		
		
	}

	@Override
	public int extractEnergy(EnumFacing from, int maxExtract, boolean simulate) {
		return this.extractEnergy(from.EAST, maxExtract, simulate);
	}
	
}
