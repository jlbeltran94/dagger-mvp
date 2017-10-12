package codemakers.daggermvp.ui.main

import codemakers.daggermvp.data.model.Todo
import io.reactivex.Observable

/**
 * Created by jlbel on 22/09/2017.
 */
interface MainView{

    fun onClickAdd():Observable<Unit>
    fun onClickRemove():Observable<Todo>
    fun goToAdd()
}