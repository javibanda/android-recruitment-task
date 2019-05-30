package pl.proexe.junior.model.repository.epg

import pl.proexe.junior.model.data.TvProgramme
import java.util.*

class LocalEpgRepository : EpgRepository {

    companion object {
        private const val MAX_PROGRAMMES_LIST_SIZE = 10
        private const val MIN_PROGRAMMES_LIST_SIZE = 2
    }

    override fun getProgrammeForDateTime(dateTime: Date): List<TvProgramme> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun generateProgramme(dateTime: Date) {

    }

}