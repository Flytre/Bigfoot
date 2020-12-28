package net.flytre.bigfoot;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class MinionRenderer extends MobEntityRenderer<MinionEntity, MinionModel> {

    public MinionRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new MinionModel(), 0.5f);
    }


    @Override
    public Identifier getTexture(MinionEntity entity) {
        return new Identifier("bigfoot:textures/entity/minion.png");
    }
}
