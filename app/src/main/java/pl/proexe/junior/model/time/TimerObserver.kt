package pl.proexe.junior.model.time

import java.util.*

interface TimerObserver {

    fun notifyTimeChanged(time: Date)
}