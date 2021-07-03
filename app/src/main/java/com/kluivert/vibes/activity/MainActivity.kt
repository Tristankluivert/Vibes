package com.kluivert.vibes.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kluivert.vibes.R
import com.kluivert.vibes.appFragments.PlayScreen

class MainActivity : AppCompatActivity() {


    private var playScreenFragment = PlayScreen.newInstance()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       setupPlayScreenFragment()
    }

    private fun setupPlayScreenFragment() {
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.play_screen_frame_layout, playScreenFragment, PlayScreen.TAG)
                .commitAllowingStateLoss()
    }
}