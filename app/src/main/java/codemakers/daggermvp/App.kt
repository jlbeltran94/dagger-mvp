package codemakers.daggermvp

import android.app.Activity
import android.app.Application
import codemakers.daggermvp.di.components.AppComponent
import codemakers.daggermvp.di.components.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 * Created by jlbel on 22/09/2017.
 */
class App:Application(), HasActivityInjector{

    @Inject
    lateinit var injector:DispatchingAndroidInjector<Activity>

    override fun activityInjector(): AndroidInjector<Activity>
        = injector

    val appComponent:AppComponent by lazy {
        DaggerAppComponent.builder()
                .applicacion(this)
                .build()
    }

    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this)
    }
}