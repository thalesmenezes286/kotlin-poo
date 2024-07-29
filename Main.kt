
fun main(){

    val human = Human()
    human.name = "Thales"

    val dog = Dog()
    dog.name = "Bidú"
    dog.owner = human
    dog.sayWoof()
}