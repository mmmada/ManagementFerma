package com.management.equualact.EquualactDatabaseDao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.management.equualact.EquualactDatabaseEntities.Magar;

import java.util.List;

/**
 * Created by User on 10/31/2017.
 */
@Dao
public interface MagarDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void addMagar(Magar magar);

    @Query("SELECT nume FROM Magar")
    public List<String> getAllAnimals();

    @Query("SELECT * FROM Magar WHERE sex = :sexMagar")
    public List<Magar> getMagarBySex(String sexMagar);

    @Query("SELECT * FROM Magar WHERE nume = :numeMagar")
    public List<Magar> getMagarByName(String numeMagar);

    @Query("SELECT * FROM Magar WHERE idMagar = :idMagar")
    public Magar getMagarDetailsById(long idMagar);

    @Update(onConflict = OnConflictStrategy.REPLACE)
    void updateMagar(Magar magar);
}
