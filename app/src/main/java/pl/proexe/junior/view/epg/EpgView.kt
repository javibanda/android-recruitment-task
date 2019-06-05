package pl.proexe.junior.view.epg

import pl.proexe.junior.model.data.DayTile
import pl.proexe.junior.model.data.NavigationDrawerModel
import pl.proexe.junior.model.data.TvProgramme
import pl.proexe.junior.model.data.TvProgrammeCategory

interface EpgView {

    fun showEpgList(programmes: List<TvProgramme>)

    fun showDaysList(days: List<DayTile>)

    fun showCategories(categories: List<TvProgrammeCategory>)

    fun showNavigationDrawer(drawerModel: NavigationDrawerModel)

    fun selectDayTile(dayTile: DayTile)
}