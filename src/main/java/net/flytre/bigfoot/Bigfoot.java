package net.flytre.bigfoot;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import software.bernie.geckolib3.GeckoLib;


public class Bigfoot implements ModInitializer {

    public static final EntityType<MinionEntity> MINION = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("bigfoot", "bigfoot"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, MinionEntity::new).dimensions(EntityDimensions.fixed(2.0f, 2.0f)).build()
    );


    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.
        FabricDefaultAttributeRegistry.register(MINION, MinionEntity.createAttributes());
        System.out.println("Bigfoot loading!");
        GeckoLib.initialize();
    }
}
