package codemakers.daggermvp.di.modules

import codemakers.daggermvp.di.ActivityScope
import codemakers.daggermvp.ui.adapters.TodoAdapter
import dagger.Module
import dagger.Provides

/**
 * Created by jlbel on 22/09/2017.
 */
@Module
class MainModule{

    @ActivityScope
    @Provides
    fun provideAdapter():TodoAdapter = TodoAdapter()
}