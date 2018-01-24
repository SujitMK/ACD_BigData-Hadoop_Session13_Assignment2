

object Session13_Ass2_Fibonacci {
  
  // Fibonacci Series using LOOP
  
  def fibonacci_loop(n:Int, nth:Int):Unit=
  {
     
    var fibonacciSeries = "1"
    
    
    if(n<2)
      println("THe nth number is "+n)
      
    else 
    {
      var temp:BigInt = 0
      var num1:BigInt = 0
      var num2:BigInt = 1
    
      for(i <- 1 until n)
      {
         temp = num1+num2
         num1=num2
         num2=temp
         fibonacciSeries = fibonacciSeries + temp
      }
      
      println("********************* USING LOOP ********************* ")
      println("THe Fibonacci series is : ")
      println("")
      println(fibonacciSeries)
      println("")
      println("THe fibonacci number at Nth place is : "+fibonacciSeries.charAt(nth-1).toChar)
    }
    
  }
  
  // Usng Recursion
  
  def Fibonacci_recursion(x:Int,nth:Int):Unit = 
  {
    var fibonacciSeries = "1"
    
    if(x<2)
      println("THe nth number is "+x)
      
    def recursion(x:Int, prev:BigInt=0, next:BigInt=1):Unit = 
       
       x match
       {
      case 0 => prev
      case 1 => next
      case _ => 
        fibonacciSeries = fibonacciSeries + (prev+next)
        recursion(x - 1, next, prev+next)
       }
    recursion(x)
    println("********************* RECURSION ********************* ")
    println("THe Fibonacci series is : ")
    println("")
    println(fibonacciSeries)
    println("")
    println("THe fibonacci number at Nth place is : "+fibonacciSeries.charAt(nth-1).toChar)
  }
  
  def main(args:Array[String]):Unit =
  {
    println("Enter the Digit to generate Fibonacci Series")
    var n = readInt()
    println("")
    println("Enter the Nth Digit to Find in the Fibonacci Series")
    var nth = readInt()
    
    
    fibonacci_loop(n,nth)
    Fibonacci_recursion(n,nth)
    
  }
  
}