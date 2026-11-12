import java.util.*
import java.io.*
val br: BufferedReader = System.`in`.bufferedReader()
var st: StringTokenizer = StringTokenizer("")
val out: PrintWriter = PrintWriter(System.out)
fun next(): String = if (st.hasMoreTokens()) st.nextToken() else { st = StringTokenizer(br.readLine() ?: ""); st.nextToken() }
fun nextInt(): Int = next().toInt()
fun nextLong(): Long = next().toLong()
fun nextDouble(): Double = next().toDouble()

fun main() {
    n = nextInt()
    if(n%2 == 0 && n!= 2) println("YES")
    else println("NO")
 
 out.flush()
}

