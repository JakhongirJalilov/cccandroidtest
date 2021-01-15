package com.example.cccandroidtest.models

import androidx.room.ColumnInfo

/**
 * @author jakhongirjalilov
 * @version 2.0
 * @data 1/15/21
 * @project test2
 */

data class EstDetails(
    val id: Int,
    val first_name: String,
    val last_name: String,
    val phone_number: String,
    val company: String = "",
    val address: String = "",
    val number: Int,
    val revision_number: Int,
    val created_date: String
)