package com.management.equualact.EquualactDatabaseDao;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.management.equualact.EquualactDatabaseEntities.FemelaPui;
import com.management.equualact.EquualactDatabaseEntities.InfoFemela;
import com.management.equualact.EquualactDatabaseEntities.Interventie;
import com.management.equualact.EquualactDatabaseEntities.Lapte;
import com.management.equualact.EquualactDatabaseEntities.Magar;
import com.management.equualact.EquualactDatabaseEntities.Sanatate;

/**
 * Created by User on 11/10/2017.
 */
@Database(entities = {FemelaPui.class, InfoFemela.class, Interventie.class, Lapte.class, Magar.class, Sanatate.class}, version = 1)
public abstract class EquualactDatabase extends RoomDatabase {

    public abstract FemelaPuiDao femelaPuiDao();

    public abstract InfoFemelaDao infoFemelaDao();

    public abstract InterventieDao interventieDao();

    public abstract LapteDao lapteDao();

    public abstract MagarDao magarDao();

    public abstract SanatateDao sanatateDao();
}
