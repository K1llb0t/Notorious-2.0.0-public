// 
// Decompiled by Procyon v0.5.36
// 

package me.gavin.notorious.command;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
public @interface RegisterCommand {
    String name();
    
    String syntax();
    
    String[] aliases();
    
    String description() default "No description.";
}
