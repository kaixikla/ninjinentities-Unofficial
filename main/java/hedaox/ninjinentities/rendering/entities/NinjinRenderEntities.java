package hedaox.ninjinentities.rendering.entities;

import JinRyuu.DragonBC.common.Npcs.ModelWhis;
import JinRyuu.DragonBC.common.Npcs.*;
import JinRyuu.DragonBC.common.Npcs.dbsbroly.ModelDBSBrolyBuff;
import JinRyuu.DragonBC.common.Npcs.dbsbroly.ModelDBSBrolyLegendary;
import JinRyuu.DragonBC.common.Npcs.dbsbroly.ModelDBSBrolyNormal;
import cpw.mods.fml.client.registry.RenderingRegistry;
import hedaox.ninjinentities.entities.EntityDodoria;
import hedaox.ninjinentities.entities.EntityDragon;
import hedaox.ninjinentities.entities.EntityFrost1;
import hedaox.ninjinentities.entities.EntityFrost3;
import hedaox.ninjinentities.entities.EntityFrost4;
import hedaox.ninjinentities.entities.EntityGoku2;
import hedaox.ninjinentities.entities.EntityGokuBlack;
import hedaox.ninjinentities.entities.EntityHit;
import hedaox.ninjinentities.entities.EntityMonaka;
import hedaox.ninjinentities.entities.EntityPiccolo;
import hedaox.ninjinentities.entities.EntityPiccolo2;
import hedaox.ninjinentities.entities.EntityVegeta2;
import hedaox.ninjinentities.entities.EntityVegeta3;
import hedaox.ninjinentities.entities.EntityVegetaCopy;
import hedaox.ninjinentities.entities.EntityVegetaCopyBlue;
import hedaox.ninjinentities.entities.EntityWhis;
import hedaox.ninjinentities.entities.EntityZamasu;
import hedaox.ninjinentities.entities.EntityZarbon2;
import hedaox.ninjinentities.entities.*;
import hedaox.ninjinentities.models.ModelCabba;
import hedaox.ninjinentities.models.ModelVegeta;
import hedaox.ninjinentities.models.ModelZamasu;
import hedaox.ninjinentities.models.*;

public class NinjinRenderEntities {
	public static void init()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityMasterBaba.class, new RenderDBC(new ModelBaba(1.0F,1.0F,1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGeneralBlue.class, new RenderDBC(new JinRyuu.DragonBC.common.Npcs.ModelNPCNormal(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityHercule.class, new RenderDBC(new JinRyuu.DragonBC.common.Npcs.ModelNPCNormal(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGohanKid1.class, new RenderDBC(new ModelGohanKid1(0.55F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGohanKid2.class, new RenderDBC(new ModelGohanKid2(0.6F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGohanKid3.class, new RenderDBC(new ModelGohanKid1(0.65F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGohanKidArmor.class, new RenderDBC(new ModelGohanKidArmor(0.6F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGohanTeen.class, new RenderDBC(new ModelGohanTeen(0.8F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGohanTeenArmor.class, new RenderDBC(new ModelGohanTeen(0.8F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGohanTeenArmorSsj.class, new RenderDBC(new ModelGohanTeen(0.8F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGohanTeenSsj.class, new RenderDBC(new ModelGohanTeen(0.8F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGohanTeenSsj2.class, new RenderDBC(new ModelGohanTeenSsj2(0.8F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGohanAdult.class, new RenderDBC(new ModelGohanAdult(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGohanAdultSsj.class, new RenderDBC(new ModelGohanAdult(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGohanAdultSsj2.class, new RenderDBC(new ModelGohanAdultSsj2(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGohanUltimate.class, new RenderDBC(new ModelGohanAdultSsj2(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGokuKid1.class, new RenderDBC(new ModelGoku(0.6F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGokuKid2.class, new RenderDBC(new ModelGoku(0.65F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGoku1.class, new RenderDBC(new ModelGoku(0.9F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGoku2.class, new RenderDBC(new ModelGoku(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGoku2Kaioken.class, new RenderDBC(new ModelGoku(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGokuArmor.class, new RenderDBC(new ModelGoku(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGokuArmorSsj.class, new RenderDBC(new ModelGokuSsj(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGokunoweight.class, new RenderDBC(new ModelGoku(0.9F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGokuSsj.class, new RenderDBC(new ModelGokuSsj(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGokuSsj2.class, new RenderDBC(new ModelGokuSsj2(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGokuSsj3.class, new RenderDBC(new ModelGokuSsj3(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityKanbaSsj2.class, new RenderDBC(new ModelKanbaSsj2(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityKanbaSsj3.class, new RenderDBC(new ModelKanbaSsj3(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityKanbaSsjoozaru.class, new RenderDBC(new ModelKanbaSsjoozaru(2.3F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGokuSsjg.class, new RenderDBC(new ModelGoku(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGokuSsjb.class, new RenderDBC(new ModelGokuSsj(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGokuSsjbk.class, new RenderDBC(new ModelGokuSsj(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGokuSuper.class, new RenderDBC(new ModelGoku(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGokuSuperSsj.class, new RenderDBC(new ModelGokuSsj(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGokuSuperSsjb.class, new RenderDBC(new ModelGokuSsj(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGokuUI.class, new RenderDBC(new ModelGokuUi(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGokuUIM.class, new RenderDBC(new ModelGokuUi(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGokuYardrat.class, new RenderDBC(new ModelGoku(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGokuYardratSsj.class, new RenderDBC(new ModelGokuSsj(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGoten.class, new RenderDBC(new ModelGoku(0.6F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGotenSsj.class, new RenderDBC(new ModelGokuSsj(0.6F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGotenks.class, new RenderDBC(new ModelGotenks(0.75F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGotenksSsj.class, new RenderDBC(new ModelGotenks(0.75F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGotenksSsj3.class, new RenderDBC(new ModelGotenksSsj3(0.75F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityKrillin1.class, new RenderDBC(new ModelNPCNormalScale(0.8F, 0.8F, 0.8F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityKrillin2.class, new RenderDBC(new ModelNPCNormalArmor(0.8F, 0.8F, 0.8F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityKrillinKid1.class, new RenderDBC(new ModelNPCNormalScale(0.575F, 0.575F, 0.575F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityKrillinKid2.class, new RenderDBC(new ModelNPCNormalScale(0.625F, 0.625F, 0.625F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTien.class, new RenderDBC(new JinRyuu.DragonBC.common.Npcs.ModelNPCNormal(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityChiaotzu1.class, new RenderDBC(new ModelNPCNormalScale(0.6F, 0.6F, 0.6F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityChiaotzu2.class, new RenderDBC(new ModelNPCNormalScale(0.6F, 0.6F, 0.6F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityYamcha1.class, new RenderDBC(new ModelYamcha1(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityYamcha2.class, new RenderDBC(new ModelYamcha1(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityYamcha3.class, new RenderDBC(new ModelYamcha2(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityPiccolo.class, new RenderDBC(new ModelRaditz(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityOozaru.class, new RenderDBC(new ModelOozaru(2.3F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityRoshi.class, new RenderDBC(new ModelRoshi(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityRoshiBuff.class, new RenderDBC(new ModelNPCNormalScale(1.1F, 1.05F, 1.1F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTrunksArmor.class, new RenderDBC(new ModelTrunksArmor(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTrunksArmorSsj.class, new RenderDBC(new ModelTrunksArmorSsj(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTrunksArmorSsjG2.class, new RenderDBC(new ModelTrunksArmorSsj(1.1F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTrunksArmorSsjG3.class, new RenderDBC(new ModelTrunksArmorSsjG3(1.2F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTrunksFutur.class, new RenderDBC(new ModelTrunks(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTrunksFuturSsj.class, new RenderDBC(new ModelTrunksSsj(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTrunksFuturSuper.class, new RenderDBC(new ModelTrunks(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTrunksFuturSuperSsj.class, new RenderDBC(new ModelTrunksSsj(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTrunksFuturSuperSsj2.class, new RenderDBC(new ModelTrunksSsj(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTrunksFuturSuperSsjG3.class, new RenderDBC(new ModelTrunksArmorSsjG3(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTrunksFuturSuperSsjRage.class, new RenderDBC(new ModelTrunksSsj(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTrunksKid.class, new RenderDBC(new ModelTrunks(0.65F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTrunksKidSsj.class, new RenderDBC(new ModelTrunksSsj(0.65F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityVegeto.class, new RenderDBC(new ModelVegeto(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityVegetoSsj.class, new RenderDBC(new ModelVegeto(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityVegetoSsj2.class, new RenderDBC(new ModelVegeto(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityVegetoSsj3.class, new RenderDBC(new ModelvegetoSsj3(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityVegetoSsjb.class, new RenderDBC(new ModelVegeto(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityVegetoUi.class, new RenderDBC(new ModelVegeto(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityVegetoUw.class, new RenderDBC(new ModelVegeto(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGogeta.class, new RenderDBC(new ModelGogeta(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGogetaSsj.class, new RenderDBC(new ModelGogeta(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGogetaSsj2.class, new RenderDBC(new ModelGogeta(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGogetaSsj3.class, new RenderDBC(new ModelGokuSsj3(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGogetaSsjb.class, new RenderDBC(new ModelGogeta(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGogetaUi.class, new RenderDBC(new ModelGogeta(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGogetaUw.class, new RenderDBC(new ModelGogeta(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityVegeta0.class, new RenderDBC(new ModelVegetaArmor(0.9F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityVegeta0Damaged.class, new RenderDBC(new ModelVegetaArmorDamaged(0.9F,0.9F,0.9F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityVegeta1.class, new RenderDBC(new ModelVegeta(0.9F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityVegeta3.class, new RenderDBC(new ModelVegeta(0.9F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityVegetaSsj.class, new RenderDBC(new ModelVegeta(0.9F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityVegetaSsjG2.class, new RenderDBC(new ModelVegeta(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityVegeta2.class, new RenderDBC(new ModelVegeta(0.9F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityVegeta2Ssj.class, new RenderDBC(new ModelVegeta(0.9F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityVegeta2Ssj2.class, new RenderDBC(new ModelVegeta(0.9F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityVegetaSsjg.class, new RenderDBC(new ModelVegeta(0.9F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityVegetaSsjb.class, new RenderDBC(new ModelVegeta(0.9F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityVegetaZw.class, new RenderDBC(new ModelVegeta(0.9F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityVegetaSsjbe.class, new RenderDBC(new ModelVegeta(0.9F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityVegetaMajin.class, new RenderDBC(new ModelVegetaMajin(0.9F,0.9F,0.9F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityVegetaOozaru.class, new RenderDBC(new ModelVegetaOozaru(2.3F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityVegetaCopy.class, new RenderDBC(new ModelVegeta(0.9F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityVegetaCopyBlue.class, new RenderDBC(new ModelVegeta(0.9F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityVegetaSuper.class, new RenderDBC(new ModelVegeta(0.9F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityVegetaSuperSsj.class, new RenderDBC(new ModelVegeta(0.9F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityVegetaSuperSsjb.class, new RenderDBC(new ModelVegeta(0.9F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityCyborgTaopaipai.class, new RenderDBC(new JinRyuu.DragonBC.common.Npcs.ModelNPCNormal(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTaopaipai.class, new RenderDBC(new JinRyuu.DragonBC.common.Npcs.ModelNPCNormal(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTambourine.class, new RenderDBC(new ModelTambourine(1.0F, 1.05F, 1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityCymbal.class, new RenderDBC(new ModelCymbal(1.4F, 1.15F, 1.4F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityDrum.class, new RenderDBC(new ModelDrum(1.25F, 1.0F, 1.25F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityPiccoloDaimaoOld.class, new RenderDBC(new ModelNPCNormalCape(1.1F,1.1F,1.1F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityPiccoloDaimaoYoung.class, new RenderDBC(new ModelNPCNormalScale(1.1F,1.1F, 1.1F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityPiccoloDaimaoYoung2.class, new RenderDBC(new ModelNPCNormalScale(1.1F, 1.1F, 1.1F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityHit.class, new RenderDBC(new JinRyuu.DragonBC.common.Npcs.ModelNPCNormal(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityFrost1.class, new RenderDBC(new ModelRaditz(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityFrost3.class, new RenderDBC(new ModelRaditz(1.25F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityFrost4.class, new RenderDBC(new ModelRaditz(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityFreeza5Damaged.class, new RenderDBC(new ModelFreeza5Damaged(1.0F,1.0F,1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityFreeza6Damaged.class, new RenderDBC(new ModelFreeza6Damaged(1.0F,1.0F,1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityDodoria.class, new RenderDBC(new ModelDodoria(1.1F,1.0F,1.1F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityCabbaNinjin.class, new RenderDBC(new ModelCabba( 0.75F, 0.75F, 0.75F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityCabbaSsj.class, new RenderDBC(new ModelCabba( 0.75F, 0.75F, 0.75F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityCauliflaNinjin.class, new RenderDBC(new ModelCauliflaNinjin(1, 0.75F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityCauliflaSsj.class, new RenderDBC(new ModelCauliflaNinjin(1, 0.75F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityCauliflaSsj2.class, new RenderDBC(new ModelCauliflaNinjin(2, 0.75F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityKaleNinjin.class, new RenderDBC(new ModelKaleNinjin(0, 0.75F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityKaleSsj.class, new RenderDBC(new ModelKaleNinjin(1, 0.9F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityKaleSsjL.class, new RenderDBC(new ModelKaleNinjin(2, 1.1F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityKaleSsj2.class, new RenderDBC(new ModelKaleNinjin(1, 0.9F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityMonaka.class, new RenderDBC(new ModelNPCNormalScale(0.7F, 0.7F, 0.7F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGokuBlack.class, new RenderDBC(new ModelGoku(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGokuBlackSsj.class, new RenderDBC(new ModelGokuSsj(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGokuBlackR.class, new RenderDBC(new ModelGokuSsj(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityZamasu.class, new RenderDBC(new ModelZamasu(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityZamasuMerged.class, new RenderDBC(new ModelZamasuMerged(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityJirenNinjin.class, new RenderDBC(new ModelJirenNinjin(1.1F, 1.1F, 1.1F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityJirenSuperFullPower.class, new RenderDBC(new ModelJirenNinjin(1.15F, 1.15F, 1.15F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityToppoNinjin.class, new RenderDBC(new ModelToppo(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityToppoNinjinFullPower.class, new RenderDBC(new ModelToppo(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityDyspoNinjin.class, new RenderDBC(new ModelDyspoNinjin(0.9F,1.0F,0.9F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityKahseral.class, new RenderDBC(new ModelNPCNormalScale(1.0F,1.0F,1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityCocotte.class, new RenderDBC(new ModelNPCNormalScale(0.85F,0.9F,0.85F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityVewon.class, new RenderDBC(new ModelNPCNormalScale(1.05F,1.05F,1.05F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTupper.class, new RenderDBC(new ModelNPCNormalScale(1.1F,1.1F,1.1F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityZoire.class, new RenderDBC(new ModelNPCNormalScale(0.5F,0.5F,0.5F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityKettle.class, new RenderDBC(new ModelNPCNormalScale(1.05F,1.0F,1.05F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityKnsi.class, new RenderDBC(new ModelNPCNormalScale(0.9F,0.8F,0.9F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityKeflaNinjin.class, new RenderDBC(new ModelKeflaNinjin(0.775F,0), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityKeflaSsj.class, new RenderDBC(new ModelKeflaNinjin(0.825F,1), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBergamoNinjin.class, new RenderDBC(new ModelTrioDanger(1.1F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityLavenderNinjin.class, new RenderDBC(new ModelTrioDanger(0.8F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityPilina.class, new RenderDBC(new ModelNamekian(1.1F, 1.0F, 1.1F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityPiccoloInjury.class, new RenderDBC(new ModelNamekian(1.0F, 1.0F, 1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySaonel.class, new RenderDBC(new ModelNamekian(1.0F,1.0F,1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBrolySuper.class, new RenderDBC(new ModelBroly(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBrolyZBase.class, new RenderDBC(new ModelDBSBrolyNormal(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBrolySuperWrath.class, new RenderDBC(new ModelBrolySsj(1.1F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBrolySuperSsj.class, new RenderDBC(new ModelBrolySsj(1.1F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBrolySuperSsjL.class, new RenderDBC(new ModelBrolySsj(1.25F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityZarbon1.class, new RenderDBC(new ModelZarbon(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityZarbon2.class, new RenderDBC(new ModelZarbon(1.05F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityNail.class, new RenderDBC(new ModelNamekian(1.0F, 1.0F,1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGinyuGoku.class, new RenderDBC(new ModelGoku(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySpopovich.class, new RenderDBC(new ModelNPCNormalScale(1.15F, 1.1F, 1.15F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityYamu.class, new RenderDBC(new ModelNPCNormalScale(0.95F,1.0F,0.95F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityMajinSoldier1.class, new RenderDBC(new ModelMajinSoldier(1.1F,1.1F,1.1F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityMajinSoldier2.class, new RenderDBC(new ModelMajinSoldier(0.9F,0.9F,0.9F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityWhis.class, new RenderDBC(new ModelWhis(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityRaditz.class, new RenderDBC(new ModelRaditzNinjin(1.05F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityKanba.class, new RenderDBC(new ModelKanbaNinjin(1.05F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(Entityglnl.class, new RenderDBC(new Modelglnl(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityKanbassj.class, new RenderDBC(new ModelKanbassjNinjin(1.05F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityNappa.class, new RenderDBC(new ModelNPCNormalArmor(1.125F,1.1F,1.125F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityNappaDamaged.class, new RenderDBC(new ModelNappaArmor(1.125F,1.1F,1.125F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBioWarrior1.class, new RenderDBC(new ModelNPCNormalScale(1.25F, 0.8F, 1.25F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBioWarrior2.class, new RenderDBC(new ModelNPCNormalScale(1.1F, 1.15F, 1.1F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBioWarrior3.class, new RenderDBC(new ModelNPCNormalScale(1.05F, 1.05F, 1.05F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBioWarrior4.class, new RenderDBC(new ModelNPCNormalScale(0.85F, 0.85F, 0.85F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBioWarrior5.class, new RenderDBC(new ModelNPCNormalScale(0.65F, 0.65F, 0.65F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBioWarrior6.class, new RenderDBC(new ModelNPCNormalScale(1.05F, 1.15F, 1.05F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBrolyZBio.class, new RenderDBC(new ModelBrolyZBio(1.25F,1.25f,1.25f), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBido.class, new RenderDBC(new ModelBido(1.05F,1.05F,1.05F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBojack.class, new RenderDBC(new ModelBojack(1.1F,1.1F,1.1F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBojackSuper.class, new RenderDBC(new ModelBojack(1.2F,1.15F,1.2F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBujin.class, new RenderDBC(new ModelBujin(0.75F,0.75F,0.75F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityKogu.class, new RenderDBC(new ModelKogu(1.0F,1.0F,1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityKoguSuper.class, new RenderDBC(new ModelKogu(1.1F,1.0F,1.1F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityZangya.class, new RenderDBC(new ModelZangya(0.85F,0.85F,0.85F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityAngol.class, new RenderDBC(new ModelAngol(0.9F,0.9F,0.9F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBrolyZLSsj.class, new RenderDBC(new ModelDBSBrolyLegendary(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBrolyZLSsj3.class, new RenderDBC(new ModelDBSBrolySSJ3(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBrolyZSsj.class, new RenderDBC(new ModelDBSBrolyNormal(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBrolyZ2Ssj.class, new RenderDBC(new ModelDBSBrolyBuff(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityMoah.class, new RenderDBC(new ModelMoah(0.95F,0.95F,0.95F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityParagus.class, new RenderDBC(new ModelParagus(1.0F,1.0F,1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityParagusSoldier.class, new RenderDBC(new ModelNPCNormalScale(0.9F,0.9F,0.9F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityCooler.class, new RenderDBC(new ModelCooler(0.95F,0.95F,0.95F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityCoolerFifthForm.class, new RenderDBC(new ModelCoolerFifthForm(1.1F,1.1F,1.1F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityDore.class, new RenderDBC(new ModelDore(1.05F,1.0F,1.05F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityNeiz.class, new RenderDBC(new ModelNeiz(1.1F,1.15F,1.1F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySalza.class, new RenderDBC(new ModelSalza(0.9F,0.9F,0.9F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGarlicJr.class, new RenderDBC(new ModelGarlicJr(0.65F,0.65F,0.65F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGarlicJrSuper.class, new RenderDBC(new ModelGarlicJrSuper(1.15F,1.1F,1.15F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGinger.class, new RenderDBC(new ModelGinger(0.85F,0.85F,0.85F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityNicky.class, new RenderDBC(new ModelNicky(0.9F,1.0F,0.9F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySansho.class, new RenderDBC(new ModelSansho(1.15F,1.1F,1.15F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityJanemba.class, new RenderDBC(new ModelJanemba(1.1F,1.1F,1.1F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityJanembaSuper.class, new RenderDBC(new ModelJanembaSuper(1.1F,1.1F,1.1F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityAngila.class, new RenderDBC(new ModelAngila(1.15F,1.15F,1.15F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySlugOld.class, new RenderDBC(new ModelSlugOld(1.1F,1.05F,1.1F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySlugYoung.class, new RenderDBC(new ModelSlugYoung(1.1F,1.1F,1.1F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySlugGiant.class, new RenderDBC(new ModelSlugGiant(2.2F,2.2F,2.2F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityMedamatcha.class, new RenderDBC(new ModelMedamatcha(0.95F,0.9F,0.95F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityMedamatchaClone.class, new RenderDBC(new ModelMedamatcha(0.5F,0.45F,0.5F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySlugSoldier.class, new RenderDBC(new ModelSlugSoldier(0.9F,0.9F,0.9F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityWings.class, new RenderDBC(new ModelWings(1.1F,1.0F,1.1F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityZeeun.class, new RenderDBC(new ModelZeeun(1.1F,1.1F,1.1F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityAndroid13.class, new RenderDBC(new ModelAndroid13(1.0F,1.0F,1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityAndroid13Super.class, new RenderDBC(new ModelAndroid13Super(1.2F,1.2F,1.2F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityAndroid14.class, new RenderDBC(new ModelAndroid14(1.1F,1.1F,1.1F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityAndroid15.class, new RenderDBC(new ModelAndroid15(0.85F,0.85F,0.85F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityArbee.class, new RenderDBC(new ModelPESSMonster1(1.0F,1.0F,1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityJiku.class, new RenderDBC(new ModelPESSMonster1(1.0F,1.0F,1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityKawazu.class, new RenderDBC(new ModelPESSMonster2(1.0F,1.0F,1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityKinkarn.class, new RenderDBC(new ModelPESSMonster2(1.0F,1.0F,1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityPonkarn.class, new RenderDBC(new ModelPESSMonster2(1.0F,1.0F,1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBudo.class, new RenderDBC(new ModelPESSMonster3(1.0F,1.0F,1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGure.class, new RenderDBC(new ModelPESSMonster3(1.0F,1.0F,1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySkud.class, new RenderDBC(new ModelPESSMonster3(1.0F,1.0F,1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityHatchiyack.class, new RenderDBC(new ModelHatchiyack(1.2F,1.2F,1.2F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityHatchiyackSuper.class, new RenderDBC(new ModelHatchiyackSuper(1.3F,1.3F,1.3F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityHatchiyackGiant.class, new RenderDBC(new ModelHatchiyack(2.3F,2.3F,2.3F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityCyclopianGuard.class, new RenderDBC(new ModelCyclopianGuard(1.3F,1.3F,1.3F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityCoolerMetal.class, new RenderDBC(new ModelCooler(0.95F,0.95F,0.95F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityCoolerMetalTrueForm.class, new RenderDBC(new ModelCoolerMetalRealForm(1.8F,1.8F,1.8F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityAmond.class, new RenderDBC(new ModelAmond(1.0F,1.0F,1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityCacao.class, new RenderDBC(new ModelCacao(1.05F,1.05F,1.05F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityDaiz.class, new RenderDBC(new ModelDaiz(0.95F,0.95F,0.95F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityRasin.class, new RenderDBC(new ModelRasinLakasei(0.75F,0.7F,0.75F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityLakasei.class, new RenderDBC(new ModelRasinLakasei(0.7F,0.65F,0.7F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTurles1.class, new RenderDBC(new ModelTurles1(1.0F,1.0F,1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTurles2.class, new RenderDBC(new ModelTurles2(1.0F,1.0F,1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTurles3.class, new RenderDBC(new ModelTurles3(1.0F,1.0F,1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBiomen.class, new RenderDBC(new ModelBiomen(0.7F,0.7F,0.7F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityDrWheelo.class, new RenderDBC(new ModelDrWheelo(1.2F,1.2F,1.2F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityEbifurya.class, new RenderDBC(new ModelEbifurya(1.3F,1.3F,1.3F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityKishime.class, new RenderDBC(new ModelKishime(0.9F,0.9F,0.9F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityMisokatsun.class, new RenderDBC(new ModelMisokatsun(1.45F,1.35F,1.45F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityHoi.class, new RenderDBC(new ModelHoi(0.75F,0.75F,0.75F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityHirudegarnPre.class, new RenderDBC(new ModelHirudegarnPre(1.5F,1.5F,1.5F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityHirudegarnUpper.class, new RenderDBC(new ModelHirudegarnUpper(1.5F,1.5F,1.5F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityHirudegarnBottom.class, new RenderDBC(new ModelHirudegarnBottom(1.5F,1.5F,1.5F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityHirudegarnPost.class, new RenderDBC(new ModelHirudegarnPost(1.5F,1.5F,1.5F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityAbo.class, new RenderDBC(new ModelAboKado(0.95F,0.8F,0.95F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityKado.class, new RenderDBC(new ModelAboKado(0.95F,0.8F,0.95F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityAka.class, new RenderDBC(new ModelAka(1.35F,1.2F,1.35F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityCell4Ninjin.class, new RenderDBC(new ModelRaditz(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityRecoomeDamaged.class, new RenderDBC(new ModelRaditz(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityHjcellNinjin.class, new RenderDBC(new ModelRaditz(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityQdeNinjin.class, new RenderDBC(new ModelRaditz(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBdkNinjin.class, new RenderDBC(new ModelDBCZed(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBdkssjNinjin.class, new RenderDBC(new ModelDBCZed(4), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBdkssj3Ninjin.class, new RenderDBC(new ModelGokuSsj3(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBdkssjbNinjin.class, new RenderDBC(new ModelDBCZed(4), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBdkssjb3Ninjin.class, new RenderDBC(new ModelGokuSsj3(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityHsfls.class, new RenderDBC(new ModelFr4(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBb.class, new RenderDBC(new ModelDBCZed(3), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBbssj.class, new RenderDBC(new ModelDBCZed(3), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBbssj2.class, new RenderDBC(new ModelBbssj2(1), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityZsfls.class, new RenderDBC(new ModelFr4(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityZsCoolerFifthForm.class, new RenderDBC(new ModelCoolerFifthForm(1.1F,1.1F,1.1F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityHjCoolerFifthForm.class, new RenderDBC(new ModelCoolerFifthForm(1.1F,1.1F,1.1F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityJs.class, new RenderDBC(new ModelRaditzNinjin(1.05F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBzGokuSsj.class, new RenderDBC(new ModelGokuSsj(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityFu.class, new RenderDBC(new ModelDBCZed(1), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityDragon.class, new RenderDBC(new ModelDragon(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBbssj3.class, new RenderDBC(new ModelBbssj3(1), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(Entityomega.class, new RenderDBC(new Modelomega(2), 3.0F));
		RenderingRegistry.registerEntityRenderingHandler(Entityomega2.class, new RenderDBC(new Modelomega2(2), 3.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityMara.class, new RenderDBC(new ModelMara(2), 1.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityYoung_Mara.class, new RenderDBC(new ModelYoung_mara(2), 1.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityFusion_Mara.class, new RenderDBC(new ModelFusion_Mara(2), 1.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityCellmax.class, new RenderDBC(new ModelCellmax(2.3F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGamma1.class, new RenderDBC(new ModelGamma1(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityGamma2.class, new RenderDBC(new ModelGamma2(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySuper17.class, new RenderDBC(new ModelSuperA17(1.0F,1.0F,1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityPiccolo2.class, new RenderDBC(new ModelPiccolo2(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityPiccolo3.class, new RenderDBC(new ModelPiccolo2(1.0F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityPiccolo4.class, new RenderDBC(new ModelPiccolo3(1.1F), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityPiccolo5.class, new RenderDBC(new ModelPiccolo3(2.5F), 0.5F));
	}
}