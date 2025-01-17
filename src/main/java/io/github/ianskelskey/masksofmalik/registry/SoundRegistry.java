package io.github.ianskelskey.masksofmalik.registry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static io.github.ianskelskey.masksofmalik.MasksOfMalikMod.MODID;

public class SoundRegistry {

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MODID);
    public static final RegistryObject<SoundEvent> MALIK_DEMO = registerSoundEvent("malik_demo");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name)
    {
        ResourceLocation id = new ResourceLocation(MODID, name);
        return SOUNDS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void registerAll(IEventBus modEventBus) {
        SOUNDS.register(modEventBus);
    }
}
