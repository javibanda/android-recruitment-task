package pl.proexe.junior.model.repository

import pl.proexe.junior.model.data.TvProgramme
import pl.proexe.junior.model.data.TvProgrammeCategory
import java.util.*

class LocalEpgRepository {

    companion object {
        private const val PROGRAMMES_LIST_SIZE = 10

        private val IMAGE_URLS = listOf(
            "https://www.dropbox.com/s/9u7kw2knftcur8v/channel_logo_09.png?dl=1",
            "https://www.dropbox.com/s/3lzgp0nmmku61d6/channel_logo_06.png?dl=1",
            "https://www.dropbox.com/s/mkqh6xp1i6a93vb/channel_logo_08.png?dl=1",
            "https://www.dropbox.com/s/jxyd3rjbph6w1uq/channel_logo_07.png?dl=1",
            "https://www.dropbox.com/s/4i03hp3jidbfsiu/channel_logo_05.png?dl=1",
            "https://www.dropbox.com/s/mfbmcgvi14v37df/channel_logo_04.png?dl=1",
            "https://www.dropbox.com/s/glmjpxc3u2not12/channel_logo_03.png?dl=1",
            "https://www.dropbox.com/s/4vellphu7o8gyob/channel_logo_02.png?dl=1",
            "https://www.dropbox.com/s/zfjplpzz9k1udlv/channel_logo_01.png?dl=1"
        )

        private val TITLES = listOf(
            "Ukryta prawda",
            "Pojedynek",
            "Wikingowie, odc. 5, sezon 8",
            "Harry Potter i insygnia śmierci",
            "Zabójcza broń 3",
            "Skazani na Shawshank",
            "Ojciec chrzestny",
            "Mroczny rycerz",
            "Hobbit"
        )

        private val TYPES = listOf(
            "Serial paradokumentalny",
            "Kryminał",
            "Historyczny",
            "Fantasy",
            "Akcja",
            "Dramat",
            "Dokumentalny",
            "Fabularny",
            "Przygodowy"
        )
    }

    fun getProgrammesForDateTime(dateTime: Date) =
        generateProgrammes(dateTime)

    private fun generateProgrammes(dateTime: Date) =
        (1..PROGRAMMES_LIST_SIZE)
            .map { index ->
                index to getStartEndTimes(dateTime, index)
            }
            .map { (index, startEndTimePair) ->
                TvProgramme(
                    title = TITLES[index % TITLES.size],
                    imageUrl = IMAGE_URLS[index % IMAGE_URLS.size],
                    type = TYPES[index % TYPES.size],
                    category = TvProgrammeCategory.values()[index % TvProgrammeCategory.values().size],
                    isFavourite = index % 2 == 0,
                    startTime = startEndTimePair.first,
                    endTime = startEndTimePair.second,
                    progressPercent = computeProgress(startEndTimePair, dateTime)
                )
            }

    private fun computeProgress(startEndTimePair: Pair<Date, Date>, dateTime: Date) =
        dateTime.time
            .minus(startEndTimePair.first.time)
            .div(
                startEndTimePair.second.time
                    .minus(startEndTimePair.first.time)
            )
            .times(100)
            .toInt()

    private fun getStartEndTimes(dateTime: Date, index: Int) =
        createStartTime(dateTime, index) to createEndTime(dateTime, index)

    private fun createStartTime(dateTime: Date, index: Int) =
        createCalendar(dateTime)
            .apply {
                add(Calendar.HOUR, -(index % 2))
                add(Calendar.MINUTE, (index * 2))
            }
            .time

    private fun createEndTime(dateTime: Date, index: Int) =
        createCalendar(dateTime)
            .apply {
                add(Calendar.HOUR, index % 2)
                add(Calendar.MINUTE, (index * 2))
            }
            .time

    private fun createCalendar(dateTime: Date): Calendar =
        Calendar.getInstance()
            .apply {
                time = dateTime
            }
}