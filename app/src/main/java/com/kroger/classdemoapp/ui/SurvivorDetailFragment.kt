package com.kroger.classdemoapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
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
            val damage = requireArguments().getString("damage")
        }

        return view
    }
}
