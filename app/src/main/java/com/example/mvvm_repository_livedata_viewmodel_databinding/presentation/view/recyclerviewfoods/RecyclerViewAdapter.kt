package com.example.mvvm_repository_livedata_viewmodel_databinding.presentation.view.recyclerviewfoods

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvm_repository_livedata_viewmodel_databinding.BR
import com.example.mvvm_repository_livedata_viewmodel_databinding.R
import com.example.mvvm_repository_livedata_viewmodel_databinding.viewmodels.RecyclerViewViewModel
import com.example.mvvm_repository_livedata_viewmodel_databinding.databinding.ItemRecyclerBinding

class RecyclerViewAdapter(private val viewModel: RecyclerViewViewModel) :
    RecyclerView.Adapter<RecyclerViewAdapter.SampleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val binding: ItemRecyclerBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.item_recycler, parent, false)
        return SampleViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SampleViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        if (viewModel != null &&
            viewModel.foodItemsDTO != null &&
            viewModel.foodItemsDTO.size > 0
        ) {
            return viewModel.foodItemsDTO.size
        }
        return 0
    }

    inner class SampleViewHolder(private val binding: ItemRecyclerBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(position: Int) {
            binding.setVariable(BR.recyclerViewModel, viewModel)
            binding.setVariable(BR.position, position)
        }
    }
}