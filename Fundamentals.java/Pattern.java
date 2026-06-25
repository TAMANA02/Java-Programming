public class pattern 
{
    public static void main(String[] args)
    {
    //     for(int i=1; i<=4; i++)
    // {
    //          for(int j=1; j<=5; j++)
    //     {
    //             System.out.print("*");
    //     }
    //     System.out.print("\n");
    // }


        // int n=4;
        // int m=5;

        // for(int i=1; i<=n; i++){

        //     for(int j=1; j<=m; j++){

        //         if(i == 1 || j == 1 || i == n || j == m){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
                
        //     }
        //     System.out.println();
        // }
       
    //    int n = 4;
    //    for(int i=0 ; i<=n ; i++){

    //     for(int j=0; j<=i; j++){
            
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //    }

    // int n = 4;
    //    for(int i=n ; i>=1 ; i--){

    //     for(int j=1; j<=i; j++){
            
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //    }


// int n = 4;
//        for(int i=1 ; i<=n ; i++){
//            //inner loop for space print
//         for(int j=1; j<=n-i; j++){
//             System.out.print(" ");
//         }

//        //inner loop for star print
//        for(int j=1; j<=i; j++){
//         System.out.print("*");
//        }
//        System.out.println();

//        }


    // int n = 5;
    //    for(int i=1 ; i<=n ; i++){

    //     for(int j=1; j<=i; j++){
            
    //         System.out.print(j+" ");
    //     }
    //     System.out.println();
    //    }

//  int n = 5;
//        for(int i=n ; i>=1 ; i--){

//         for(int j=1; j<=i; j++){
            
//             System.out.print(j+ " ");
//         }
//         System.out.println();
//        }

//  int n = 5;
//        for(int i=1 ; i<=n ; i++){

//         for(int j=1; j<=n-i+1; j++){
            
//             System.out.print(j + " ");
//         }
//         System.out.println();
//        }

// int n=5;
// int number = 1;
// for(int i=1; i<=n; i++){
//     for(int j=1; j<=i; j++){
//         System.out.print(number+ " ");
//         number++;
//     }
//     System.out.println();
// }


// int n=5;
// for(int i=1; i<=n; i++){
//     for(int j=1; j<=i; j++){
//         int sum= i+j;
//         if(sum % 2 == 0){
//             System.out.print("1 ");
//         }else{

//             System.out.print("0 ");
//         }
//     }
//      System.out.println();
// }

//solid rhombus
// int n = 5;
//        for(int i=1 ; i<=n ; i++){
//            //inner loop for space print
//         for(int j=1; j<=n-i; j++){
//             System.out.print(" ");
//         }

//        //inner loop for star print
//        for(int j=1; j<=n; j++){
//         System.out.print("*");
//        }
//        System.out.println();

//        }

//hollow rhombus
// int n = 5;

//        for(int i=1 ; i<=n ; i++){
//            //inner loop for space print

//         for(int j=1; j<=n-i; j++){
//             System.out.print(" ");
//     }
//        //inner loop for star print
//        for(int j=1; j<=n; j++){
//         if(i==1 || j==1 || i==n || j==n){ 
//                System.out.print("*");
//        }else{
//          System.out.print(" ");
//         }
//        }
//        System.out.println();

//        }



//pyramid
// int n=5;
// for(int i=1; i<=n; i++){
    
//     for(int j=1; j<=n-i; j++){
//       System.out.print(" ");
//     }
//     for(int j=1; j<=i; j++){
//         System.out.print(i+ " ");
//     }
//     System.out.println();
// }


// butterfly pattern
// int n=5;
// //upper half
// for(int i=1; i<=n; i++){
//     //first part
//    for(int j=1; j<=i; j++){
//       System.out.print("*"); 
//    }
//     //spaces
//     int spaces = 2*(n-i);
//    for(int j=1; j<=spaces; j++){
//     System.out.print(" ");
//    }
//    //second part
//    for(int j=1; j<=i; j++){
//     System.out.print("*");
//    }

//    System.out.println();
// }

// //lower half

// for(int i=n; i>=1; i--){
//     //first part
//    for(int j=1; j<=i; j++){
//       System.out.print("*"); 
//    }
//     //spaces
//     int spaces = 2*(n-i);
//    for(int j=1; j<=spaces; j++){
//     System.out.print(" ");
//    }
//    //second part
//    for(int j=1; j<=i; j++){
//     System.out.print("*");
//    }

//    System.out.println();
// }

//hollow butterfly pattern

// int n=5;
// //upper half
// for(int i=1; i<=n; i++){
//     //first part
//    for(int j=1; j<=i; j++){
//     if(i==1 || j==1|| j==i) { 
//          System.out.print("*");
//         }else{
//             System.out.print(" ");
//         }
   
//    }
//     //spaces
//     int spaces = 2*(n-i);
//    for(int j=1; j<=spaces; j++){
//     System.out.print(" ");
//    }
//    //second part
//    for(int j=1; j<=i; j++){
//     if(i==1 || j==1 || j==i){
//          System.out.print("*");
//     }else{
//         System.out.print(" ");
//     }
//    }

//    System.out.println();
// }

// //lower half

// for(int i=n; i>=1; i--){
//     //first part
//    for(int j=1; j<=i; j++){
//      if(i == 1 || j == 1 || j == i) {
//             System.out.print("*");
//         } else {
//             System.out.print(" ");
//         }
   
//    }
//     //spaces
//     int spaces = 2*(n-i);
//    for(int j=1; j<=spaces; j++){
  
//          System.out.print(" ");
   
  
//    }
//    //second part
//    for(int j=1; j<=i; j++){
//     if(i == 1 || j == 1 || j == i) {
//             System.out.print("*");
//         } else {
//             System.out.print(" ");
//         }
//    }

//    System.out.println();
// }


//palindrome pattern

// int n =5;
//  for(int i=1; i<=n; i++){
//     //spaces
//     for(int j=1; j<=n-i; j++){
//         System.out.print(" ");
//     }

//     //first half
//     for(int j=i; j>=1; j--){
//         System.out.print(j);
//     }

//     //second half
//     for(int j=2; j<=i; j++){
//         System.out.print(j);
//     }

//     System.out.println();
//  }

//diamond pattern
// int n=4;

// //upper half
// for(int i=1; i<=n; i++){
//     //spaces
//     for(int j=1; j<=n-i; j++){
//         System.out.print(" ");
//     }

//     //stars
//     for(int j=1; j<=2*i-1;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

// //lower half

// for(int i=n; i>=1; i--){
//     //spaces
//     for(int j=1; j<=n-i; j++){
//         System.out.print(" ");
//     }

//     //stars
//     for(int j=1; j<=2*i-1;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }


//pascals triangle


        int n = 5;

        for (int i = 0; i < n; i++) {

            // spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            int num = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");

                // calculate next value
                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}


  