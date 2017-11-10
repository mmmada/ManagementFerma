package com.management.equualact.EquualactDatabaseDao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.management.equualact.EquualactDatabaseEntities.Interventie;

import java.util.List;

/**
 * Created by User on 11/10/2017.
 */
@Dao
public interface InterventieDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void addInterventie(Interventie interventie);

    @Query("SELECT * FROM Interventie WHERE idMagar= :idMagar")
    List<Interventie> getInterventiiByIdMagar(String idMagar);

    @Update(onConflict = OnConflictStrategy.IGNORE)
    void updateInterventie(Interventie interventie);
}
