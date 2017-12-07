package cl.ucn.disc.dam.autolog.dao;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by RaosF on 07-12-2017.
 */

@Database(name = MyDatabase.NAME, version = MyDatabase.VERSION)
public class MyDatabase {
    public static final String NAME = "MyDatabaseDB";
    public static final int VERSION = 1;
}
