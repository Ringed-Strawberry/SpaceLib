package ringed_strawberry.github.io.spacelib.particle;

import net.minecraft.particle.ParticleType;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ParticleGen {
    private static ParticleType registerParticle(Identifier id, ParticleType particleType){
        return Registry.register(Registries.PARTICLE_TYPE, id, particleType);
    }

    private static SimpleParticleType registerSimpleParticle(Identifier id, SimpleParticleType particleType){
        return (SimpleParticleType) registerParticle(id, particleType);
    }
}
