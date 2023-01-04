package com.survivalcoding.maskinfo.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.survivalcoding.maskinfo.data.model.MaskStock
import com.survivalcoding.maskinfo.R
import com.survivalcoding.maskinfo.databinding.MaskStockItemBinding

class MaskStockAdapter(private val dataset: ArrayList<MaskStock>) :
    RecyclerView.Adapter<MaskStockAdapter.ViewHolder>() {

    class ViewHolder(val binding: MaskStockItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.mask_stock_item, parent, false)
        return ViewHolder(MaskStockItemBinding.bind(view))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.maskStock = dataset[position]
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}