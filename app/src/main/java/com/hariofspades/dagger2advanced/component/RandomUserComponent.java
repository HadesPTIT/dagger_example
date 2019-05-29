package com.hariofspades.dagger2advanced.component;

import com.hariofspades.dagger2advanced.interfaces.RandomUserApplicationScope;
import com.hariofspades.dagger2advanced.interfaces.RandomUsersApi;
import com.hariofspades.dagger2advanced.module.PicassoModule;
import com.hariofspades.dagger2advanced.module.RandomUsersModule;
import com.squareup.picasso.Picasso;

import dagger.Component;

// TODO : STEP 2 - Create Component interface
//@Component
// TODO : STEP 5 - include needed module to Components
//@Component(modules = {RandomUsersModule.class, PicassoModule.class})
// TODO : STEP 6 - custom scope ( in this project is singleton )
@RandomUserApplicationScope
@Component(modules = {RandomUsersModule.class, PicassoModule.class})
public interface RandomUserComponent {

    RandomUsersApi getRandomUserService();

    Picasso getPicasso();

}
