package com.management.equualact.EquualactDatabaseEntities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

/**
 * Created by User on 10/31/2017.
 */
@Entity(tableName = "infoFemele",
        foreignKeys = {
                @ForeignKey(entity = Magar.class,
                        parentColumns = "idInterventie",
                        childColumns = "idMagar",
                        onDelete = ForeignKey.NO_ACTION
                )},
        indices = { @Index(value = "idInterventie")}
)
public class Interventie {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "idInterventie")
    private long idInterventie;

    @ColumnInfo(name = "idMagar")
    private long idMagar;

    @ColumnInfo(name = "denumire")
    private String denumire;

    @ColumnInfo(name = "dataInterventie")
    private Date dataInterventie;

    @ColumnInfo(name = "tratament")
    private String tratament;

    @ColumnInfo(name = "observatii")
    private String observatii;

    public Interventie(long idMagar, String denumire, Date dataInterventie, String tratament, String observatii) {
        this.idMagar = idMagar;
        this.denumire = denumire;
        this.dataInterventie = dataInterventie;
        this.tratament = tratament;
        this.observatii = observatii;
    }

    public long getIdInterventie() {
        return idInterventie;
    }

    public void setIdInterventie(long idInterventie) {
        this.idInterventie = idInterventie;
    }

    public long getIdMagar() {
        return idMagar;
    }

    public void setIdMagar(long idMagar) {
        this.idMagar = idMagar;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public Date getDataInterventie() {
        return dataInterventie;
    }

    public void setDataInterventie(Date dataInterventie) {
        this.dataInterventie = dataInterventie;
    }

    public String getTratament() {
        return tratament;
    }

    public void setTratament(String tratament) {
        this.tratament = tratament;
    }

    public String getObservatii() {
        return observatii;
    }

    public void setObservatii(String observatii) {
        this.observatii = observatii;
    }
}
