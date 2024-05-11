package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityVegetaCopyBlue extends EntityDBCNinjin {

	public EntityVegetaCopyBlue(World par1World) {
		super(par1World, 5, MindState.AGGRESSIVE, false, true, new byte[]{3, 6}, new byte[]{3, 3},50.0F, 255.0F, 255.0F, false, true,50.0F, 200.0F, 255.0F);
		this.experienceValue = 80;
		this.angerLevel = 400;
		this.setSize(0.6F,1.8F);
	}
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				60000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				6000.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/vegetaCopyBlue.png";
	}
}
