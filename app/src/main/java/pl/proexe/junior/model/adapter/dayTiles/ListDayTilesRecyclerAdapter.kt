package pl.proexe.junior.model.adapter.dayTiles

import android.view.View
import com.example.proyectofinal.adapter.base.BaseRecyclerAdapter
import pl.proexe.junior.model.data.DayTile

class ListDayTilesRecyclerAdapter(
    private val itemList: List<DayTile>
): BaseRecyclerAdapter<DayTile, ListDayTilesViewHolder>(itemList) {
    override fun createViewHolder(view: View, viewType: Int): ListDayTilesViewHolder {
        TODO("Not yet implemented")
    }

    override fun getViewHolderLayoutId(viewType: Int): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ListDayTilesViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}