package com.ringga.comunity.antarMuka.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ringga.comunity.R
import com.ringga.comunity.antarMuka.auth.fragment.LoginFragment

class AuthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.auth_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, LoginFragment.newInstance())
                .commitNow()
        }
    }
}