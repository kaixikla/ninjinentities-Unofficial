package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityNicky extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityNicky(World par1World) {
		super(par1World, 0, MindState.AGGRESSIVE, false, false, new byte[]{3}, new byte[]{6});
		this.experienceValue = 80;
		this.setSize(0.54F,1.8F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				245.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				24.5D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/nicky.png";
	}
}
