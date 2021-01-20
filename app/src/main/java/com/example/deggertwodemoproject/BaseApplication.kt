package com.example.deggertwodemoproject

import com.example.deggertwodemoproject.di.AppComponent
import com.example.deggertwodemoproject.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class BaseApplication : DaggerApplication() {

    override fun applicationInjector(): AppComponent? {
        return DaggerAppComponent.builder().application(this)?.build()
    }

}