import java.lang.Math.abs
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
    val equation: (Double)->Double = {x:Double-> x - exp(-x)}

    var step = 0
    val maxStep = 100000

    var x = -1.0
    val dx = 0.0001

    while(x<2 || step>100000){
        val result = equation(x)

        if(abs(result)<0.001) {
            println("$x-e^(-$x)=${result}")
            break
        }

        x += dx
        step++
    }

    var lambda1: (Int,String)->Double = {a:Int,b:String->10.0}
    val result = lambda1(5,"asdfasdf")
}


