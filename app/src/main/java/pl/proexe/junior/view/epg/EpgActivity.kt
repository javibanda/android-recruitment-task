package pl.proexe.junior.view.epg

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import pl.proexe.junior.R
import pl.proexe.junior.model.adapter.dayTiles.ListDayTilesRecyclerAdapter
import pl.proexe.junior.model.adapter.tvProgram.ListTvProgramRecyclerAdapter
import pl.proexe.junior.model.data.DayTile
import pl.proexe.junior.model.data.NavigationDrawerModel
import pl.proexe.junior.model.data.TvProgramme
import pl.proexe.junior.model.data.TvProgrammeCategory
import pl.proexe.junior.presenter.epg.EpgPresenter
import pl.proexe.junior.presenter.epg.LocalEpgPresenter

class EpgActivity : AppCompatActivity(), EpgView {

    private val presenter: EpgPresenter = LocalEpgPresenter()

    private lateinit var recView: RecyclerView
    private lateinit var navView: NavigationView
    private lateinit var recView2: RecyclerView


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.navigation_drawer, menu)
        return true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recView = findViewById(R.id.myRecycler)
        navView = findViewById(R.id.navView)
        recView2 = findViewById(R.id.recyclerView)

        navView.visibility = View.INVISIBLE


        presenter.onViewCreated(this)

    }


    override fun showEpgList(programmes: List<TvProgramme>) {
        val programmesAdapter = ListTvProgramRecyclerAdapter(programmes)
        recView.apply {
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = programmesAdapter

        }
    }

    override fun showDaysList(days: List<DayTile>) {
        for (i in days) {
            Log.d(":::days", i.toString())
        }
    }

    override fun showCategories(categories: List<TvProgrammeCategory>) {

    }

    override fun showNavigationDrawer(drawerModel: NavigationDrawerModel) {

        Log.d(":::drawerModel", drawerModel.toString())
    }

    override fun selectDayTile(dayTile: DayTile) {


    }
}
