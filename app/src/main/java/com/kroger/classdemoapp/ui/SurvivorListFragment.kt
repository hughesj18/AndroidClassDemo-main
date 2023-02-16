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

        val view = inflater.inflate(R.layout.fragment_survivor_list, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.survivor_recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val survivors = mutableListOf<Survivor>()


        survivors.add(createSurvivor("Acrid", 160, 15, 7, "https://static.wikia.nocookie.net/riskofrain2_gamepedia_en/images/8/8e/Acrid.png/revision/latest?cb=20200129235326"))
        survivors.add(createSurvivor("Artificer", 110, 12, 7,"https://static.wikia.nocookie.net/riskofrain2_gamepedia_en/images/9/98/Artificer.png/revision/latest/scale-to-width-down/128?cb=20200129200643"))
        survivors.add(createSurvivor("Bandit", 110, 12, 7, "https://static.wikia.nocookie.net/riskofrain2_gamepedia_en/images/1/1f/Bandit.png/revision/latest?cb=20210326045945"))
        survivors.add(createSurvivor("Captain", 110, 12, 7, "https://static.wikia.nocookie.net/riskofrain2_gamepedia_en/images/a/a9/Captain.png/revision/latest?cb=20200811155443"))
        survivors.add(createSurvivor("Commando", 110, 12, 7, "https://static.wikia.nocookie.net/riskofrain2_gamepedia_en/images/5/50/Commando.png/revision/latest/scale-to-width-down/128?cb=20200129200647"))
        survivors.add(createSurvivor("Engineer", 130, 14, 7,  "https://static.wikia.nocookie.net/riskofrain2_gamepedia_en/images/d/d8/Engineer.png/revision/latest/scale-to-width-down/128?cb=20200129200649"))
        survivors.add(createSurvivor("Heretic", 440, 18, 8, "https://static.wikia.nocookie.net/riskofrain2_gamepedia_en/images/8/81/Heretic.png/revision/latest?cb=20210326043605"))
        survivors.add(createSurvivor("Huntress", 90, 18, 7, "https://static.wikia.nocookie.net/riskofrain2_gamepedia_en/images/6/6f/Huntress.png/revision/latest/scale-to-width-down/128?cb=20200129200650"))
        survivors.add(createSurvivor("Loader", 160, 12, 7, "https://static.wikia.nocookie.net/riskofrain2_gamepedia_en/images/2/25/Loader.png/revision/latest?cb=20200129235338"))
        survivors.add(createSurvivor("MUL-T", 200, 11, 7, "https://static.wikia.nocookie.net/riskofrain2_gamepedia_en/images/6/6f/MUL-T.png/revision/latest/scale-to-width-down/128?cb=20200129200652"))
        survivors.add(createSurvivor("Mercenary", 110, 12, 7, "https://static.wikia.nocookie.net/riskofrain2_gamepedia_en/images/0/00/Mercenary.png/revision/latest/scale-to-width-down/128?cb=20200129200651"))
        survivors.add(createSurvivor("REX", 130, 12, 7, "https://static.wikia.nocookie.net/riskofrain2_gamepedia_en/images/7/74/REX.png/revision/latest?cb=20200129200652"))
        survivors.add(createSurvivor("Railgunner", 110, 12, 7, "https://static.wikia.nocookie.net/riskofrain2_gamepedia_en/images/f/fe/Railgunner.png/revision/latest?cb=20220302014737"))
        survivors.add(createSurvivor("Void Fiend", 110, 12, 7, "https://static.wikia.nocookie.net/riskofrain2_gamepedia_en/images/5/5b/Void_Fiend.png/revision/latest?cb=20220302014710"))

        val adapter = SurvivorAdapter(survivors)
        recyclerView.adapter = adapter

        return view
    }

    private fun createSurvivor(
        name: String,
        health: Int,
        damage: Int,
        speed: Int,
        image: String,
    ) = Survivor(
        name = name,
        health = health,
        image = image,
        damage = damage,
        speed = speed,
        desc = "WIP description"
    )
}
