package abused_master.Block.TE;

import cofh.api.energy.EnergyStorage;
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

public class TileEnergyBankT1 extends TileEntity implements IEnergyStorage {

	public int energy;
	public int capacity;
	public int maxReceive;
	public int maxExtract;

	public TileEnergyBankT1(int capacity) {

		this(capacity, capacity, capacity);
	}

	public TileEnergyBankT1(int capacity, int maxTransfer) {

		this(capacity, maxTransfer, maxTransfer);
	}

	public TileEnergyBankT1(int capacity, int maxReceive, int maxExtract) {

		this.capacity = 1000000;
		this.maxReceive = 10000;
		this.maxExtract = 10000;
	}

	public TileEnergyBankT1() {
		// TODO Auto-generated constructor stub
	}

	public void readFromNBT(NBTTagCompound nbt) {

		this.energy = nbt.getInteger("Energy");

		if (energy > capacity) {
			energy = capacity;
		}
		return;
	}

	public NBTTagCompound writeToNBT(NBTTagCompound nbt) {

		if (energy < 0) {
			energy = 0;
		}
		nbt.setInteger("Energy", energy);
		return nbt;
	}

	public TileEnergyBankT1 setCapacity(int capacity) {

		this.capacity = capacity;

		if (energy > capacity) {
			energy = capacity;
		}
		return this;
	}

	public TileEnergyBankT1 setMaxTransfer(int maxTransfer) {

		setMaxReceive(maxTransfer);
		setMaxExtract(maxTransfer);
		return this;
	}

	public TileEnergyBankT1 setMaxReceive(int maxReceive) {

		this.maxReceive = maxReceive;
		return this;
	}

	public TileEnergyBankT1 setMaxExtract(int maxExtract) {

		this.maxExtract = maxExtract;
		return this;
	}

	public int getMaxReceive() {

		return maxReceive;
	}

	public int getMaxExtract() {

		return maxExtract;
	}

	/* IEnergyStorage */
	@Override
	public int receiveEnergy(int maxReceive, boolean simulate) {

		int energyReceived = Math.min(capacity - energy, Math.min(this.maxReceive, maxReceive));

		if (!simulate) {
			energy += energyReceived;
		}
		return energyReceived;
	}

	@Override
	public int extractEnergy(int maxExtract, boolean simulate) {

		int energyExtracted = Math.min(energy, Math.min(this.maxExtract, maxExtract));

		if (!simulate) {
			energy -= energyExtracted;
		}
		return energyExtracted;
	}

	@Override
	public int getEnergyStored() {

		return energy;
	}

	@Override
	public int getMaxEnergyStored() {

		return capacity;
	}

	
}
