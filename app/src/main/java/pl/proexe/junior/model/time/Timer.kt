package pl.proexe.junior.model.time

interface Timer {

    fun addObserver(observer: TimerObserver)

    fun removeObserver(observer: TimerObserver)
}