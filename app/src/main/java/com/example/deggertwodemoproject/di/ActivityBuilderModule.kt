package com.example.deggertwodemoproject.di

import com.example.deggertwodemoproject.AuthActivity
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @Module
    companion object{
        @Provides
        @JvmStatic
        fun someString(): String{
            return "This is a test string"
        }
    }

    @ContributesAndroidInjector
    abstract fun contributeAuthActivity(): AuthActivity?

}