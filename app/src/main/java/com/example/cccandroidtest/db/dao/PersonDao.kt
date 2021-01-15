package com.example.cccandroidtest.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.cccandroidtest.models.EstDetails
import com.example.cccandroidtest.models.PersonModel
import io.reactivex.Completable
import io.reactivex.Flowable

/**
 * @author jakhongirjalilov
 * @version 2.0
 * @data 1/14/21
 * @project cccandroidtest
 */

@Dao
interface PersonDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addPerson(personModel: PersonModel) : Completable

    @Query("SELECT person.id, person.first_name, person.last_name, person.phone_number, estimate.company, estimate.address, estimate.number, estimate.revision_number, estimate.created_date  FROM person, estimate WHERE person.id == estimate.requested_by AND person.id == estimate.created_by AND person.id == estimate.contact")
    fun getPerson(): Flowable<List<EstDetails>>
}