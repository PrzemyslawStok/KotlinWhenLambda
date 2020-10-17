fun main() {
    val x = 100

    when(x){
        0->println("x wynosi zero")
        0,1,2,3,4,5,6->("x należy do zbioru {0,1,2,3,4,5,6} ")
    }
}
