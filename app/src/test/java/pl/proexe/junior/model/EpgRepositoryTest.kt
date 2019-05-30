package pl.proexe.junior.model

import io.mockk.mockk
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import pl.proexe.junior.model.repository.epg.EpgRepository
import pl.proexe.junior.model.repository.epg.LocalEpgRepository
import java.util.*

class EpgRepositoryTest {

    lateinit var repository: EpgRepository

    @BeforeEach
    fun setup() {
        repository = LocalEpgRepository()
    }

    @Test
    fun `repository should exist`() {
        Assertions.assertTrue(::repository.isInitialized)
    }

    @Test
    fun `getProgrammeForDay should return list of programmes`() {
        val dateTime = mockk<Date>()
        assertTrue(repository.getProgrammeForDateTime(dateTime).isNotEmpty())
    }
}