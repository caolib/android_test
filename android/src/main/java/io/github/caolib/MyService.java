package io.github.caolib;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

public class MyService extends Service {

    public MyService() {
    }
    @SuppressLint("ForegroundServiceType")
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        String temp = intent.getStringExtra("key");
        Log.i("MyStartService", "onStartCommand: ");
        Notification notification = cteateNotification();
        startForeground(10086, notification);

        return START_NOT_STICKY;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    private Notification cteateNotification() {
        String channelid = "aasss";
        NotificationChannel nc = new NotificationChannel(channelid, "service", NotificationManager.IMPORTANCE_DEFAULT);
        ((NotificationManager) getSystemService(NOTIFICATION_SERVICE)).createNotificationChannel(nc);

        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);

        return new NotificationCompat.Builder(this, channelid).setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("music")
                .setContentText("qwwweer")
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher_round))
                .setContentIntent(pendingIntent).build();

    }


}