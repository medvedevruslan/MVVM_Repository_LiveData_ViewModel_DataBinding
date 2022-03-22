package com.example.mvvm_repository_livedata_viewmodel_databinding.data

import com.example.mvvm_repository_livedata_viewmodel_databinding.R
import com.example.mvvm_repository_livedata_viewmodel_databinding.presentation.dto.FoodItemsDTO

class DataRepository {

    fun populateItems(): MutableList<FoodItemsDTO> {
        val foodItemsDTO: MutableList<FoodItemsDTO> = ArrayList()
        foodItemsDTO.add(FoodItemsDTO(R.drawable.sandwich, "Sandwich"))
        foodItemsDTO.add(FoodItemsDTO(R.drawable.burger, "Burger"))
        foodItemsDTO.add(FoodItemsDTO(R.drawable.pizza, "Pizza"))
        return foodItemsDTO
    }
}