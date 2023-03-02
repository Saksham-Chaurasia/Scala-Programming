object DatatypesExample {
def main(args:Array[String])={
//taking an input from the user from the command line
var sum =0;
var count =0;


for(arg<-args){
 
if(arg.forall(Character.isDigit)){

sum = sum +arg.toInt;
count =count +1;
}


}
var percent = (sum.toFloat/count);
println("The total sum is " + sum);

println("The total percentage " + percent);


if(percent<30){
println("failed");
}
else if(percent>=30 && percent<60){
println("SecondClass");
}
else if(percent>=60 && percent<=90){
println("FirstClassPass");
}
else{
println("Topper Bro");
}


//sum of all the arguments



//boolean data type
var i = true;
println(i);

//short data type
var l:Short = 32755;
//l = 32766;
println(l);

var j:Int = 2147483645;
//j = 2147483649;
println(j);

var k:Long = 9847923849284379l
//k=9387498372893888
println(k);

}
}