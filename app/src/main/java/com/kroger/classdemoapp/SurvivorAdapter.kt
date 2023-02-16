package com.kroger.classdemoapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.commit
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kroger.classdemoapp.ui.SurvivorDetailFragment

class SurvivorAdapter(private val survivors: List<Survivor>) : RecyclerView.Adapter<SurvivorAdapter.SurvivorViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SurvivorViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.survivor_card_view, parent, false)
        return SurvivorViewHolder(view) { position ->
            val survivor = survivors[position]

            val bundle = bundleOf(
                "name" to survivor.name,
                "health" to survivor.health,
                "image" to survivor.image,
                "damage" to survivor.damage,
                "speed" to survivor.speed,
                "desc" to survivor.desc
            )

            val detailFragment = SurvivorDetailFragment()
            detailFragment.arguments = bundle

            val activity = view.context as AppCompatActivity

            activity.supportFragmentManager.commit {
                setReorderingAllowed(true)
                replace(R.id.fragment_container_view, detailFragment)
                addToBackStack(null)
            }
        }
    }


    override fun getItemCount() = survivors.size

    override fun onBindViewHolder(holder: SurvivorViewHolder, position: Int) {
        val survivor = survivors[position]
        Glide
            .with(holder.itemView.context)
            .load(survivor.image)
            .override(400,300)
            .into(holder.survivorImage)
        holder.survivorName.text = survivor.name
        holder.survivorAge.text = "Health: " + survivor.health.toString()
        holder.survivorRegen.text = "Damage: " + survivor.damage.toString()
    }

    inner class SurvivorViewHolder(
        itemView: View,
        private val onItemClick: (adapterPosition: Int) -> Unit
    ) : RecyclerView.ViewHolder(itemView) {
        val survivorImage: ImageView = itemView.findViewById(R.id.survivor_image)
        val survivorName: TextView = itemView.findViewById(R.id.survivor_name)
        val survivorAge: TextView = itemView.findViewById(R.id.survivor_health)
        val survivorRegen: TextView = itemView.findViewById(R.id.survivor_damage)
        init {
            itemView.setOnClickListener {
                onItemClick(adapterPosition)
            }
        }
    }
}
