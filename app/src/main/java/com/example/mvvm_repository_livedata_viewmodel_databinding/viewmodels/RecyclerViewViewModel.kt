package com.example.mvvm_repository_livedata_viewmodel_databinding.viewmodels

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import com.example.mvvm_repository_livedata_viewmodel_databinding.data.DataRepository
import com.example.mvvm_repository_livedata_viewmodel_databinding.presentation.dto.FoodItemsDTO

class RecyclerViewViewModel(application: Application) : AndroidViewModel(application) {

    var foodItemsDTO: MutableList<FoodItemsDTO> = ArrayList<FoodItemsDTO>()
    var repository = DataRepository()

    init {
        populateData()
    }

    private fun populateData() {
        foodItemsDTO = repository.populateItems()
    }

    fun getFoodName(position: Int): String {
        return foodItemsDTO[position].foodName
    }

    fun getFoodImage(position: Int): Int {
        return foodItemsDTO[position].foodImage
    }

    fun showName(position: Int) {
        Log.d("developer", foodItemsDTO[position].foodName)
    }
}