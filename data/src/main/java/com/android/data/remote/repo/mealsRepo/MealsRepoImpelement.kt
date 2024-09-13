package com.android.data.remote.repo.mealsRepo

import com.android.data.remote.repo.meals.MealsAPI
import com.android.domain.entity.meals.Category
import com.android.domain.entity.meals.repo.meals.MainRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MealsRepoImpelement (private val mealsApi: MealsAPI) : MainRepo {
    override suspend fun getMeals(): Category =
        withContext(Dispatchers.IO){
            return@withContext mealsApi.getMealsResponse()
        }

}