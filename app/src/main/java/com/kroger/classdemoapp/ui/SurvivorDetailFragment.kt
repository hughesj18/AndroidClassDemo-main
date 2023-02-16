package com.kroger.classdemoapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.kroger.classdemoapp.R

class SurvivorDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_survivor_detail, container, false)



        if (arguments != null) {
            val name = requireArguments().getString("name")
            val health = requireArguments().getInt("health")
            val image = requireArguments().getString("image")
            val damage = requireArguments().getInt("damage")
            val speed = requireArguments().getInt("speed")      //TODO
            val desc = requireArguments().getString("desc")    //TODO
            val holderImage : ImageView = view.findViewById(R.id.survivor_image)
            Glide
                .with(view.context)
                .load(image)
                .override(600,600)
                .into(holderImage)
            view.findViewById<TextView>(R.id.survivor_name).text = name
            view.findViewById<TextView>(R.id.survivor_health).text = "Health: " + health.toString()
            view.findViewById<TextView>(R.id.survivor_damage).text = "Damage: " + damage.toString()
            view.findViewById<TextView>(R.id.survivor_speed).text = "Speed: " + speed.toString()
            view.findViewById<TextView>(R.id.survivor_desc).text = desc
        }


        return view
    }
}
