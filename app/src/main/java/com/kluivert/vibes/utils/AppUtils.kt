package com.kluivert.vibes.utils

import android.app.Activity
import android.widget.Toast

object AppUtils {
    fun Activity.toast(msg: String){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}