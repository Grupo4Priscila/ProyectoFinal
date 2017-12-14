package cl.ucn.disc.dam.autolog.task;

import android.app.Application;

import com.raizlabs.android.dbflow.config.FlowConfig;
import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by RaosF on 07-12-2017.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // DBFLow
        FlowManager.init(new FlowConfig.Builder(this).build());
    }

}