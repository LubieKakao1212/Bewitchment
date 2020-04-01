package com.bewitchment.client.model.entity.living;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.MathHelper;

public class ModelWerewolf extends ModelBase {
	public ModelRenderer chest;
	public ModelRenderer fur02;
	public ModelRenderer fur03;
	public ModelRenderer fur04;
	public ModelRenderer stomach;
	public ModelRenderer lArm01;
	public ModelRenderer rArm01;
	public ModelRenderer neck;
	public ModelRenderer fur05;
	public ModelRenderer fur06;
	public ModelRenderer tail01;
	public ModelRenderer bipedLeftLeg;
	public ModelRenderer bipedRightLeg;
	public ModelRenderer tail02;
	public ModelRenderer tail03;
	public ModelRenderer tail04;
	public ModelRenderer lLeg02;
	public ModelRenderer lLeg03;
	public ModelRenderer lFoot;
	public ModelRenderer lFootClaw01;
	public ModelRenderer lFootClaw02;
	public ModelRenderer lFootClaw03;
	public ModelRenderer rLeg02;
	public ModelRenderer rLeg03;
	public ModelRenderer rFoot;
	public ModelRenderer rFootClaw01;
	public ModelRenderer rFootClaw02;
	public ModelRenderer rFootClaw03;
	public ModelRenderer lArm02;
	public ModelRenderer lArmFur;
	public ModelRenderer lClawJoint;
	public ModelRenderer lClaw01;
	public ModelRenderer lClaw02;
	public ModelRenderer lClaw03;
	public ModelRenderer rArm02;
	public ModelRenderer rArmFur;
	public ModelRenderer rClawJoint;
	public ModelRenderer rClaw01;
	public ModelRenderer rClaw02;
	public ModelRenderer rClaw03;
	public ModelRenderer head;
	public ModelRenderer fur01;
	public ModelRenderer jawUpper01;
	public ModelRenderer jawLower;
	public ModelRenderer lEar01;
	public ModelRenderer rEar01;
	public ModelRenderer lCheekFur;
	public ModelRenderer rCheekFur;
	public ModelRenderer snout;
	public ModelRenderer jawUpper02;
	public ModelRenderer upperTeeth01;
	public ModelRenderer upperTeeth03;
	public ModelRenderer upperTeeth02;
	public ModelRenderer lowerTeeth01;
	public ModelRenderer lowerTeeth02;
	public ModelRenderer lEar02;
	public ModelRenderer rEar02;
	
	public ModelWerewolf() {
		textureWidth = 128;
		textureHeight = 64;
		lFoot = new ModelRenderer(this, 0, 15);
		lFoot.setRotationPoint(0, 8.7F, -1.2F);
		lFoot.addBox(-2, 0, -2.8F, 4, 2, 5, 0);
		setRotateAngle(lFoot, 0.08726646259971647F, 0, 0.03490658503988659F);
		lCheekFur = new ModelRenderer(this, 26, 4);
		lCheekFur.mirror = true;
		lCheekFur.setRotationPoint(3.5F, -2.5F, -0.6F);
		lCheekFur.addBox(0, -0.8F, -2.3F, 0, 6, 5, 0);
		setRotateAngle(lCheekFur, 0.12217304763960307F, -0.08726646259971647F, -0.5235987755982988F);
		fur04 = new ModelRenderer(this, 90, 35);
		fur04.setRotationPoint(0, -4, 2.9F);
		fur04.addBox(-2.5F, -1, 0, 5, 4, 2, 0);
		setRotateAngle(fur04, 0.5235987755982988F, 0, 0);
		lowerTeeth02 = new ModelRenderer(this, 63, 41);
		lowerTeeth02.mirror = true;
		lowerTeeth02.setRotationPoint(0, 0, 0);
		lowerTeeth02.addBox(-1.6F, -0.7F, 0.3F, 1, 3, 1, 0);
		lowerTeeth01 = new ModelRenderer(this, 63, 41);
		lowerTeeth01.setRotationPoint(0, -3.7F, 0.1F);
		lowerTeeth01.addBox(0.6F, -0.7F, 0.4F, 1, 3, 1, 0);
		rEar02 = new ModelRenderer(this, 78, 0);
		rEar02.mirror = true;
		rEar02.setRotationPoint(0.3F, 0, -0.5F);
		rEar02.addBox(-0.2F, 0, -0.5F, 1, 5, 1, 0);
		setRotateAngle(rEar02, 0.22689280275926282F, 0, 0.2617993877991494F);
		tail01 = new ModelRenderer(this, 112, 18);
		tail01.setRotationPoint(0, 10.1F, 1.8F);
		tail01.addBox(-1.5F, 0, -1.5F, 3, 4, 3, 0);
		setRotateAngle(tail01, 0.2792526803190927F, 0, 0);
		rClawJoint = new ModelRenderer(this, 0, 0);
		rClawJoint.setRotationPoint(0, 10.6F, 0);
		rClawJoint.addBox(0, 0, 0, 1, 1, 1, 0);
		head = new ModelRenderer(this, 44, 0);
		head.setRotationPoint(0, -0.5F, -3.6F);
		head.addBox(-4, -5, -3.4F, 8, 6, 7, 0);
		setRotateAngle(head, 2.1816615649929116F, 0, 0);
		bipedRightLeg = new ModelRenderer(this, 11, 46);
		bipedRightLeg.mirror = true;
		bipedRightLeg.setRotationPoint(-2.7F, 10.2F, -0.4F);
		bipedRightLeg.addBox(-2.3F, -1.1F, -1.9F, 5, 13, 5, 0);
		setRotateAngle(bipedRightLeg, -0.6108652381980153F, 0.22689280275926282F, 0.08726646259971647F);
		chest = new ModelRenderer(this, 49, 15);
		chest.setRotationPoint(0, -10, 2);
		chest.addBox(-5.5F, -9, -4, 11, 11, 8, 0);
		setRotateAngle(chest, 0.2792526803190927F, 0, 0);
		fur05 = new ModelRenderer(this, 90, 43);
		fur05.setRotationPoint(0, 6.7F, 1.6F);
		fur05.addBox(-2, -1, 0, 4, 5, 2, 0);
		setRotateAngle(fur05, 0.6981317007977318F, 0, 0);
		rCheekFur = new ModelRenderer(this, 26, 4);
		rCheekFur.mirror = true;
		rCheekFur.setRotationPoint(-3.5F, -2.5F, -0.6F);
		rCheekFur.addBox(0, -0.8F, -2.3F, 0, 6, 5, 0);
		setRotateAngle(rCheekFur, 0.12217304763960307F, 0.08726646259971647F, 0.6981317007977318F);
		tail02 = new ModelRenderer(this, 111, 26);
		tail02.setRotationPoint(0, 3.7F, 0);
		tail02.addBox(-2, 0, -2, 4, 7, 4, 0);
		setRotateAngle(tail02, -0.20943951023931953F, 0, 0);
		rClaw02 = new ModelRenderer(this, 27, 0);
		rClaw02.mirror = true;
		rClaw02.setRotationPoint(-1, 0.2F, -0.1F);
		rClaw02.addBox(-0.6F, -0.8F, -0.5F, 2, 5, 1, 0);
		setRotateAngle(rClaw02, 0, 0, -0.22689280275926282F);
		rArm01 = new ModelRenderer(this, 32, 47);
		rArm01.mirror = true;
		rArm01.setRotationPoint(-5.6F, -6, 0);
		rArm01.addBox(-2, -2, -2, 4, 12, 4, 0);
		setRotateAngle(rArm01, 0, 0.17453292519943295F, 0.2792526803190927F);
		lClaw02 = new ModelRenderer(this, 27, 0);
		lClaw02.setRotationPoint(1, 0.2F, -0.1F);
		lClaw02.addBox(-1.4F, -0.8F, -0.5F, 2, 5, 1, 0);
		setRotateAngle(lClaw02, 0, 0, 0.22689280275926282F);
		upperTeeth03 = new ModelRenderer(this, 63, 38);
		upperTeeth03.setRotationPoint(0, -3.2F, -1);
		upperTeeth03.addBox(-2.27F, -0.7F, -0.4F, 3, 0, 1, 0);
		setRotateAngle(upperTeeth03, 0, 0, 0.136659280431156F);
		upperTeeth02 = new ModelRenderer(this, 50, 37);
		upperTeeth02.setRotationPoint(-2.8F, -2.8F, -1);
		upperTeeth02.addBox(-0.5F, -1, -0.8F, 1, 4, 2, 0);
		fur01 = new ModelRenderer(this, 90, 0);
		fur01.setRotationPoint(0, -1, -2.9F);
		fur01.addBox(-3.5F, -1, 0, 7, 7, 2, 0);
		setRotateAngle(fur01, 2.1816615649929116F, 0, 0);
		lLeg03 = new ModelRenderer(this, 0, 22);
		lLeg03.setRotationPoint(0, 5.9F, 0.8F);
		lLeg03.addBox(-1.5F, 0, -1.5F, 3, 10, 3, 0);
		setRotateAngle(lLeg03, -0.7853981633974483F, 0, 0.08726646259971647F);
		lArmFur = new ModelRenderer(this, 62, 50);
		lArmFur.setRotationPoint(0.4F, -2, 0);
		lArmFur.addBox(-0.5F, -2.5F, 0.5F, 1, 8, 4, 0);
		setRotateAngle(lArmFur, -0.4363323129985824F, 0.08726646259971647F, 0.08726646259971647F);
		rFootClaw02 = new ModelRenderer(this, 1, 48);
		rFootClaw02.mirror = true;
		rFootClaw02.setRotationPoint(0, 0.5F, -2.6F);
		rFootClaw02.addBox(-0.5F, -0.5F, -1.7F, 1, 2, 3, 0);
		setRotateAngle(rFootClaw02, 0.22689280275926282F, 0, 0);
		jawUpper02 = new ModelRenderer(this, 20, 36);
		jawUpper02.mirror = true;
		jawUpper02.setRotationPoint(0, 0.35F, 0);
		jawUpper02.addBox(-3.6F, -4, -1, 2, 5, 2, 0);
		setRotateAngle(jawUpper02, 0, 0, 0.2792526803190927F);
		fur06 = new ModelRenderer(this, 90, 52);
		fur06.setRotationPoint(0, 8.6F, 1.5F);
		fur06.addBox(-2, -1, 0, 4, 5, 2, 0);
		setRotateAngle(fur06, 0.6981317007977318F, 0, 0);
		lArm02 = new ModelRenderer(this, 49, 46);
		lArm02.setRotationPoint(0, 9.5F, 0);
		lArm02.addBox(-1.5F, -1, -1.5F, 3, 13, 3, 0);
		setRotateAngle(lArm02, -0.6108652381980153F, 0, 0.2792526803190927F);
		stomach = new ModelRenderer(this, 16, 16);
		stomach.setRotationPoint(0, 1.2F, 0.6F);
		stomach.addBox(-5, 0, -3, 10, 12, 6, 0);
		setRotateAngle(stomach, -0.2617993877991494F, 0, 0);
		jawUpper01 = new ModelRenderer(this, 20, 36);
		jawUpper01.setRotationPoint(1.2F, -5.1F, -1.5F);
		jawUpper01.addBox(-0.8F, -4, -1, 2, 5, 2, 0);
		setRotateAngle(jawUpper01, 0, 0, -0.13962634015954636F);
		tail04 = new ModelRenderer(this, 116, 7);
		tail04.setRotationPoint(0, 0, 0.4F);
		tail04.addBox(-1, 0, -1, 2, 7, 2, 0);
		setRotateAngle(tail04, 0.06981317007977318F, 0, 0);
		rLeg02 = new ModelRenderer(this, 0, 35);
		rLeg02.mirror = true;
		rLeg02.setRotationPoint(0, 9.8F, 0.5F);
		rLeg02.addBox(-1.99F, 0, -2, 4, 7, 4, 0);
		setRotateAngle(rLeg02, 1.3089969389957472F, 0, 0);
		lArm01 = new ModelRenderer(this, 32, 47);
		lArm01.setRotationPoint(5.5F, -6, 0);
		lArm01.addBox(-2, -2, -2, 4, 12, 4, 0);
		setRotateAngle(lArm01, 0, -0.17453292519943295F, -0.2792526803190927F);
		lEar01 = new ModelRenderer(this, 70, 0);
		lEar01.setRotationPoint(2.8F, -2.1F, 2.8F);
		lEar01.addBox(0, 0, -1, 1, 3, 2, 0);
		setRotateAngle(lEar01, 0.6981317007977318F, 0.12217304763960307F, -0.6981317007977318F);
		neck = new ModelRenderer(this, 0, 0);
		neck.setRotationPoint(0, -8.2F, 0);
		neck.addBox(-3.5F, -2.5F, -5, 7, 5, 5, 0);
		setRotateAngle(neck, -0.8203047484373349F, 0, 0);
		lFootClaw02 = new ModelRenderer(this, 1, 48);
		lFootClaw02.setRotationPoint(0, 0.5F, -2.6F);
		lFootClaw02.addBox(-0.5F, -0.5F, -1.7F, 1, 2, 3, 0);
		setRotateAngle(lFootClaw02, 0.22689280275926282F, 0, 0);
		rClaw01 = new ModelRenderer(this, 27, 0);
		rClaw01.mirror = true;
		rClaw01.setRotationPoint(-1, 0.2F, 0);
		rClaw01.addBox(-0.6F, -0.8F, -1.6F, 2, 5, 1, 0);
		setRotateAngle(rClaw01, -0.10471975511965977F, 0, -0.22689280275926282F);
		rEar01 = new ModelRenderer(this, 70, 0);
		rEar01.mirror = true;
		rEar01.setRotationPoint(-2.8F, -2.1F, 2.8F);
		rEar01.addBox(-1, 0, -1, 1, 3, 2, 0);
		setRotateAngle(rEar01, 0.6981317007977318F, -0.12217304763960307F, 0.6981317007977318F);
		jawLower = new ModelRenderer(this, 39, 37);
		jawLower.setRotationPoint(0, -4.1F, -3);
		jawLower.addBox(-2, -4.9F, -0.5F, 4, 5, 1, 0);
		fur03 = new ModelRenderer(this, 90, 24);
		fur03.setRotationPoint(0, -7.3F, 2.5F);
		fur03.addBox(-4, -1, 0, 8, 7, 2, 0);
		setRotateAngle(fur03, 0.767944870877505F, 0, 0);
		rArm02 = new ModelRenderer(this, 49, 46);
		rArm02.mirror = true;
		rArm02.setRotationPoint(0, 9.5F, 0);
		rArm02.addBox(-1.5F, -1, -1.5F, 3, 13, 3, 0);
		setRotateAngle(rArm02, -0.6108652381980153F, 0, -0.2792526803190927F);
		bipedLeftLeg = new ModelRenderer(this, 11, 46);
		bipedLeftLeg.setRotationPoint(2.7F, 10.2F, -0.4F);
		bipedLeftLeg.addBox(-2.3F, -1.1F, -1.9F, 5, 13, 5, 0);
		setRotateAngle(bipedLeftLeg, -0.6108652381980153F, -0.22689280275926282F, -0.08726646259971647F);
		rFootClaw03 = new ModelRenderer(this, 1, 48);
		rFootClaw03.mirror = true;
		rFootClaw03.setRotationPoint(-1.3F, 0.5F, -2.6F);
		rFootClaw03.addBox(-0.5F, -0.5F, -1.7F, 1, 2, 3, 0);
		setRotateAngle(rFootClaw03, 0.22689280275926282F, 0.10471975511965977F, 0);
		rFootClaw01 = new ModelRenderer(this, 1, 48);
		rFootClaw01.mirror = true;
		rFootClaw01.setRotationPoint(1.3F, 0.5F, -2.6F);
		rFootClaw01.addBox(-0.5F, -0.5F, -1.7F, 1, 2, 3, 0);
		setRotateAngle(rFootClaw01, 0.22689280275926282F, -0.10471975511965977F, 0);
		lClawJoint = new ModelRenderer(this, 0, 0);
		lClawJoint.setRotationPoint(0, 10.6F, 0);
		lClawJoint.addBox(-0.4F, -0.5F, -0.5F, 1, 1, 1, 0);
		lClaw01 = new ModelRenderer(this, 27, 0);
		lClaw01.setRotationPoint(1, 0.2F, 0);
		lClaw01.addBox(-1.4F, -0.8F, -1.6F, 2, 5, 1, 0);
		setRotateAngle(lClaw01, -0.10471975511965977F, 0, 0.22689280275926282F);
		lEar02 = new ModelRenderer(this, 78, 0);
		lEar02.setRotationPoint(-0.3F, 0, -0.5F);
		lEar02.addBox(-0.8F, 0, -0.5F, 1, 5, 1, 0);
		setRotateAngle(lEar02, 0.22689280275926282F, 0, -0.2617993877991494F);
		rLeg03 = new ModelRenderer(this, 0, 22);
		rLeg03.mirror = true;
		rLeg03.setRotationPoint(0, 5.9F, 0.8F);
		rLeg03.addBox(-1.5F, 0, -1.5F, 3, 10, 3, 0);
		setRotateAngle(rLeg03, -0.7853981633974483F, 0, -0.08726646259971647F);
		upperTeeth01 = new ModelRenderer(this, 56, 37);
		upperTeeth01.setRotationPoint(0.4F, -2.8F, -1);
		upperTeeth01.addBox(-0.5F, -1, -0.8F, 1, 4, 2, 0);
		rArmFur = new ModelRenderer(this, 62, 50);
		rArmFur.mirror = true;
		rArmFur.setRotationPoint(-0.4F, -2, 0);
		rArmFur.addBox(-0.5F, -2.5F, 0.5F, 1, 8, 4, 0);
		setRotateAngle(rArmFur, -0.4363323129985824F, -0.08726646259971647F, -0.08726646259971647F);
		rFoot = new ModelRenderer(this, 0, 14);
		rFoot.mirror = true;
		rFoot.setRotationPoint(0, 8.7F, -1.2F);
		rFoot.addBox(-2, 0, -2.8F, 4, 2, 5, 0);
		setRotateAngle(rFoot, 0.08726646259971647F, 0, -0.03490658503988659F);
		lLeg02 = new ModelRenderer(this, 0, 35);
		lLeg02.setRotationPoint(0, 9.8F, 0.5F);
		lLeg02.addBox(-2.01F, 0.4F, -2, 4, 7, 4, 0);
		setRotateAngle(lLeg02, 1.3089969389957472F, 0, 0);
		lFootClaw03 = new ModelRenderer(this, 1, 48);
		lFootClaw03.setRotationPoint(1.3F, 0.5F, -2.6F);
		lFootClaw03.addBox(-0.5F, -0.5F, -1.7F, 1, 2, 3, 0);
		setRotateAngle(lFootClaw03, 0.22689280275926282F, -0.10471975511965977F, 0);
		snout = new ModelRenderer(this, 29, 35);
		snout.setRotationPoint(0, -4.2F, -0.1F);
		snout.addBox(-1.5F, -5.05F, -1, 3, 5, 2, 0);
		setRotateAngle(snout, 0.18203784098300857F, 0, 0);
		fur02 = new ModelRenderer(this, 90, 11);
		fur02.setRotationPoint(0, -8.4F, 1.4F);
		fur02.addBox(-5, -1, 0, 10, 8, 2, 0);
		setRotateAngle(fur02, 1.2217304763960306F, 0, 0);
		rClaw03 = new ModelRenderer(this, 27, 0);
		rClaw03.mirror = true;
		rClaw03.setRotationPoint(-1, 0.2F, 0.8F);
		rClaw03.addBox(-0.6F, -0.8F, -0.5F, 2, 5, 1, 0);
		setRotateAngle(rClaw03, 0.10471975511965977F, 0, -0.22689280275926282F);
		lClaw03 = new ModelRenderer(this, 27, 0);
		lClaw03.setRotationPoint(1, 0.2F, 0.8F);
		lClaw03.addBox(-1.4F, -0.8F, -0.5F, 2, 5, 1, 0);
		setRotateAngle(lClaw03, 0.10471975511965977F, 0, 0.22689280275926282F);
		tail03 = new ModelRenderer(this, 112, 40);
		tail03.setRotationPoint(0, 6.5F, 0.1F);
		tail03.addBox(-1.5F, 0.2F, -1.5F, 3, 4, 3, 0);
		setRotateAngle(tail03, 0.13962634015954636F, 0, 0);
		lFootClaw01 = new ModelRenderer(this, 1, 48);
		lFootClaw01.setRotationPoint(-1.3F, 0.5F, -2.6F);
		lFootClaw01.addBox(-0.5F, -0.5F, -1.7F, 1, 2, 3, 0);
		setRotateAngle(lFootClaw01, 0.22689280275926282F, 0.10471975511965977F, 0);
		lLeg03.addChild(lFoot);
		head.addChild(lCheekFur);
		chest.addChild(fur04);
		lowerTeeth01.addChild(lowerTeeth02);
		jawLower.addChild(lowerTeeth01);
		rEar01.addChild(rEar02);
		stomach.addChild(tail01);
		rArm02.addChild(rClawJoint);
		neck.addChild(head);
		stomach.addChild(bipedRightLeg);
		stomach.addChild(fur05);
		head.addChild(rCheekFur);
		tail01.addChild(tail02);
		rClawJoint.addChild(rClaw02);
		chest.addChild(rArm01);
		lClawJoint.addChild(lClaw02);
		jawUpper01.addChild(upperTeeth03);
		jawUpper02.addChild(upperTeeth02);
		neck.addChild(fur01);
		lLeg02.addChild(lLeg03);
		lArm02.addChild(lArmFur);
		rFoot.addChild(rFootClaw02);
		jawUpper01.addChild(jawUpper02);
		stomach.addChild(fur06);
		lArm01.addChild(lArm02);
		chest.addChild(stomach);
		head.addChild(jawUpper01);
		tail03.addChild(tail04);
		bipedRightLeg.addChild(rLeg02);
		chest.addChild(lArm01);
		head.addChild(lEar01);
		chest.addChild(neck);
		lFoot.addChild(lFootClaw02);
		rClawJoint.addChild(rClaw01);
		head.addChild(rEar01);
		head.addChild(jawLower);
		chest.addChild(fur03);
		rArm01.addChild(rArm02);
		stomach.addChild(bipedLeftLeg);
		rFoot.addChild(rFootClaw03);
		rFoot.addChild(rFootClaw01);
		lArm02.addChild(lClawJoint);
		lClawJoint.addChild(lClaw01);
		lEar01.addChild(lEar02);
		rLeg02.addChild(rLeg03);
		jawUpper01.addChild(upperTeeth01);
		rArm02.addChild(rArmFur);
		rLeg03.addChild(rFoot);
		bipedLeftLeg.addChild(lLeg02);
		lFoot.addChild(lFootClaw03);
		head.addChild(snout);
		chest.addChild(fur02);
		rClawJoint.addChild(rClaw03);
		lClawJoint.addChild(lClaw03);
		tail02.addChild(tail03);
		lFoot.addChild(lFootClaw01);
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.chest.render(f5);
	}
	
	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
		tail01.rotateAngleY = (MathHelper.cos(limbSwing * 1 / 3f) * 1.4f * limbSwingAmount / 4) + MathHelper.sin(ageInTicks / 4) / 6;
		tail01.rotateAngleX = 1;
		head.rotateAngleY = netHeadYaw * ((float) Math.PI / 180f);
		head.rotateAngleX = headPitch * ((float) Math.PI / 180f) + 2;
		lArm01.rotateAngleX = MathHelper.cos(limbSwing * 2 / 3f) * limbSwingAmount * 0.5f + MathHelper.sin(ageInTicks / 12) / 8;
		rArm01.rotateAngleX = MathHelper.cos(limbSwing * 2 / 3f + (float) Math.PI) * limbSwingAmount * 0.5f + -MathHelper.sin(ageInTicks / 12) / 8;
		bipedLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 2 / 3f + (float) Math.PI) * 2 / 3f * limbSwingAmount - 0.5f;
		bipedLeftLeg.rotateAngleY = -1 / 10f;
		bipedRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 2 / 3f) * 2 / 3f * limbSwingAmount - 0.5f;
		bipedRightLeg.rotateAngleY = 1 / 10f;
		chest.rotateAngleY = MathHelper.sin(MathHelper.sqrt(swingProgress) * ((float) Math.PI) * 2) * 0.2f;
		lArm01.rotateAngleY = 0;
		lArm01.rotateAngleZ = -1 / 4f;
		rArm01.rotateAngleY = 0;
		rArm01.rotateAngleZ = 1 / 4f;
		//ModelRenderer arm = entity.swingingHand == EnumHand.MAIN_HAND ? rArm01 : lArm01;
		//int val = (arm == rArm01 ? 1 : -1);
		//if (val < 0) chest.rotateAngleY *= -1;
		//arm.rotateAngleX -= (float) Math.sin(swingProgress * Math.PI) * (val < 0 ? 1.5f : 1.75f);
		//arm.rotateAngleY = (float) Math.sin(swingProgress * Math.PI) / 3 * -val;
		//arm.rotateAngleZ = (float) Math.sin(swingProgress * Math.PI * val) + (2 / 7f * val);
	}
	
	//@Override
	//public void postRenderArm(float scale, EnumHandSide side) {
	//	(side == HandSide.LEFT ? lArm01 : rArm01).postRender(scale);
	//}
	
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}