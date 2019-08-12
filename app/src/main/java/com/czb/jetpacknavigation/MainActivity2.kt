package com.czb.jetpacknavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity2 : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val num = intent.extras?.get("bundle")
        Toast.makeText(this,""+num,Toast.LENGTH_LONG).show()


        navController = findNavController(R.id.main2_fragment4)
//        navController.naviga
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController,appBarConfiguration)
//        AppBarConfiguration
//        appBarConfiguration = AppBarConfiguration(navController.graph, drawerLayout)


    }


    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp()
    }
}
