package com.example.lesson83

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson83.databinding.ItemLocationBinding

class LocationAdapter(private val data: ArrayList<Location>,private val onClick: ((pos: Int) -> Unit)? = null): RecyclerView.Adapter<LocationAdapter.LocationHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LocationHolder {
        return LocationHolder(ItemLocationBinding.inflate(LayoutInflater.from(parent.context),
            parent,
            false))
    }

    override fun onBindViewHolder(holder: LocationHolder, position: Int) {
        holder.bind(data.get(position))
        holder.itemView.setOnClickListener {
            onClick?.let { it1 -> it1(position) }
        }
    }

    override fun getItemCount(): Int = data.size


    class LocationHolder(private val binding: ItemLocationBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(location: Location) {
            binding.location.text = location.locationName
            binding.locationType.text = location.locationType
        }
    }
}
