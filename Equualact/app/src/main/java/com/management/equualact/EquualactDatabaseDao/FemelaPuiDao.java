package com.management.equualact.EquualactDatabaseDao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.management.equualact.EquualactDatabaseEntities.FemelaPui;

/**
 * Created by User on 11/10/2017.
 */
@Dao
public interface FemelaPuiDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void addPui(FemelaPui femelaPui);

    @Query("SELECT * FROM FemelaPui WHERE idMama= :idMama")
    void getPuiByIdMama(String idMama);
}
