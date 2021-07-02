enum class SeatType(val costMultiplier: Double) {
    GOLD(1.25),
    SILVER(1.15),
    NORMAL(1.0);

    companion object{
        fun fromString(value: String) =
            when(value){
                "GOLD" -> GOLD
                "SILVER" -> SILVER
                else -> NORMAL
            }
    }
}
