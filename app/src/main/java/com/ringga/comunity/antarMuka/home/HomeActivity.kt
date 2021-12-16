package com.ringga.comunity.antarMuka.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.ismaeldivita.chipnavigation.ChipNavigationBar
import com.ringga.comunity.R
import com.ringga.comunity.antarMuka.home.fragment.DashboardFragment
import com.ringga.comunity.antarMuka.home.fragment.NewPostFragment
import com.ringga.comunity.antarMuka.home.fragment.NotificationsFragment
import com.ringga.comunity.databinding.ActivityHomeBinding


class HomeActivity : AppCompatActivity() {
    lateinit var chip: ChipNavigationBar
    private var stts :Boolean = false
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)

        setContentView(binding.root)

        chip = binding.menu
        binding.hide.setOnClickListener {
         if (stts == true){
             binding.menu.visibility = View.GONE
             stts = false
         }else{
             binding.menu.visibility = View.VISIBLE
             stts = true
         }
        }
        chip.setItemSelected(
            R.id.navigation_home,
            true
        )
        supportFragmentManager.beginTransaction()
            .replace(
                R.id.fragment_container,
                NewPostFragment.newInstance()
            ).commit()


        bottomMenu()
    }


    private fun bottomMenu() {
        chip.setOnItemSelectedListener(object : ChipNavigationBar.OnItemSelectedListener {
            override fun onItemSelected(i: Int) {
                when (i) {
                    R.id.navigation_home ->{
                        supportFragmentManager.beginTransaction()
                            .replace(
                                R.id.fragment_container,
                                NewPostFragment.newInstance()
                            ).commit()
                    }
                    R.id.navigation_dashboard ->{
                        supportFragmentManager.beginTransaction()
                            .replace(
                                R.id.fragment_container,
                                DashboardFragment.newInstance()
                            ).commit()
                    }
                    R.id.navigation_notifications -> {
                        supportFragmentManager.beginTransaction()
                            .replace(
                                R.id.fragment_container,
                                NotificationsFragment.newInstance()
                            ).commit()
                    }
                }
            }
        })
    }

}