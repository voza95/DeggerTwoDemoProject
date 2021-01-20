package com.example.deggertwodemoproject.di

import android.app.Application
import com.example.deggertwodemoproject.BaseApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(modules = [
    AndroidSupportInjectionModule::class,
    ActivityBuilderModule::class,
])
interface AppComponent : AndroidInjector<BaseApplication?> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        abstract fun application(application: Application?): Builder?

        abstract fun build(): AppComponent?
    }
}