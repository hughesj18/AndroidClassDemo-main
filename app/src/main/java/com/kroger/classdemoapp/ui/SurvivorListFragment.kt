package com.kroger.classdemoapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kroger.classdemoapp.Survivor
import com.kroger.classdemoapp.SurvivorAdapter
import com.kroger.classdemoapp.R

class SurvivorListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_character_list, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.character_recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val survivors = mutableListOf<Survivor>()


        survivors.add(createSurvivor("Acrid", 160, 15, 7, "https://riskofrain2.fandom.com/wiki/Acrid"))
        survivors.add(createSurvivor("Artificer", 110, 12, 7,""))
        survivors.add(createSurvivor("Bandit", 110, 12, 7, ""))
        survivors.add(createSurvivor("Captain", 110, 12, 7, ""))
        survivors.add(createSurvivor("Commando", 110, 12, 7, ""))
        survivors.add(createSurvivor("Engineer", 130, 14, 7,  ""))
        survivors.add(createSurvivor("Heretic", 440, 18, 8, ""))
        survivors.add(createSurvivor("Huntress", 90, 18, 7, ""))
        survivors.add(createSurvivor("Loader", 160, 12, 7, ""))
        survivors.add(createSurvivor("MUL-T", 200, 11, 7, ""))
        survivors.add(createSurvivor("Mercenary", 110, 12, 7, ""))
        survivors.add(createSurvivor("REX", 130, 12, 7, ""))
        survivors.add(createSurvivor("Railgunner", 110, 12, 7, ""))
        survivors.add(createSurvivor("Void Fiend", 110, 12, 7, ""))

        val adapter = SurvivorAdapter(survivors)
        recyclerView.adapter = adapter

        return view
    }

    private fun createSurvivor(
        name: String,
        health: Int,
        damage: Int,
        speed: Int,
        image: String

    ) = Survivor(
        name = name,
        health = health,
        image = image,
        damage = damage,
        speed = speed
    )
}
