package com.example.starwarsplanets.viewmodel

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.starwarsplanets.R
import com.example.starwarsplanets.databinding.PlanetListBinding
import com.example.starwarsplanets.model.PlanetData


class PlanetsAdapter (

    var c: Context, var planetList: ArrayList<PlanetData>

            ): RecyclerView.Adapter<PlanetsAdapter.PlanetViewHolder>() {


    inner class PlanetViewHolder(var v: PlanetListBinding) : RecyclerView.ViewHolder(v.root) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val v = DataBindingUtil.inflate<PlanetListBinding>(
            inflater, R.layout.planet_list, parent, false
        )
        return PlanetViewHolder(v)
    }

    override fun getItemCount(): Int {
        return planetList.size
    }

    override fun onBindViewHolder(holder: PlanetViewHolder, position: Int) {
        holder.v.isPlanets = planetList[position]
    }
}
