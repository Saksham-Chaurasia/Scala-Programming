import scala.io.StdIn.{readLine,readInt};
object MatchExample{
def main(args: Array[String])={

println("Enter the value");
var ip = readInt();

ip match{
case 1 => println("This is first case");
case 2 => println("this is second case");
case 3 =>println("This is third case");
case _=>println("This is default case");
}
}
}