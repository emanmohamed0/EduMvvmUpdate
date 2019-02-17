package al7osam.com.edumvvmupdate.App;

import android.app.Application;
import android.content.Context;

import al7osam.com.edumvvmupdate.network.ApiFactory;
import al7osam.com.edumvvmupdate.network.AppServices;

/**
 * Created by eman.eraqi on 1/23/2019.
 */

public class AppController extends Application {
    AppServices appServices;

    private static AppController get(Context context) {
        return (AppController) context.getApplicationContext();
    }

    public static AppController create(Context context) {
        return AppController.get(context);
    }


    public AppServices getAppServices() {
        if (appServices == null) {
            appServices = ApiFactory.create();
        }
        return appServices;
    }
}
