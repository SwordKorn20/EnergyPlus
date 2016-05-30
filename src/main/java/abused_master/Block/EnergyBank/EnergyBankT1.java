package abused_master.Block.EnergyBank;

import abused_master.EnergyPlus;
import abused_master.Block.TE.TileEnergyBankT1;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;

public class EnergyBankT1 extends BlockContainer {

	public EnergyBankT1(Material material, String unlocalizedName) {
		super(material);
		this.setHardness(3.0F);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(EnergyPlus.EnergyPlus);
	}

    public EnergyBankT1(String unlocalisedName) {
        this(Material.IRON, unlocalisedName);
    } 
	
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEnergyBankT1();
	}

	@Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
		Minecraft.getMinecraft().thePlayer.addChatMessage(new TextComponentString("Energy Stored: 0/1,000,000 RF"));
		
		return true;
	}	
}
