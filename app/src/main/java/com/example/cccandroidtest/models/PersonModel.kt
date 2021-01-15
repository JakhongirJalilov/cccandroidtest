package com.example.cccandroidtest.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "person")
data class PersonModel(
    @PrimaryKey(autoGenerate = false) val id: String = "", // 85a57f85-a52d-4137-a0d1-62e61362f716
    @ColumnInfo(name = "first_name") val first_name: String = "", // Joseph
    @ColumnInfo(name = "last_name")val last_name: String = "", // Sham
    @ColumnInfo(name = "email")val email: String = "", // joseph.sham@fake.fake
    @ColumnInfo(name = "phone_number")val phone_number: String = "" // 123-456-7890
)