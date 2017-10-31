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
                    parentColumns = "idInfoFemela",
                    childColumns = "idMagar",
                    onDelete = ForeignKey.CASCADE
        )},
        indices = { @Index(value = "idInfoFemela")}
)
public class InfoFemela {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "idInfoFemela")
    private long idInfoFemela;

    @ColumnInfo(name = "idMagar")
    private long idMagar;

    @ColumnInfo(name = "dataUltimaMonta")
    private Date dataUltimaMonta;

    @ColumnInfo(name = "dataUltimaFatare")
    private Date dataUltimaFatare;

    @ColumnInfo(name = "pregnant")
    private boolean pregnant;

    public InfoFemela(long idMagar, Date dataUltimaMonta, Date dataUltimaFatare, boolean pregnant) {
        this.idMagar = idMagar;
        this.dataUltimaMonta = dataUltimaMonta;
        this.dataUltimaFatare = dataUltimaFatare;
        this.pregnant = pregnant;
    }

    public long getIdInfoFemele() {
        return idInfoFemela;
    }

    public void setIdInfoFemele(long idInfoFemela) {
        this.idInfoFemela = idInfoFemela;
    }

    public long getIdMagar() {
        return idMagar;
    }

    public void setIdMagar(long idMagar) {
        this.idMagar = idMagar;
    }

    public Date getDataUltimaMonta() {
        return dataUltimaMonta;
    }

    public void setDataUltimaMonta(Date dataUltimaMonta) {
        this.dataUltimaMonta = dataUltimaMonta;
    }

    public Date getDataUltimaFatare() {
        return dataUltimaFatare;
    }

    public void setDataUltimaFatare(Date dataUltimaFatare) {
        this.dataUltimaFatare = dataUltimaFatare;
    }

    public boolean isPregnant() {
        return pregnant;
    }

    public void setPregnant(boolean pregnant) {
        this.pregnant = pregnant;
    }
}
