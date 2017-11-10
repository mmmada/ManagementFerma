package com.management.equualact.EquualactDatabaseDao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.management.equualact.EquualactDatabaseEntities.Sanatate;

import java.util.List;

/**
 * Created by User on 11/10/2017.
 */
@Dao
public interface SanatateDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void addSanatate(Sanatate sanatate);

    @Query("SELECT * FROM Sanatate WHERE idMagar= :idMagar")
    List<Sanatate> getSanatateByIdMagar(String idMagar);

    @Update(onConflict = OnConflictStrategy.IGNORE)
    void updateSanatate(Sanatate sanatate);
}
