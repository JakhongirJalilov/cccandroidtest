package com.example.cccandroidtest.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey


@Entity(
    tableName = "estimate"
)
data class EstimateModel(
    @PrimaryKey(autoGenerate = false) @ColumnInfo(name = "id") val id: String = "", // c574b0b4-bdef-4b92-a8f0-608a86ccf5ab
    @ColumnInfo(name = "company") val company: String = "", // Placebo Secondary School
    @ColumnInfo(name = "address") val address: String = "", // 32 Commissioners Road East
    @ColumnInfo(name = "number") val number: Int = 0, // 32
    @ColumnInfo(name = "revision_number") val revision_number: Int = 0, // 3
    @ColumnInfo(name = "created_date") val created_date: String = "", // 2020-08-22 15:23:54
    @ColumnInfo(name = "created_by") val created_by: String = "", // 85a57f85-a52d-4137-a0d1-62e61362f716
    @ColumnInfo(name = "requested_by") val requested_by: String = "", // 85a57f85-a52d-4137-a0d1-62e61362f716
    @ColumnInfo(name = "contact") val contact: String = "" // 85a57f85-a52d-4137-a0d1-62e61362f716
)