package pl.proexe.junior.model.adapter.dayTiles

import android.view.View
import com.example.proyectofinal.adapter.base.BaseRecyclerAdapter
import pl.proexe.junior.R
import pl.proexe.junior.model.data.DayTile

class ListDayTilesRecyclerAdapter(
    private val itemList: List<DayTile>
): BaseRecyclerAdapter<DayTile, ListDayTilesViewHolder>(itemList) {

    override fun createViewHolder(view: View, viewType: Int)= ListDayTilesViewHolder(view)

    override fun getViewHolderLayoutId(viewType: Int) = R.layout.item_day_titles

    override fun onBindViewHolder(holder: ListDayTilesViewHolder, position: Int) {
        holder.itemView.setOnFocusChangeListener { view, hasFocus ->  }
        holder.bindDayTiles(itemList[position])
    }

}