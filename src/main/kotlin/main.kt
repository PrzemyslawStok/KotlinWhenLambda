fun main() {
    val x = 17

    when(x){
        0->{println("x wynosi zero")}
        1,2,3,4,5,6->println("x należy do zbioru {1,2,3,4,5,6} ")
        in 8..20->println("x zawiera się w przedziale 8..20")
        else->println("kolejna funkcja")
    }

    val y = 21

    var z = when(y){
        0->2
        in 20..40->2
        2,3,4,5,6->5
        else->1
    }

    println("z wynosi ${z}")

    z = if(x>y) 5 else 10

    val a = 20
    val b = 5

    if(a>b)
        println("$a>$b")
    else
        println("$a<=$b")


}
