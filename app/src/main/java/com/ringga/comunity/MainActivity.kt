package com.ringga.comunity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.blogspot.atifsoftwares.animatoolib.Animatoo
import com.ringga.comunity.antarMuka.auth.AuthActivity
import com.ringga.comunity.databinding.ActivityProfileBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        Handler().postDelayed({
            // This method will be executed once the timer is over
            // Start your app main activity

            startActivity(Intent(this, AuthActivity::class.java))
            Animatoo.animateShrink(this);//animasi onclik
            Animatoo.animateFade(this);//animasi onclik
            // close this activity
            finish()
        }, 1500)
    }




    override fun onBackPressed() {
        super.onBackPressed()
        Animatoo.animateShrink(this) //fire the slide left animation
    }
}