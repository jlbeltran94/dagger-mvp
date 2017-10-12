package codemakers.daggermvp.di.components

import android.app.Application
import codemakers.daggermvp.App
import codemakers.daggermvp.di.ActivityBuilders
import codemakers.daggermvp.di.modules.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/**
 * Created by jlbel on 22/09/2017.
 */
@Singleton
@Component(modules = arrayOf(
        AndroidInjectionModule::class,
        AppModule::class,
        ActivityBuilders::class
))
interface AppComponent{


    fun inject(app:App)

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun applicacion(application: Application):Builder
        fun build():AppComponent
    }
}