package codemakers.daggermvp.data.model

import java.util.Date

class Todo(var id: Long?,
           var title: String?,
           var description: String?,
           var date: Date) {

    constructor(title: String, description: String?) : this(null, title, description, Date())
}