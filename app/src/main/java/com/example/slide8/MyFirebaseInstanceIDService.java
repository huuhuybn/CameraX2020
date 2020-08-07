package com.example.slide8;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseInstanceIDService extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.e("A",refreshedToken);


        Log.e("message",remoteMessage.getFrom() + " : " +
                remoteMessage.getData().toString());

        if (remoteMessage.getData().size() > 0){
            Log.d("TAG", "Message data payload: " + remoteMessage.getData());
        }
    }



    @Override
    public void onNewToken(@NonNull String s) {
        super.onNewToken(s);
        Log.e("TOKEN", s);
    }
}
