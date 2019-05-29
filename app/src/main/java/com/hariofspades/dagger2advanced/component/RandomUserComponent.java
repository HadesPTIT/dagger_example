package com.hariofspades.dagger2advanced.component;

import com.hariofspades.dagger2advanced.interfaces.RandomUsersApi;
import com.hariofspades.dagger2advanced.module.RandomUsersModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = RandomUsersModule.class)
public interface RandomUserComponent {

    RandomUsersApi getRandomUserService();
}
