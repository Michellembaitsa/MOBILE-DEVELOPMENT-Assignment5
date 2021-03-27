fun main() {
    var human=Human("Dona",25,77)
    human.eat(2)
    human.speak("I am full now")
    human.birthday()
    println(human)
    var data=User("Michelle","Mbaitsa","michellembaitsaa@gmail.com","0700061374",2345)
    println(data)
    println(data.email)
    println(data.password)

}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
        println("I am eating $foodWeight Kgs of food")
        println(foodWeight+weight)
    }
    fun speak(speech:String){
        println("$speech")
    }
    fun birthday(){
        var bday=(age+1)
        println(bday)
    }

}data class User(var firstName:String,var lastName:String,val email:String,var phoneNumber:String,var password:Int)
