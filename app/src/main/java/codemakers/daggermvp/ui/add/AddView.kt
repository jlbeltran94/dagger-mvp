package codemakers.daggermvp.ui.add

import codemakers.daggermvp.data.model.Todo
import io.reactivex.Observable

/**
 * Created by jlbel on 22/09/2017.
 */
interface AddView{
    fun onClickAdd():Observable<Todo>
    fun todoAdded()
}