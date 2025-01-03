package com.example.manchin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.manchin.databinding.ActivityMainBinding
import com.example.manchin.databinding.FragmentAddPlayersBinding

class fragmentAddPlayers : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Toast.makeText(this@fragmentAddPlayers.context, "123", Toast.LENGTH_SHORT).show()


        val binding = FragmentAddPlayersBinding.inflate(inflater)

        binding.buttonAddNewPlayer.setOnClickListener {
            val name = binding.editTextNamePlayer.text
            val gender = "if (binding.cbGenderWomen.) {"


        }

        // Inflate the layout for this fragment
        return binding.root
    }



    companion object {
         @JvmStatic
        fun newInstance() = fragmentAddPlayers()
    }
}