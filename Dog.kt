class Dog{

    var owner: Human? = null
    var name: String? = null

    fun sayWoof(){
        println("Hi my name is $name and my owner is ${owner?.name}")
    }
}