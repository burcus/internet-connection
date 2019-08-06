package com.stackoverflow.answers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class ConnectionReceiver extends BroadcastReceiver {

    private boolean isConnected;
    @Override
    public void onReceive(Context context, Intent ıntent) {
        ConnectivityManager cm = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        isConnected = activeNetwork != null && activeNetwork.isConnectedOrConnecting();

        if(isConnected){
            Toast.makeText(context, "WIFI CONNECTED", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "NO CONNECTION", Toast.LENGTH_SHORT).show();
        }
    }
}
