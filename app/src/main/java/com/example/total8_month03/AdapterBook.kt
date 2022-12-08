package com.example.total8_month03

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.total8_month03.databinding.ItemBookBinding

class AdapterBook(private val list: ArrayList<ModelBook>, private val clickListener: ClickListener):
    RecyclerView.Adapter<AdapterBook.ViewHolderBook>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderBook {
        //подвязка xml
        val binding=ItemBookBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolderBook(binding)
    }

    override fun onBindViewHolder(holder: ViewHolderBook, position: Int) {
        holder.bind()
        holder.itemView.setOnClickListener(View.OnClickListener {
           clickListener.click(list[position])
        })}

    override fun getItemCount(): Int {
       return list.size
    }

    inner class ViewHolderBook(val binding:ItemBookBinding):RecyclerView.ViewHolder(binding.root){
     fun bind(){
         binding.apply {
             val item=list[adapterPosition]
             binding.tv.text= item.toString()
         }}}}