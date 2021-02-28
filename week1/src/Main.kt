import Class.Human
import Class.Mage

fun main() {
    val human = Human("Tina")
    human.attack()

    val mage = Mage("Zoey")
    mage.attack()

    human.check_mana()

    mage.check_mana()

}
