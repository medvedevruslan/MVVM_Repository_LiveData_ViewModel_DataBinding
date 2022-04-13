package com.example.mvvm_repository_livedata_viewmodel_databinding.presentation

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import coil.load

@BindingAdapter(value = ["setAdapter", "gridLayoutManagerValue", "vertical"], requireAll = false)
fun bindRecyclerViewAdapter(
    recyclerView: RecyclerView,
    adapter: RecyclerView.Adapter<*>?,
    gridLayoutManagerValue: Int?,
    isVertical: Boolean?
) {

    if (isVertical != null && !isVertical) {
        recyclerView.layoutManager =
            LinearLayoutManager(recyclerView.context, LinearLayoutManager.HORIZONTAL, false)
    } else if (gridLayoutManagerValue != null && gridLayoutManagerValue > 0) {
        recyclerView.layoutManager = GridLayoutManager(recyclerView.context, gridLayoutManagerValue)
    } else {
        recyclerView.layoutManager = LinearLayoutManager(recyclerView.context)
    }
    recyclerView.adapter = adapter
}

@BindingAdapter(value = ["setImageResourceWithCoil"])
fun bindImageResource(view: ImageView, image: Int) {
    if (view != null && image != null) {
        view.load(image)
    }
}