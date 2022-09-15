package com.example.dpuclassroom;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class messagingservice extends FirebaseMessagingService {
    @Override
    public void onMessageReceived( RemoteMessage message) {
        super.onMessageReceived(message);
        shownot(message.getNotification().getTitle(),message.getNotification().getBody());
    }
    public void shownot(String title,String Message){

        NotificationCompat.Builder builder= new NotificationCompat.Builder(this,"notificate")
                .setContentTitle(title)
                .setSmallIcon(R.drawable.icon)
                .setAutoCancel(true)
                .setContentText(Message);


        NotificationManagerCompat manager=NotificationManagerCompat.from(this);
        manager.notify(999,builder.build());
    }
}
