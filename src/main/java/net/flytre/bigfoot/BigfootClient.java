package net.flytre.bigfoot;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

public class BigfootClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.INSTANCE.register(Bigfoot.MINION, (dispatcher, context) -> {
            return new MinionRenderer(dispatcher);
        });
    }
}
