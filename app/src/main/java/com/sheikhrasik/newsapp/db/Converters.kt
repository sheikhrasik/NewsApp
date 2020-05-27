package com.sheikhrasik.newsapp.db

import androidx.room.TypeConverter
import javax.xml.transform.Source

class Converters {

    @TypeConverter
    fun fromSource(source: com.sheikhrasik.newsapp.model.Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): com.sheikhrasik.newsapp.model.Source {
        return com.sheikhrasik.newsapp.model.Source(name, name)
    }
}