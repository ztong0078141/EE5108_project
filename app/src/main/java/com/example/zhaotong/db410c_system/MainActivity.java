package com.example.zhaotong.db410c_system;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;



public class MainActivity extends FragmentActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            FragmentTransaction transaction = getSupportFragmentManager()
                    .beginTransaction();


            /********************************************************************************
             * Make sure you comment out one of the two following fragments
             * depending on what kind of device you are deploying to
             */
            //BluetoothReceiverFragment fragment = BluetoothReceiverFragment.newInstance();
            BluetoothRemoteFragment fragment = BluetoothRemoteFragment.newInstance();
            /********************************************************************************/
            transaction.replace(R.id.content_fragment, fragment);
            transaction.commit();
        }
    }

}