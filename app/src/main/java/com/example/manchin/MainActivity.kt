package com.example.manchin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.view.isInvisible
import androidx.lifecycle.viewmodel.viewModelFactory
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.manchin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val adapter = PlayersAdapter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btAddPlayers.setOnClickListener {

            binding.rvSpisokPlayers.visibility = View.GONE

            Toast.makeText(this@MainActivity, "РАБОТАЕТ", Toast.LENGTH_SHORT).show()
                val players = Players("Nikita","mail",123,123)
                adapter.addPlayers(players)
                Log.d("razmer", adapter.playersList.size.toString())


            supportFragmentManager
                .beginTransaction()
                .replace(R.id.place_holder, fragmentAddPlayers())
                .commit()
        }
        init()
    }


    private fun init() {
        binding.apply {
            rvSpisokPlayers.layoutManager = LinearLayoutManager(this@MainActivity)
            rvSpisokPlayers.adapter = adapter
//            btAddPlayers.setOnClickListener {
//
//                Toast.makeText(this@MainActivity, "РАБОТАЕТ", Toast.LENGTH_SHORT).show()
//                val players = Players("Nikita","mail",123,123)
//                adapter.addPlayers(players)
//                Log.d("razmer", adapter.playersList.size.toString())
//            }
        }
    }

}