package edu.itesm.prros.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso

class PerroViewHolder (view : View) : RecyclerView.ViewHolder(view){
    private val binding = edu.itesm.prros.databinding.PerroRenglonBinding.bind(view)
    fun bind(imagenstring: String){
        Glide.with(binding.root)
            .load(imagenstring).centerCrop()
            .into(binding.fotoPerro)
        //Picasso.get().load(imagenstring).into(binding.fotoPerro)
    }
}