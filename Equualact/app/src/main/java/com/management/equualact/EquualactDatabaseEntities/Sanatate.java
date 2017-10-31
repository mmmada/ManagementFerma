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
                        parentColumns = "idSanatate",
                        childColumns = "idMagar",
                        onDelete = ForeignKey.NO_ACTION
                )},
        indices = { @Index(value = "idSanatate")}
)
public class Sanatate {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "idSanatate")
    private long isSanatate;

    @ColumnInfo(name = "idMagar")
    private long idMagar;

    @ColumnInfo(name = "dataVaccinare")
    private Date dataVaccinare;

    @ColumnInfo(name = "dataDeparazitare")
    private Date dataDeparazitare;

    @ColumnInfo(name = "dataCuratareCopite")
    private Date dataCuratareCopite;

    public Sanatate(long idMagar, Date dataVaccinare, Date dataDeparazitare, Date dataCuratareCopite) {
        this.idMagar = idMagar;
        this.dataVaccinare = dataVaccinare;
        this.dataDeparazitare = dataDeparazitare;
    }

    public long getIsSanatate() {
        return isSanatate;
    }

    public void setIsSanatate(long isSanatate) {
        this.isSanatate = isSanatate;
    }

    public long getIdMagar() {
        return idMagar;
    }

    public void setIdMagar(long idMagar) {
        this.idMagar = idMagar;
    }

    public Date getDataVaccinare() {
        return dataVaccinare;
    }

    public void setDataVaccinare(Date dataVaccinare) {
        this.dataVaccinare = dataVaccinare;
    }

    public Date getDataDeparazitare() {
        return dataDeparazitare;
    }

    public void setDataDeparazitare(Date dataDeparazitare) {
        this.dataDeparazitare = dataDeparazitare;
    }

    public Date getDataCuratareCopite() {
        return dataCuratareCopite;
    }

    public void setDataCuratareCopite(Date dataCuratareCopite) {
        this.dataCuratareCopite = dataCuratareCopite;
    }
}
