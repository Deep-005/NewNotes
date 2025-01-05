package com.example.newnotes.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "notes")
@Parcelize
data class Note(
    val noteTitle:String,
    val noteDescription:String,
    @PrimaryKey(autoGenerate = true) val id:Int
):Parcelable
