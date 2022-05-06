package com.example.lesson83

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.lesson83.databinding.ItemBinding

class CharactersAdapter(private val data: ArrayList<Characters>, private val onClick: ((pos: Int) -> Unit)? = null): RecyclerView.Adapter<CharactersAdapter.CharactersHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharactersHolder {
        return CharactersHolder(
            ItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CharactersHolder, position: Int) {
        holder.bind(data.get(position))
        holder.itemView.setOnClickListener {
            onClick?.let { it1 -> it1(position) }
        }
    }

    override fun getItemCount(): Int = data.size


    class CharactersHolder(private val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(characters : Characters) {
            binding.name.text = characters.name
            binding.age.text = characters.age
            Glide.with(binding.image).load(characters.photo).into(binding.image)
        }

    }
}
