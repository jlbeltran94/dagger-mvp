package codemakers.daggermvp.data.dao

import android.arch.persistence.room.*
import codemakers.daggermvp.data.model.Todo
import io.reactivex.Flowable

/**
 * Created by jlbel on 22/09/2017.
 */
@Dao
interface TodoDao {

    @Insert
    fun insert(todo: Todo)

    @Update
    fun update(todo: Todo)

    @Delete
    fun delete(todo:Todo)

    @Query("SELECT * FROM todo")
    fun all():Flowable<List<Todo>>
}