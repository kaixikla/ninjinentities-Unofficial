package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityKoguSuper extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityKoguSuper(World par1World) {
		super(par1World, 10, MindState.AGGRESSIVE, false, true, new byte[]{1, 5}, new byte[]{4, 4});
		this.experienceValue = 80;
		this.setSize(0.66F,1.8F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				12000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				1200.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/koguSuper.png";
	}
}
