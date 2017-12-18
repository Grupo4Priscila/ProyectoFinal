package cl.ucn.disc.dam.autolog;

import android.app.Application;

import com.raizlabs.android.dbflow.config.DatabaseConfig;
import com.raizlabs.android.dbflow.config.FlowConfig;
import com.raizlabs.android.dbflow.config.FlowManager;

import cl.ucn.disc.dam.autolog.dao.MyDatabase;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by PriscilaGonzalez on 17-12-2017.
 */
@Slf4j
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // DBFLow
        {
            // Initialize DBFLow
            FlowManager.init(FlowConfig.builder(this)
                    .addDatabaseConfig(DatabaseConfig.builder(MyDatabase.class).databaseName("MyDatabaseDB").build())
                    // .openDatabasesOnInit(true)
                    .build()
            );
        }

    }

}
