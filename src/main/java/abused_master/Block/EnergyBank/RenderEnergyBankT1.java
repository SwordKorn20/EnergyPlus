package abused_master.Block.EnergyBank;

import java.util.Random;

import org.lwjgl.opengl.GL11;

import abused_master.Info;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.VertexBuffer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class RenderEnergyBankT1 extends TileEntitySpecialRenderer {

	 private ResourceLocation texture = new ResourceLocation(Info.MODID, "textures/blocks/EnergyBankT1.png");
	 private Random random = new Random();
	 
	@Override
	public void renderTileEntityAt(TileEntity te, double x, double y, double z, float partialTicks, int destroyStage) {
   
        GlStateManager.pushMatrix();
        GlStateManager.translate(x, y, z);
        GlStateManager.popMatrix();
         
 }
}