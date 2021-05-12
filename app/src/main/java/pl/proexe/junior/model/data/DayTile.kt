package pl.proexe.junior.model.data

import androidx.annotation.StringRes

class DayTile(
    val timestamp: Long,
    @StringRes
    val dayLabel: Int


) {
    override fun toString(): String {
        return "DayTile(timestamp=$timestamp, dayLabel=$dayLabel)"
    }
}