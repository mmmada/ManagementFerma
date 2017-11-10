package com.management.equualact.EquualactDatabaseDao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.management.equualact.EquualactDatabaseEntities.Lapte;

import java.util.List;

/**
 * Created by User on 11/10/2017.
 */
@Dao
public interface LapteDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void addLapteRecord(Lapte lapte);

    @Query("SELECT cantitate FROM Lapte WHERE idMagar= :idMagar")
    List<Long> getCantitateByIdMagar(String idMagar);

    @Update(onConflict = OnConflictStrategy.IGNORE)
    void updateLapte(Lapte lapte);
}
