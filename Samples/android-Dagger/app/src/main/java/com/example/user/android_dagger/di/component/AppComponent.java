package com.example.user.android_dagger.di.component;

import com.example.user.android_dagger.di.module.AppModule;
import com.example.user.android_dagger.di.module.UserModule;

import dagger.Component;

/**
 * Created by singh on 27-Sep-17.
 */


@Component(modules = AppModule.class)
public interface AppComponent {

    UserComponent plus(UserModule userModule);
//    CalcComponent plus(CalcModule calcModule);
}
