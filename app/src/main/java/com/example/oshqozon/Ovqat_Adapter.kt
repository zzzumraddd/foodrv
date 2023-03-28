package com.example.oshqozon

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.example.oshqozon.databinding.OvqatItemBinding

class Ovqat_Adapter(val context: Context, var list: MutableList<Ovqat_data>): RecyclerView.Adapter<Ovqat_Adapter.Ovqat_Holder>() {

    class Ovqat_Holder(binding: OvqatItemBinding): RecyclerView.ViewHolder(binding.root){
        var title = binding.title
        var reipe = binding.recipe
        var image = binding.imageView
        var main = binding.cookMain
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Ovqat_Holder {
        return Ovqat_Holder(OvqatItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
       return list.size
    }

    override fun onBindViewHolder(holder: Ovqat_Holder, position: Int) {
        holder.image.setImageResource(list.get(position).image)
        holder.title.text = list.get(position).title
        holder.reipe.text = list.get(position).recipe
        var anim = AnimationUtils.loadAnimation(context, R.anim.animation)
        holder.main.startAnimation(anim)
    }
}