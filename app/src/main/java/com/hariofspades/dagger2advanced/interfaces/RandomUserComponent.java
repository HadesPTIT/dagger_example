package com.hariofspades.dagger2advanced.interfaces;

import com.hariofspades.dagger2advanced.module.PicassoModule;
import com.hariofspades.dagger2advanced.module.RandomUsersModule;
import com.squareup.picasso.Picasso;

import dagger.Component;

// TODO : STEP 2 - Create Component interface
//@Component
// TODO : STEP 5 - include needed module to Components
@Component(modules = {RandomUsersModule.class, PicassoModule.class})
public interface RandomUserComponent {

    RandomUsersApi getRandomUserService();

    Picasso getPicasso();

}
