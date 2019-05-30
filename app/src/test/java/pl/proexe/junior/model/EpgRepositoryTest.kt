package pl.proexe.junior.model

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import pl.proexe.junior.model.repository.epg.EpgRepository

class EpgRepositoryTest {

    lateinit var repository: EpgRepository

    @Test
    fun `repository should exist`() {
        Assertions.assertTrue(::repository.isInitialized)
    }
}