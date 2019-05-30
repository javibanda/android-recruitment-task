package pl.proexe.junior.model.repository.epg

import pl.proexe.junior.model.data.TvProgramme
import java.util.*

interface EpgRepository {

    fun getProgrammeForDateTime(dateTime: Date): List<TvProgramme>
}