package com.hariofspades.dagger2advanced.module;

import android.content.Context;

import com.hariofspades.dagger2advanced.interfaces.RandomUserApplicationScope;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    private final Context context;


    public ActivityModule(Context context) {
        this.context = context;
    }

    @RandomUserApplicationScope
    @Provides
    public Context context() {
        return context;
    }
}
