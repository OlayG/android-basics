package com.example.user.deviceadminexample;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by user on 8/4/17.
 */

public class DeviceRecieverSample extends DeviceAdminReceiver {


    @Override
    public void onEnabled(Context context, Intent intent) {
        super.onEnabled(context, intent);
        Toast.makeText(context, "Enabled", Toast.LENGTH_SHORT).show();

    }


    @Override
    public void onDisabled(Context context, Intent intent) {
        super.onDisabled(context, intent);

        Toast.makeText(context, "Disabled", Toast.LENGTH_SHORT).show();
    }
}




