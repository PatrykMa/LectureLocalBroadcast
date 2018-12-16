package com.example.patryk.lecturelocalbroadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class LocalbBoadcast:BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context,"Lokalne",Toast.LENGTH_SHORT).show()
        var x=0
    }
}