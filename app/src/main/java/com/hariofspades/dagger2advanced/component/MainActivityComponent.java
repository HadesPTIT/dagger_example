package com.hariofspades.dagger2advanced.component;

import com.hariofspades.dagger2advanced.MainActivity;
import com.hariofspades.dagger2advanced.interfaces.ActivityScope;

import dagger.Component;

@ActivityScope
@Component(dependencies = RandomUserComponent.class)
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
