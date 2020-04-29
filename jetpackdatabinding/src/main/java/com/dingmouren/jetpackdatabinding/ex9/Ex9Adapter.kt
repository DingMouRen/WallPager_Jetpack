package com.dingmouren.jetpackdatabinding.ex9

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.dingmouren.jetpackdatabinding.BR
import com.dingmouren.jetpackdatabinding.R
import com.dingmouren.jetpackdatabinding.databinding.ItemEx9Binding

class Ex9Adapter(private var dataList:MutableList<Ex9Model>) : RecyclerView.Adapter<Ex9Adapter.Ex9ViewHolder>(){

    class Ex9ViewHolder(private val binding:ItemEx9Binding):RecyclerView.ViewHolder(binding.root){

        fun bind(data:Ex9Model){
            binding.ex9 = data
            binding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Ex9ViewHolder {
        val binding = DataBindingUtil.inflate<ItemEx9Binding>(
            LayoutInflater.from(parent.context),
            R.layout.item_ex9,
            parent,false
        )
        return Ex9ViewHolder(binding)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: Ex9ViewHolder, position: Int) {
       holder.bind(dataList[position])
    }


}