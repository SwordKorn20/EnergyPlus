package abused_master.Block.EnergyBank;

import org.lwjgl.opengl.GL11;

import abused_master.Info;
import abused_master.Block.TE.TileEnergyBankT1;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderEnergyBankT1 extends TileEntitySpecialRenderer {

	@Override
	public void renderTileEntityAt(TileEntity te, double x, double y, double z, float partialTicks, int destroyStage) {
		// TODO Auto-generated method stub
		
		GlStateManager.pushMatrix();

        GlStateManager.translate(x, y, z);

        WorldRenderer wr = Tessellator.getInstance().getWorldRenderer();
        wr.startDrawingQuads();

        // Base
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("tutorial:textures/blocks/tile_entity_tutorial_base.png"));
        // -Z
        wr.setNormal(0, 0, -1);
        wr.addVertexWithUV(1.0, 0.0, 0.0, 0.0, 1.0);
        wr.addVertexWithUV(0.0, 0.0, 0.0, 1.0, 1.0);
        wr.addVertexWithUV(0.0, 0.5, 0.0, 1.0, 0.5);
        wr.addVertexWithUV(1.0, 0.5, 0.0, 0.0, 0.5);
        // +Z
        wr.setNormal(0, 0, 1);
        wr.addVertexWithUV(0.0, 0.0, 1.0, 0.0, 1.0);
        wr.addVertexWithUV(1.0, 0.0, 1.0, 1.0, 1.0);
        wr.addVertexWithUV(1.0, 0.5, 1.0, 1.0, 0.5);
        wr.addVertexWithUV(0.0, 0.5, 1.0, 0.0, 0.5);
        // -X
        wr.setNormal(-1, 0, 0);
        wr.addVertexWithUV(0.0, 0.0, 0.0, 0.0, 1.0);
        wr.addVertexWithUV(0.0, 0.0, 1.0, 1.0, 1.0);
        wr.addVertexWithUV(0.0, 0.5, 1.0, 1.0, 0.5);
        wr.addVertexWithUV(0.0, 0.5, 0.0, 0.0, 0.5);
        // +X
        wr.setNormal(1, 0, 0);
        wr.addVertexWithUV(1.0, 0.0, 1.0, 0.0, 1.0);
        wr.addVertexWithUV(1.0, 0.0, 0.0, 1.0, 1.0);
        wr.addVertexWithUV(1.0, 0.5, 0.0, 1.0, 0.5);
        wr.addVertexWithUV(1.0, 0.5, 1.0, 0.0, 0.5);
        // -Y
        wr.setNormal(0, -1, 0);
        wr.addVertexWithUV(0.0, 0.0, 1.0, 0.0, 1.0);
        wr.addVertexWithUV(0.0, 0.0, 0.0, 1.0, 1.0);
        wr.addVertexWithUV(1.0, 0.0, 0.0, 1.0, 0.0);
        wr.addVertexWithUV(1.0, 0.0, 1.0, 0.0, 0.0);
        // +Y
        wr.setNormal(0, 1, 0);
        wr.addVertexWithUV(1.0, 0.5, 1.0, 0.0, 1.0);
        wr.addVertexWithUV(1.0, 0.5, 0.0, 1.0, 1.0);
        wr.addVertexWithUV(0.0, 0.5, 0.0, 1.0, 0.0);
        wr.addVertexWithUV(0.0, 0.5, 1.0, 0.0, 0.0);
        Tessellator.getInstance().draw();

        GlStateManager.translate(0.5, 0.5, 0.5);
        GlStateManager.scale(0.5, 0.5, 0.5);
        GlStateManager.rotate((te.getWorld().getTotalWorldTime() + partialTick) * 3, 0, 1, 0);
        GlStateManager.translate(-0.5, 0, -0.5);

        // Core
        wr.startDrawingQuads();
                
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("ep:textures/blocks/EnergyBankT1.png"));
        // -Z
        wr.setNormal(0, 0, -1);
        wr.addVertexWithUV(1.0, 0.0, 0.0, 0.0, 1.0);
        wr.addVertexWithUV(0.0, 0.0, 0.0, 1.0, 1.0);
        wr.addVertexWithUV(0.0, 1.0, 0.0, 1.0, 0.0);
        wr.addVertexWithUV(1.0, 1.0, 0.0, 0.0, 0.0);
        // +Z
        wr.setNormal(0, 0, 1);
        wr.addVertexWithUV(0.0, 0.0, 1.0, 0.0, 1.0);
        wr.addVertexWithUV(1.0, 0.0, 1.0, 1.0, 1.0);
        wr.addVertexWithUV(1.0, 1.0, 1.0, 1.0, 0.0);
        wr.addVertexWithUV(0.0, 1.0, 1.0, 0.0, 0.0);
        // -X
        wr.setNormal(-1, 0, 0);
        wr.addVertexWithUV(0.0, 0.0, 0.0, 0.0, 1.0);
        wr.addVertexWithUV(0.0, 0.0, 1.0, 1.0, 1.0);
        wr.addVertexWithUV(0.0, 1.0, 1.0, 1.0, 0.0);
        wr.addVertexWithUV(0.0, 1.0, 0.0, 0.0, 0.0);
        // +X
        wr.setNormal(1, 0, 0);
        wr.addVertexWithUV(1.0, 0.0, 1.0, 0.0, 1.0);
        wr.addVertexWithUV(1.0, 0.0, 0.0, 1.0, 1.0);
        wr.addVertexWithUV(1.0, 1.0, 0.0, 1.0, 0.0);
        wr.addVertexWithUV(1.0, 1.0, 1.0, 0.0, 0.0);
        // -Y
        wr.setNormal(0, -1, 0);
        wr.addVertexWithUV(0.0, 0.0, 1.0, 0.0, 1.0);
        wr.addVertexWithUV(0.0, 0.0, 0.0, 1.0, 1.0);
        wr.addVertexWithUV(1.0, 0.0, 0.0, 1.0, 0.0);
        wr.addVertexWithUV(1.0, 0.0, 1.0, 0.0, 0.0);
        // +Y
        wr.setNormal(0, 1, 0);
        wr.addVertexWithUV(1.0, 1.0, 1.0, 0.0, 1.0);
        wr.addVertexWithUV(1.0, 1.0, 0.0, 1.0, 1.0);
        wr.addVertexWithUV(0.0, 1.0, 0.0, 1.0, 0.0);
        wr.addVertexWithUV(0.0, 1.0, 1.0, 0.0, 0.0);

        Tessellator.getInstance().draw();
        GlStateManager.popMatrix();
		
	}
}
