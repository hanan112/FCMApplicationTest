package com.example.fcmapplicationtest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessagingService;

public class GettingDeviceTokenService extends FirebaseMessagingService
{
    @Override
    public void onNewToken(@NonNull String DeviceTOken)
    {
         DeviceTOken= FirebaseInstanceId.getInstance().getToken();
        Log.d("TAG","DEVICE TOKEN: "+ DeviceTOken);


    }
}

