package com.example.cccandroidtest.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.cccandroidtest.models.EstimateModel

/**
 * @author jakhongirjalilov
 * @version 2.0
 * @data 1/14/21
 * @project cccandroidtest
 */

@Dao
interface EstimateDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addEstimate(estimateModel: EstimateModel)

    @Query("SELECT * FROM estimate")
    fun getEstimate(): List<EstimateModel>
}