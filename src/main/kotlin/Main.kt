fun main() {
    val name = "Madrigal"
    val healthPoints = 77
    val isBlessed = true
    val isImmortal = false
    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20 ).toInt()
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal

    val aura1 = when (karma) {
        in 0..5 -> "red"
        in 6..10 -> "purple"
        in 11..15 -> "orange"
        else -> "green"

    }





    val auraColor = if(auraVisible)(aura1) else "none"
    println("(Aura: $auraColor  and your karma is : $karma) " +
            "(Blessed: ${if (isBlessed) "YES" else "NO"})")



    val healthStatus = when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }
    println("$name $healthStatus")
}
