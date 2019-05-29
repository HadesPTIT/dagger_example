package com.hariofspades.dagger2advanced.component;

import com.hariofspades.dagger2advanced.MainActivity;
import com.hariofspades.dagger2advanced.interfaces.MainActivityScope;
import com.hariofspades.dagger2advanced.module.MainActivityModule;

import dagger.Component;

@Component(modules = MainActivityModule.class, dependencies = RandomUserComponent.class)
@MainActivityScope
public interface MainActivityComponent {

//    RandomUserAdapter getRandomUserAdapter();
//
//    RandomUsersApi getRandomUserService();

    /**
     * when Dagger finds the void method — no return type,
     * it knows that there must be something that it needs in the class.
     * So we will inject RandomUserAdapter & RandomUserApi in MainActivity.
     */
    void injectMainActivity(MainActivity mainActivity);

}
