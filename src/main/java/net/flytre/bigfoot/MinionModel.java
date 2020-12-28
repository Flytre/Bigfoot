// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

package net.flytre.bigfoot;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class MinionModel extends EntityModel<MinionEntity> {
    private final ModelPart body1;
    private final ModelPart larm;
    private final ModelPart lelbow;
    private final ModelPart leftfist;
    private final ModelPart rarm;
    private final ModelPart relbow;
    private final ModelPart rightfist;
    private final ModelPart head;
    private final ModelPart headfloof;
    private final ModelPart snout;
    private final ModelPart jaw;
    private final ModelPart jaw2;
    private final ModelPart eyebrow;
    private final ModelPart body2;
    private final ModelPart leftthigh;
    private final ModelPart leftknee;
    private final ModelPart leftfoot;
    private final ModelPart rightthigh;
    private final ModelPart rightknee;
    private final ModelPart rightfoot;

    public MinionModel() {
        textureWidth = 256;
        textureHeight = 256;
        body1 = new ModelPart(this);
        body1.setPivot(0.0F, 7.2F, 0.0F);
        setRotationAngle(body1, 0.6255F, 0.0F, 0.0F);
        body1.setTextureOffset(0, 225).addCuboid(-7.5F, -12.7F, -6.5F, 15.0F, 15.0F, 13.0F, 0.0F, false);

        larm = new ModelPart(this);
        larm.setPivot(-7.0F, -11.8F, 0.0F);
        body1.addChild(larm);
        setRotationAngle(larm, -0.6255F, 0.0F, 0.2737F);
        larm.setTextureOffset(0, 150).addCuboid(-6.0F, 0.0F, -3.0F, 6.0F, 16.0F, 6.0F, 0.0F, false);

        lelbow = new ModelPart(this);
        lelbow.setPivot(-3.2F, 13.0F, 0.0F);
        larm.addChild(lelbow);
        setRotationAngle(lelbow, 0.0F, 0.0F, -0.2737F);
        lelbow.setTextureOffset(30, 152).addCuboid(-4.0F, 0.0F, -4.0F, 8.0F, 12.0F, 8.0F, 0.0F, false);

        leftfist = new ModelPart(this);
        leftfist.setPivot(0.0F, 9.9F, 0.0F);
        lelbow.addChild(leftfist);
        setRotationAngle(leftfist, 0.0F, 0.0F, -0.0764F);
        leftfist.setTextureOffset(70, 160).addCuboid(-3.5F, 0.0F, -3.5F, 7.0F, 5.0F, 7.0F, 0.0F, false);

        rarm = new ModelPart(this);
        rarm.setPivot(7.0F, -11.8F, 0.0F);
        body1.addChild(rarm);
        setRotationAngle(rarm, -0.6109F, 0.0F, -0.2737F);
        rarm.setTextureOffset(0, 110).addCuboid(0.0F, 0.0F, -3.0F, 6.0F, 16.0F, 6.0F, 0.0F, false);

        relbow = new ModelPart(this);
        relbow.setPivot(3.2F, 13.0F, 0.0F);
        rarm.addChild(relbow);
        setRotationAngle(relbow, 0.0F, 0.0F, 0.2737F);
        relbow.setTextureOffset(30, 110).addCuboid(-4.0F, 0.0F, -4.0F, 8.0F, 12.0F, 8.0F, 0.0F, false);

        rightfist = new ModelPart(this);
        rightfist.setPivot(0.0F, 9.9F, 0.0F);
        relbow.addChild(rightfist);
        setRotationAngle(rightfist, 0.0F, 0.0F, 0.0764F);
        rightfist.setTextureOffset(70, 120).addCuboid(-3.5F, 0.0F, -3.5F, 7.0F, 5.0F, 7.0F, 0.0F, false);

        head = new ModelPart(this);
        head.setPivot(0.0F, -11.8F, 2.1F);
        body1.addChild(head);
        setRotationAngle(head, -0.43F, 0.0F, 0.0F);
        head.setTextureOffset(0, 190).addCuboid(-5.0F, -8.0F, -9.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);

        headfloof = new ModelPart(this);
        headfloof.setPivot(0.0F, -0.4F, -7.0F);
        head.addChild(headfloof);
        setRotationAngle(headfloof, 1.4074F, 0.0F, 0.0F);
        headfloof.setTextureOffset(50, 190).addCuboid(-4.5F, -2.0F, 0.0F, 9.0F, 12.0F, 10.0F, 0.0F, false);

        snout = new ModelPart(this);
        snout.setPivot(0.0F, -0.2F, -8.0F);
        head.addChild(snout);
        snout.setTextureOffset(0, 20).addCuboid(-3.0F, -2.0F, -3.0F, 6.0F, 3.0F, 3.0F, 0.0F, false);

        jaw = new ModelPart(this);
        jaw.setPivot(0.0F, 1.0F, -1.0F);
        snout.addChild(jaw);
        setRotationAngle(jaw, 0.3452F, 0.0F, 0.0F);
        jaw.setTextureOffset(0, 0).addCuboid(-3.0F, 0.0F, -2.0F, 6.0F, 1.0F, 2.0F, 0.0F, false);

        jaw2 = new ModelPart(this);
        jaw2.setPivot(0.0F, 0.0F, -0.59F);
        jaw2.addChild(jaw);
        jaw2.setTextureOffset(0, 10).addCuboid(-3.05F, -2.0F, -1.5F, 6.0F, 2.0F, 2.0F, 0.0F, false);

        eyebrow = new ModelPart(this);
        eyebrow.setPivot(0.0F, -5.0F, -10.0F);
        head.addChild(eyebrow);
        eyebrow.setTextureOffset(0, 30).addCuboid(-3.5F, 0.0F, 0.0F, 7.0F, 1.0F, 1.0F, 0.0F, false);

        body2 = new ModelPart(this);
        body2.setPivot(0.0F, -2.2F, -2.5F);
        body1.addChild(body2);
        setRotationAngle(body2, 0.8601F, 0.0F, 0.0F);
        body2.setTextureOffset(80, 220).addCuboid(-7.0F, 0.0F, -6.0F, 14.0F, 21.0F, 12.0F, 0.0F, false);

        leftthigh = new ModelPart(this);
        leftthigh.setPivot(-7.0F, 15.1F, 2.5F);
        body2.addChild(leftthigh);
        setRotationAngle(leftthigh, -0.0782F, 0.0F, 0.0F);
        leftthigh.setTextureOffset(0, 80).addCuboid(-9.0F, -4.5F, -10.0F, 9.0F, 9.0F, 10.0F, 0.0F, false);

        leftknee = new ModelPart(this);
        leftknee.setPivot(-4.5F, -1.0F, -7.8F);
        leftthigh.addChild(leftknee);
        setRotationAngle(leftknee, 0.2737F, 0.0F, 0.0F);
        leftknee.setTextureOffset(45, 85).addCuboid(-3.5F, -3.5F, -8.0F, 7.0F, 7.0F, 8.0F, 0.0F, false);

        leftfoot = new ModelPart(this);
        leftfoot.setPivot(-0.01F, 3.5F, -8.0F);
        leftknee.addChild(leftfoot);
        setRotationAngle(leftfoot, -0.1173F, 0.0F, 0.0F);
        leftfoot.setTextureOffset(85, 89).addCuboid(-3.5F, -10.0F, -3.0F, 7.0F, 10.0F, 3.0F, 0.0F, false);

        rightthigh = new ModelPart(this);
        rightthigh.setPivot(7.0F, 15.1F, 2.5F);
        body2.addChild(rightthigh);
        setRotationAngle(rightthigh, -0.0782F, 0.0F, 0.0F);
        rightthigh.setTextureOffset(0, 40).addCuboid(0.0F, -4.5F, -10.0F, 9.0F, 9.0F, 10.0F, 0.0F, false);

        rightknee = new ModelPart(this);
        rightknee.setPivot(4.5F, -1.0F, -7.8F);
        rightthigh.addChild(rightknee);
        setRotationAngle(rightknee, 0.2737F, 0.0F, 0.0F);
        rightknee.setTextureOffset(45, 45).addCuboid(-3.5F, -3.5F, -8.0F, 7.0F, 7.0F, 8.0F, 0.0F, false);

        rightfoot = new ModelPart(this);
        rightfoot.setPivot(0.01F, 3.5F, -8.0F);
        rightknee.addChild(rightfoot);
        setRotationAngle(rightfoot, -0.1173F, 0.0F, 0.0F);
        rightfoot.setTextureOffset(85, 49).addCuboid(-3.5F, -10.0F, -3.0F, 7.0F, 10.0F, 3.0F, 0.0F, false);
    }

    @Override
    public void setAngles(MinionEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {

        body1.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelPart bone, float x, float y, float z) {
        bone.pitch = x;
        bone.yaw = y;
        bone.roll = z;
    }

}