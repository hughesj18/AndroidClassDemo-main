package com.kroger.classdemoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.kroger.classdemoapp.ui.SurvivorListFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add(R.id.fragment_container_view, SurvivorListFragment())
        }
    }
}

//
//        val recyclerView = findViewById<RecyclerView>(R.id.character_recycler_view)
//
//        recyclerView.layoutManager = LinearLayoutManager(this)
//
//        val survivors = mutableListOf<Survivor>()
//
//        survivors.add(createSurvivor("Acrid", 160, 15, 7))
//        survivors.add(createSurvivor("Artificer", 110, 12, 7))
//        survivors.add(createSurvivor("Bandit", 110, 12, 7))
//        survivors.add(createSurvivor("Captain", 110, 12, 7))
//        survivors.add(createSurvivor("Commando", 110, 12, 7))
//        survivors.add(createSurvivor("Engineer", 130, 14, 7 ))
//        survivors.add(createSurvivor("Heretic", 440, 18, 8))
//        survivors.add(createSurvivor("Huntress", 90, 18, 7))
//        survivors.add(createSurvivor("Loader", 160, 12, 7))
//        survivors.add(createSurvivor("MUL-T", 200, 11, 7))
//        survivors.add(createSurvivor("Mercenary", 110, 12, 7))
//        survivors.add(createSurvivor("REX", 130, 12, 7))
//        survivors.add(createSurvivor("Railgunner", 110, 12, 7))
//        survivors.add(createSurvivor("Void Fiend", 110, 12, 7))
//
//
//        val adapter = SurvivorAdapter(survivors)
//        recyclerView.adapter = adapter
//    }
//
//    private fun createSurvivor() = Survivor(
//        name = "Commando",
//        health = Random.nextInt(10, 99),
//        image = R.drawable.baseline_10k_24,
//        damage = Random.nextInt(10, 99),
//        speed = Random.nextInt(10, 99)
//    )
//
//    private fun createSurvivor(sName: String, sHealth: Int, sDamage: Int, sSpeed: Int) = Survivor(
//        name = sName,
//        health = sHealth,
//        image = R.drawable.baseline_10k_24,
//        damage = sDamage,
//        speed = sSpeed
//    )


