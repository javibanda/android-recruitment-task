package pl.proexe.junior.model.adapter.dayTiles

import android.view.View
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.core.content.res.ResourcesCompat
import com.example.proyectofinal.adapter.base.BaseViewHolder
import pl.proexe.junior.R
import pl.proexe.junior.model.data.DayTile

class ListDayTilesViewHolder(itemView: View): BaseViewHolder(itemView) {
    private val txtDayTilde = itemView.findViewById<TextView>(R.id.txtDayTilde)

    fun bindDayTiles(dayTiles: DayTile){

        txtDayTilde.text = txtDayTilde.context.resources.getString(dayTiles.dayLabel)



    }
}