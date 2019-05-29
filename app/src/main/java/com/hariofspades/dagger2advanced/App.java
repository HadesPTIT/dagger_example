package com.hariofspades.dagger2advanced;

import android.app.Activity;
import android.app.Application;

import com.hariofspades.dagger2advanced.component.DaggerRandomUserComponent;
import com.hariofspades.dagger2advanced.component.RandomUserComponent;
import com.hariofspades.dagger2advanced.module.ContextModule;

import timber.log.Timber;

public class App extends Application {

    private RandomUserComponent randomUserComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());

        randomUserComponent = DaggerRandomUserComponent.builder()
                .contextModule(new ContextModule(this))
                .build();
    }

    public static App get(Activity activity) {
        return (App) activity.getApplication();
    }

    public RandomUserComponent getRandomUserComponent() {
        return randomUserComponent;
    }
}
