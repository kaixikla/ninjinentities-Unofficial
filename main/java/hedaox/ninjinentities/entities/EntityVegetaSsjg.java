package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityVegetaSsjg extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityVegetaSsjg(World par1World) {
		super(par1World, 70, MindState.NEUTRAL, true, true, new byte[]{3, 6, 3, 5}, new byte[]{3, 7, 7, 7},255.0F, 50.0F, 50.0F, false, true,200.0F, 50.0F, 50.0F);
		this.experienceValue = 80;
		this.setSize(0.6F,1.8F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				57000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				5700.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/vegetaSsjg.png";
	}
}
