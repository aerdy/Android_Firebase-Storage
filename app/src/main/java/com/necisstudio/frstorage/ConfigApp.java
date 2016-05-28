package com.necisstudio.frstorage;

import android.app.Application;

import com.google.firebase.storage.FirebaseStorage;

/**
 * Created by Jarcode on 2016-05-28.
 */

public class ConfigApp extends Application {
    public static FirebaseStorage storage;
    @Override
    public void onCreate() {
        super.onCreate();
        storage = FirebaseStorage.getInstance();
    }
}
