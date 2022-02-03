package com.kosztolanyi.borutoapp.data.local

import androidx.room.TypeConverter

class DatabaseConverter {

    private val separator = ","

    @TypeConverter
    fun convertListToString(list : List<String>) : String{
        val stringBuilder = StringBuilder()
        list.forEach { string ->
            stringBuilder.append(string).append(separator)
        }
        stringBuilder.setLength(stringBuilder.length - 1)
        return stringBuilder.toString()
    }

    @TypeConverter
    fun convertStringToList(string: String) : List<String>{
        return string.split(separator)
    }
}