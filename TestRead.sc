import scala.io.StdIn.{readLine,readInt};

object TestRead{
def main(args:Array[String])={
println("Enter the name ");
var name = readLine();


var sum =0;

for( i <- 1 to 5){
println("Enter the marks" + i);
var l = readInt();
sum = sum+l;
}

println(sum);
}
}