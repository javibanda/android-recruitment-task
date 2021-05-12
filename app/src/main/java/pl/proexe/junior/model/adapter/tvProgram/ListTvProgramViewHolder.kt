package pl.proexe.junior.model.adapter.tvProgram

import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import com.example.proyectofinal.adapter.base.BaseViewHolder
import pl.proexe.junior.R
import pl.proexe.junior.model.data.TvProgramme
import pl.proexe.junior.model.extensions.loadUrl
import java.text.SimpleDateFormat

class ListTvProgramViewHolder(itemView: View) : BaseViewHolder(itemView) {

    private val image = itemView.findViewById<ImageView>(R.id.image)
    private val txtTittle = itemView.findViewById<TextView>(R.id.txtTittle)
    private val txtTime = itemView.findViewById<TextView>(R.id.txtTime)
    private val txtType = itemView.findViewById<TextView>(R.id.txtType)
    private val progressBar = itemView.findViewById<ProgressBar>(R.id.progressBar)

    fun bindListTvProgram(programmes: TvProgramme) {
        setEditTexts(programmes)
        setProgressBar(programmes)
    }

    private fun setEditTexts(programmes: TvProgramme) {
        txtTittle.text = programmes.title
        txtTime.text = setTime(programmes)
        txtType.text = programmes.type
        image.loadUrl(programmes.imageUrl)
    }


    private fun setTime(programmes: TvProgramme): String {

        val pattern = SimpleDateFormat("HH:mm")
        val starTime = pattern.format(programmes.startTime)
        val endTime = pattern.format(programmes.endTime)
        return "$starTime - $endTime"
    }

    private fun setProgressBar(programmes: TvProgramme) {
        progressBar.progress = programmes.progressPercent
    }
}