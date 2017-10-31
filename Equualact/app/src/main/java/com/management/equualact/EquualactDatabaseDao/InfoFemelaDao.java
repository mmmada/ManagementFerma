package com.management.equualact.EquualactDatabaseDao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.management.equualact.EquualactDatabaseEntities.InfoFemela;

import java.util.List;

/**
 * Created by User on 10/31/2017.
 */
@Dao
public interface InfoFemelaDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void addInfoFemela(InfoFemela infoFemela);

    @Query("SELECT * FROM infoFemela WHERE idMagar= :idFemela")
    List<InfoFemela> getInfoFemelaById(long idFemela);

    @Update(onConflict = OnConflictStrategy.REPLACE)
    void updateInfoFemela(InfoFemela infoFemela);
}
