package com.wodster.metcon;

import android.app.Application;
import android.content.Context;

/**
 * Created by Karesz on 2017.03.13..
 */
public class MetconApp extends Application {

    private static Context mContext;

    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }

    public static Context getAppContext() {
        return mContext;
    }



}
