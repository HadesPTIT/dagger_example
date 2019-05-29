package com.hariofspades.dagger2advanced.interfaces;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Annotation co the duoc hieu la mot dang chut thich hoac metadata duoc chen vao code java de dac ta du lieu cho mot doi tuong, gia tri nao do
 * No co the duoc xu ly tai thoi diem compile hoac runtime.
 * Refs : https://gpcoder.com/2850-huong-dan-su-dung-java-annotation/#Co_ban_ve_Annotations
 * @Scope : http://frogermcs.github.io/dependency-injection-with-dagger-2-custom-scopes/
 */

/**
 * @Scope annotation tell dagger to create single instance even if <DaggerComponent>.build() is called many times
 */

@Scope
@Retention(RetentionPolicy.CLASS)
public @interface RandomUserApplicationScope {
}
