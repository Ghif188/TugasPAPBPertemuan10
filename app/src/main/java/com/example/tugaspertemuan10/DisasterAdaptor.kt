package com.example.tugaspertemuan10

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tugaspertemuan10.databinding.ItemDisasterBinding
import com.squareup.picasso.Picasso

typealias onClickDisaster = (Disaster) -> Unit

class DisasterAdaptor (
    private val listDisaster: List<Disaster>,
    private val onClickDisaster: onClickDisaster) : RecyclerView.Adapter<DisasterAdaptor.ItemDisasterViewHolder>() {
    inner class ItemDisasterViewHolder(private val binding : ItemDisasterBinding) :
        RecyclerView.ViewHolder(binding.root){
        fun bind (data: Disaster){
            with(binding){
                Picasso.get().load(data.imgDisaster).into(imgDisaster)
                txtDisasterJudul.text = data.judulDisaster
                txtDisasterKet.text = data.lokasiDisaster
                itemView.setOnClickListener{
                    onClickDisaster(data)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemDisasterViewHolder {
        val binding = ItemDisasterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemDisasterViewHolder(binding)
    }

    override fun getItemCount(): Int = listDisaster.size

    override fun onBindViewHolder(holder: ItemDisasterViewHolder, position: Int) {
        holder.bind(listDisaster[position])
    }
}