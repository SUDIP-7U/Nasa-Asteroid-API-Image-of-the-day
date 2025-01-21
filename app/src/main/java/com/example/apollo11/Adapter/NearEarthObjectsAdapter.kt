package com.example.apollo11.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.apollo11.data.local.Asteroid
import com.example.apollo11.databinding.NeoFeedLayoutBinding

class NearEarthObjectsAdapter(
    private val neoList: List<Asteroid>,
    private val onAsteroidClicked: (Asteroid) -> Unit
) :
    RecyclerView.Adapter<NearEarthObjectsAdapter.NearEarthObjectsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NearEarthObjectsViewHolder {
        return NearEarthObjectsViewHolder(
            NeoFeedLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return neoList.size
    }

    override fun onBindViewHolder(holder: NearEarthObjectsViewHolder, position: Int) {
        neoList[position].let {item->
            holder.binding.apply {
                tvName.text = item.codename
            }

            holder.itemView.setOnClickListener {
                onAsteroidClicked(item)
            }
        }
    }

    inner class NearEarthObjectsViewHolder(val binding: NeoFeedLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)
}