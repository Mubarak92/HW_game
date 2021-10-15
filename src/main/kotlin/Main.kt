fun main() {
    val name = "Madrigal"
    var healthPoints = 55
    val isBlessed = true
    val isImmortal = false
    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20 ).toInt()

    val Auracolor = when (karma){
        in 0..5 -> "Red"
        in 6..10 -> "Orange"
        in 11..15 -> "Purple"
        in 16..20 -> "Green"
        else -> "NONE"
    }
    println("Your karma: $karma")
    val auraVisible = isBlessed && healthPoints >50 || isImmortal


    val auraColor = if (auraVisible)(Auracolor) else "None"
    //println(auraColor)

    val healthStatus = when (healthPoints) {
        100 -> "in in excelent condtion!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        }
        else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else ->"is in awful condition!"
    }

    val statusFormatString = "(HP: $healthPoints)(Aura: $auraColor) -> $healthStatus"

    println(statusFormatString)
    println("$name $healthStatus")
}
