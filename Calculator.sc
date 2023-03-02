import scala.io.StdIn.{readLine,readInt,readFloat,readChar};
import scala.util.control.Breaks._
object Calculator{
def main(args: Array[String])={

//This is a Calculator for two numbers

println("Enter the first number");

var v1 = readFloat();
var v =1;
var result:Float =0;
while(true){

println("Enter the operator +,-,*,/ ");

var op = readChar();
if(op.isDigit){
break;
}

println("Enter the number");

var v2 = readFloat();


op match {
case '+' => if(v==1){result = (v1 +v2);}
		else {result = result + v2;}
		println("Addition : " + result);

case '-' => if(v==1){result =  (v1 -v2);}
		else {result = result -v2;}
		println("Subtraction: " + result);

case '*' => if(v==1){result  = (v1*v2);}
		else {result = result*v2;}
           
		println("Multiplication: " + result);

case '/' => if(v==1){result = (v1/v2);}
		else {result = result/v2;}
		println("Division: " + result);


case _=>println("Enter the right operator");



}
v=2;
println("To exit enter any number");

}
}
}