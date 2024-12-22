package com.example.manchin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.manchin.databinding.PlayersItemBinding

class PlayersAdapter: RecyclerView.Adapter<PlayersAdapter.PlayersHolder>() {

    val playersList = ArrayList<Players>()

    class PlayersHolder(item:View): RecyclerView.ViewHolder(item) {
        val binding = PlayersItemBinding.bind(item)
        fun bind(players: Players) {
            binding.tvName.text = players.name
            binding.tvGender.text = players.gender
            binding.tvLvl.text = players.lvl.toString()
            binding.tvAttack.text = players.attack.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayersHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.players_item, parent, false)
        return PlayersHolder(view)
    }

    override fun getItemCount(): Int {
        return playersList.size
    }

    override fun onBindViewHolder(holder: PlayersHolder, position: Int) {
        holder.bind(playersList[position])
    }

    fun addPlayers(players: Players) {
        playersList.add(players)
        //Функция которая говорит перерисовать список, после изменения элементов
        notifyDataSetChanged()
    }

}