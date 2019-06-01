package pl.proexe.junior.presenter

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import pl.proexe.junior.presenter.epg.LocalEpgPresenter

class EpgPresenterTest {

    lateinit var presenter: LocalEpgPresenter

    @Test
    fun `presenter should exist`() {
        assertTrue(::presenter.isInitialized)
    }

}