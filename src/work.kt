fun main ()   {
    school()
    statement("Ayugi Sophia",23)
    game()

    student("Ayugi")
    student("Mercy")

}


fun school () {
    var school = "Akirachikx"
    println(school[0])
    println(school[3])
    println(school[4])
}
fun statement (name:String,age:Int) {
    var name = ("Ayugi Sophia")
    var age = 23
    println("Hi,my name is $name and I am $age years old")
}
fun game ()  {
    var game="Volleyball"
    println(game.length)

}
fun student(name:String)    {
    if (name=="Ayugi"){
        println("that's me!")
    }
    else{
        println("i don't know who that is")
    }

}




