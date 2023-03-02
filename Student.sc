class Student{
var name = "Saksham";
var age = 20;
var role = "Data Engineer"

def show()={
println("Hello! I am " + name + " my age is: " + age);
println("My role here is " + role);
}
}

object Main{
def main(args: Array[String])={

var ob = new Student();
ob.show();
}
}