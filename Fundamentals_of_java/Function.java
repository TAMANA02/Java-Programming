// import java.util.*;
// public class function {

    //ADD NUMBERS
    // public static int printSum( int a, int b){
    //     int sum = a + b;
    //     return sum;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int sum = printSum(a,b);
    //     System.out.println("Sum of two numbers is: " + sum);
               



    //MULTIPLY NUMBERS
// public static int printMultiply( int a, int b){
//         return  a * b;
      
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
     
//         System.out.println("Multiplication of two numbers is: " +printMultiply(a,b));
               



    //CHECK FACTORIAL
// public static void printFactorial( int n){
//     int factorial = 1;
//     if(n<0){
//         System.out.print("invalid number");
//         return;
//     }
//        for(int i=n; i>=1; i--){
//             factorial = factorial *i;
            
//        }
//       System.out.println(factorial);
//       return;
//     }
//     public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
      
     
//       printFactorial(n);
               



   //CHECK PRIME
// public static  boolean isPrime(int n){
        
//         for(int i=2; i<n/2; i++){
//             if(n % i == 0){
//                 return false;
               
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
      
    //    Scanner sc = new Scanner(System.in);
    //    int n = sc.nextInt();
       
//        if(isPrime(n)) {
//         if(n <= 1){
//             System.out.println( "this is neither prime not composite");
//         }
//         else{
//             System.out.println( "this is a prime number");
//         }
//     }
//         else{
//             System.out.print("this is not a prime number");
//         }
     

//CHECK EVEN 
    //  public static boolean isEven(int i){
    //     return i % 2 == 0;
    //  }

    // public static void main(String[] args) {

    //     Scanner sc = new Scanner(System.in);
    //     int i = sc.nextInt();
       
    //     if(isEven(i)) {
    //         System.out.println("the given number is even");
    //     }
    //     else{
    //         System.out.println("the given number is not even");
    //     }
    // }


//PRINT TABLE 

// public static int printTable(int n){
//     int i = 1;
//       return  i * n;
     
//        }


//    public static void main(String[] args) {
       
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();


//           for (int i = 1; i <= 10; i++) {
//            System.out.println(n + "*" + i + "=" + i * n);
//            }
//    }
// }


 import java.util.Scanner;
 public class function {
    
    //AVERAGE OF THREE NUMBERS

    // public static float printAverage(int a , int b , int c){
    //       int average = (a + b + c) / 3;

    //       return average;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int c = sc.nextInt();
       
    //  System.out.println(printAverage( a , b , c));






    // SUM OF ALL ODD NUMBERS FROM 1 TO n
    public static int printSum(int n) {
        int m = (n + 1) / 2;
        int sum = m * m;
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Sum is: " + printSum(n));

        sc.close();
    }











    }


