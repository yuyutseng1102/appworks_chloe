package Class

open class Human( var name : String = "") {

    open var mana = false

    fun check_mana(){
        if(mana==true){
            println("${name} has mana")
        }else{
            println("${name} has no mana")
        }
    }

    open fun attack(){
        println( " ${name} use First Attack!" )
    }

}

class Mage(name : String):Human(name) {

    override var mana = true

    override fun attack(){
        println("${name} use Fireball!")

    }
}