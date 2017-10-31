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
                        parentColumns = "idLapte",
                        childColumns = "idMagar",
                        onDelete = ForeignKey.NO_ACTION
                )},
        indices = { @Index(value = "idLapte")}
)
public class Lapte {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "idLapte")
    private long idLapte;

    @ColumnInfo(name = "idMagar")
    private long idMagar;

    @ColumnInfo(name = "dataInregistrare")
    private Date dataInregistrare;

    @ColumnInfo(name = "cantitate")
    private double cantitate;

    public Lapte(long idMagar, Date dataInregistrare, double cantitate) {
        this.idMagar = idMagar;
        this.dataInregistrare = dataInregistrare;
        this.cantitate = cantitate;
    }

    public long getIdLapte() {
        return idLapte;
    }

    public void setIdLapte(long idLapte) {
        this.idLapte = idLapte;
    }

    public long getIdMagar() {
        return idMagar;
    }

    public void setIdMagar(long idMagar) {
        this.idMagar = idMagar;
    }

    public Date getDataInregistrare() {
        return dataInregistrare;
    }

    public void setDataInregistrare(Date dataInregistrare) {
        this.dataInregistrare = dataInregistrare;
    }

    public double getCantitate() {
        return cantitate;
    }

    public void setCantitate(double cantitate) {
        this.cantitate = cantitate;
    }
}
