package pl.proexe.junior.model.adapter.tvProgram

import android.view.View
import com.example.proyectofinal.adapter.base.BaseRecyclerAdapter
import pl.proexe.junior.R
import pl.proexe.junior.model.data.TvProgramme

class ListTvProgramRecyclerAdapter(
    private val itemsList: List<TvProgramme>
) : BaseRecyclerAdapter<TvProgramme, ListTvProgramViewHolder>(itemsList) {

    override fun createViewHolder(view: View, viewType: Int) = ListTvProgramViewHolder(view)

    override fun getViewHolderLayoutId(viewType: Int) = R.layout.item_tv_program

    override fun onBindViewHolder(holder: ListTvProgramViewHolder, position: Int) {
        holder.bindListTvProgram(itemsList[position])
    }
}