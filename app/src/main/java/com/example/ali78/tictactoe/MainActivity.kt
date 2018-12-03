package com.example.ali78.tictactoe

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button2.setOnClickListener {
            createGameDetailsPages()
        }
    }

    private fun createGameDetailsPages() {
            button2.setOnClickListener {
                // Create an explicit intent
                val explicitIntent = Intent(this@MainActivity, Game::class.java)

                // Start the other activity by sending the intent
                startActivity(explicitIntent)
            }
    }

}
