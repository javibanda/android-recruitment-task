package pl.proexe.junior.view.epg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pl.proexe.junior.R

class EpgActivity : AppCompatActivity(), EpgView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
