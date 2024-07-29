class Dog(private val ownerName: String) {
    var name: String? = null

    fun sayWoof(){
        println("Hi $ownerName, my name is $name")
    }
}