package pl.proexe.junior.view.epg

import pl.proexe.junior.model.data.*
import java.util.*

interface EpgView {

    fun showEpgList(programmes: List<TvProgramme>)

    fun showDaysList(days: List<DayTile>)

    fun showCategories(categories: List<TvProgrammeCategory>)

    fun showNavigationDrawer(drawerModel: NavigationDrawerModel)

    fun selectDayTile(dayTile: DayTile)

    fun getCurrentlySelectedDateTime(): Date
}