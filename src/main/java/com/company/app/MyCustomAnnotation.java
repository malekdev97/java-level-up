package com.company.app;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// by using @interface we're telling the compiler that this is a custom annotation definition

@Target(ElementType.METHOD)
public @interface MyCustomAnnotation {
}
