package com.example.manchin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.manchin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val adapter = PlayersAdapter()

    private val NameIdList = listOf<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }


    private fun init() {
        binding.apply {
            rvSpisokPlayers.layoutManager = LinearLayoutManager(this@MainActivity)
            rvSpisokPlayers.adapter = adapter
            btAddPlayers.setOnClickListener {

                Toast.makeText(this@MainActivity, "РАБОТАЕТ", Toast.LENGTH_SHORT).show()
                val players = Players("Nikita","mail",123,123)
                adapter.addPlayers(players)
                Log.d("razmer", adapter.playersList.size.toString())
            }
        }
    }

}