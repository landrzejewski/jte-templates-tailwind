package pl.training;

import gg.jte.generated.precompiled.layout.JtemainGenerated;
import gg.jte.generated.precompiled.pages.JtehomeGenerated;
import gg.jte.generated.precompiled.pages.JteprojectsGenerated;
import gg.jte.generated.precompiled.pages.JteteamGenerated;
import org.springframework.aot.hint.RuntimeHintsRegistrar;

import static org.springframework.aot.hint.MemberCategory.INVOKE_DECLARED_CONSTRUCTORS;
import static org.springframework.aot.hint.MemberCategory.INVOKE_DECLARED_METHODS;

public class RuntimeHints implements RuntimeHintsRegistrar {

    @Override
    public void registerHints(org.springframework.aot.hint.RuntimeHints hints, ClassLoader classLoader) {
        hints.resources()
                .registerPattern("**/*.bin");
        hints.reflection()
                .registerType(JtemainGenerated.class, INVOKE_DECLARED_CONSTRUCTORS, INVOKE_DECLARED_METHODS)
                .registerType(JtehomeGenerated.class, INVOKE_DECLARED_CONSTRUCTORS, INVOKE_DECLARED_METHODS)
                .registerType(JteprojectsGenerated.class, INVOKE_DECLARED_CONSTRUCTORS, INVOKE_DECLARED_METHODS)
                .registerType(JteteamGenerated.class, INVOKE_DECLARED_CONSTRUCTORS, INVOKE_DECLARED_METHODS);
    }

}