package com.hariofspades.dagger2advanced.module;

import android.content.Context;

import com.hariofspades.dagger2advanced.interfaces.ApplicationContext;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {

    Context context;

    public ContextModule(Context context) {
        this.context = context;
    }

    @ApplicationContext
    @Singleton
    @Provides
    public Context context() {
        return context.getApplicationContext();
    }

}
