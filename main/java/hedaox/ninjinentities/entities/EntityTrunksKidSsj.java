package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityTrunksKidSsj extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityTrunksKidSsj(World par1World) {
		super(par1World, 100, MindState.NEUTRAL, true, false, new byte[]{3, 1, 6}, new byte[]{7, 7, 7}, 255.0F, 217.0F, 25.0F);
		this.experienceValue = 80;
		this.setSize(0.39F,1.17F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				8000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				800.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/trunksKidSsj.png";
	}

}
