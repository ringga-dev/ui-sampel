package com.ringga.comunity.antarMuka.profile

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import com.ringga.comunity.R
import com.ringga.comunity.data.util.snackbar
import com.ringga.comunity.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityProfileBinding
    lateinit var headview: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarProfile.toolbar)


        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_profile)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow, R.id.nav_popular
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        headview = navView.getHeaderView(0)

        updateUI()
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_profile)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    private fun updateUI() {
        //mengambil data dari database atau api
        val profile = headview.findViewById<ImageView>(R.id.profilUser)
        val name = headview.findViewById<TextView>(R.id.name)
        val email = headview.findViewById<TextView>(R.id.email)
        val bg_pro = headview.findViewById<LinearLayout>(R.id.bg_profile)
        val logout = headview.findViewById<ImageView>(R.id.logout)
        profile?.setImageResource(R.drawable.foto_myprofile)

        logout.setOnClickListener { view ->
            snackbar("anda telah logout", view)
        }
    }
}