package com.example.lucia.auditoria_red.repositorio.Dao;

import android.app.Application;
import android.content.Context;

/**
 * Created by lucia on 13/03/2018.
 */

public class MyApp extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        mContext = getApplicationContext();
        super.onCreate();
    }

    public static Context getContext(){
        return mContext;
    }

}
