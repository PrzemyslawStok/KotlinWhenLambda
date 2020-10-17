import java.lang.Math.exp

fun main() {
    val x = 17

    val result = when(x){
        0->{
            println("x wynosi zero")
            2
        }
        1,2,3,4,5,6->{
            println("x należy do zbioru {1,2,3,4,5,6} ")
            5
        }
        in 8..20-> {
            println("x zawiera się w przedziale 8..20")
            15
        }
        else-> {
            println("kolejna funkcja")
            8
        }
    }

    println("result ${result}")

    val y = 21

    var z = when(y){
        0->2
        in 20..40->2
        2,3,4,5,6->5
        else->1
    }

    println("z wynosi ${z}")

    z = if(x>y) 5 else 10

    example1()
}

fun example1(){
    //x-e^(-x) = 0
    var x = 0.0
    var result = x - exp(-x)
    println("$x-e^(-$x)=${result}")
    while(x<100){
        x = x+1
        //println(x)
    }
}


