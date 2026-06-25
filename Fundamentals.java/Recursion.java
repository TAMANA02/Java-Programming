import java.util.*;

public class recursion {
    // public static void printNumber(int n){
    //     if(n == 0){//base condition
    //         return;
    //     }
    //     System.out.println(n);//print
    //     printNumber(n-1);//recursion
    // }

    // public static void main(String arg[]){
    //     int n = 5;
    //     printNumber(n);




//sum of first n natural numbers
    
// public static void printSum(int i , int n, int sum){
//      if(i == n){
//         sum += i;
//         System.out.println(sum);
//         return;
//      }
//      sum += i;
//      printSum(i+1 , n , sum);
//      System.out.println(i);
// }


// public static void main(String args[]){
//       printSum(1 , 5 , 0);



//Factorial of a number n
// public static int printFact(int  n ){
//     if(n==1 || n==0){
//         return 1;
//     }
//   int fact_nm1 = printFact(n-1);
//   int fact_n = n * fact_nm1;
//   return fact_n;
// }


// public static void main(String args[]){
//       int n = 5;
//       int ans = printFact(n);
//       System.out.println(ans);


//Fibonacci series till nth term
// public static void printFib(int a, int b, int n){
//      if(n ==0){
//         return;
//      }
//      int c = a+ b;
//      System.out.println(c);
//      printFib(b , c , n-1);
// }


// public static void main(String args[]){
//  int a=0 , b=1;
//      System.out.println(a);
//      System.out.println(b);
//     int n =8;
//      printFib( a , b, n-2);



//print x^n stack limit = n

public static int printmul(int x , int n){

    if(n==0){
        return 1;
    }

    if(n == 0){
        return 0;
    }

    int xPowernm1 =  printmul(x, n-1);
    int xPown = x * xPowernm1;
      return xPown;
}
public static void main(String args[]){

    int x=4 , n =5;
    int ans = printmul(x ,n);
    System.out.println(ans);
}


}

