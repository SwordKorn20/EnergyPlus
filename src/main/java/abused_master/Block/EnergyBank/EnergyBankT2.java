package abused_master.Block.EnergyBank;

import abused_master.EnergyPlus;
import abused_master.Block.TE.TileEnergyBankT1;
import abused_master.Block.TE.TileEnergyBankT2;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class EnergyBankT2 extends BlockContainer {

	public EnergyBankT2(Material material, String unlocalizedName) {
		super(material);
		this.setHardness(3.0F);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(EnergyPlus.EnergyPlus);
	}

    public EnergyBankT2(String unlocalisedName) {
        this(Material.IRON, unlocalisedName);
    } 
    
    @Override
    public boolean isOpaqueCube(IBlockState state) {
    	return false;
    }
    
    @Override
    public EnumBlockRenderType getRenderType(IBlockState state)
    {
        return EnumBlockRenderType.MODEL;
    }

	
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEnergyBankT2();
		
	}
	
	@Override
	public boolean hasTileEntity() {
		return true;
	}
	
	
	@Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {

		TileEntity tee = world.getTileEntity(pos);
		
        TileEnergyBankT2 ebt2 = (TileEnergyBankT2)tee;

		player.addChatMessage(new TextComponentString("Energy Stored: " + ebt2.getEnergyStored(side) + "/" + ebt2.getMaxEnergyStored(side) + " RF") );
		return true;
	}	
}