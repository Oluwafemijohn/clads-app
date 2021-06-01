package com.decagonhq.clads

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // Handler and Runnable execute in UIThread (don`t block main thread)
        Handler().postDelayed(
            {
                val i = Intent(this@SplashScreenActivity, CladsActivity::class.java)
                startActivity(i)
                finish()
            },
            2000
        )
    }
}
