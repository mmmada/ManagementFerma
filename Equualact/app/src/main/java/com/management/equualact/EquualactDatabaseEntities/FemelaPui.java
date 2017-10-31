package com.management.equualact.EquualactDatabaseEntities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by User on 10/31/2017.
 */
@Entity(tableName = "femelaPui",
        foreignKeys = {
        @ForeignKey(
                entity = Magar.class,
                parentColumns = "idMamaPui",
                childColumns = "idMama",
                onDelete = ForeignKey.NO_ACTION
        ),
        @ForeignKey(
                entity = InfoFemela.class,
                parentColumns = "idMamaPui",
                childColumns = "idPui",
                onDelete = ForeignKey.NO_ACTION
        )},
        indices = {@Index(value = "idMamaPui")}
)
public class FemelaPui {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "idMamaPui")
    private long idMamaPui;

    @ColumnInfo(name = "idMama")
    private long idMama;

    @ColumnInfo(name = "idPui")
    private long idPui;

    public FemelaPui(long idMama, long idPui) {
        this.idMama = idMama;
        this.idPui = idPui;
    }

    public long getIdMamaPui() {
        return idMamaPui;
    }

    public void setIdMamaPui(long idMamaPui) {
        this.idMamaPui = idMamaPui;
    }

    public long getIdMama() {
        return idMama;
    }

    public void setIdMama(long idMama) {
        this.idMama = idMama;
    }

    public long getIdPui() {
        return idPui;
    }

    public void setIdPui(long idPui) {
        this.idPui = idPui;
    }
}
