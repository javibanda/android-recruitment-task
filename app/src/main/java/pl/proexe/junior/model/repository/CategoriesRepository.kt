package pl.proexe.junior.model.repository

import pl.proexe.junior.model.data.TvProgrammeCategory

class CategoriesRepository {

    fun getListCategories(): List<TvProgrammeCategory>{
        val list = ArrayList<TvProgrammeCategory>()
        for (category in TvProgrammeCategory.values()){
            list.add(category)
        }
        return list
    }

}