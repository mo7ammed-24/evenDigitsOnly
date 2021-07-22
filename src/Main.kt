fun main() {
    print(evenDigitsOnly(248622))
}

fun evenDigitsOnly(n: Int): Boolean {
    var count=0
    var n1=n
    while(n1!=0){
        var mod=n1%10
        if(mod%2==0)
            count++
        n1=n1/10
    }
    if(count==n.toString().length)
        return true

    else
        return false
}
