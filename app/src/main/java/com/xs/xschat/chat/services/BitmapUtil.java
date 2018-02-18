package com.xs.xschat.chat.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by Who Dat on 8/9/2017.
 */

public class BitmapUtil extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
