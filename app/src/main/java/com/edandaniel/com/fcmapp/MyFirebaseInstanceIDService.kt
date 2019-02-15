package com.edandaniel.com.fcmapp

import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService
import com.google.firebase.messaging.FirebaseMessagingService

class MyFirebaseInstanceIDService : FirebaseInstanceIdService(){
    override fun onTokenRefresh() {
        super.onTokenRefresh()
        Log.i("TOKEN", FirebaseInstanceId.getInstance().token)
    }
}