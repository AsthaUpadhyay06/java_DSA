import java.util.Scanner;

public class may {

 public static void main(String[] args) {
  //  //  char ch= '3';
  //  //  System.out.println((int)ch); //explictic typecasting 
     
  //  // char ch='d';
  //  // int y=ch;
  //  // System.out.println(y); //implicit

  //  // char chh='b';
  //  // System.out.println(chh+0);
  //  // char s='A';
  //  // System.out.println(s+0
  //  //);

  //  int x=4;
  //  System.out.println(x++); //postincrement
  //  System.out.println(x);
  //  int e=5;
  //  System.out.println(++e);





  // 5 MAY 2026 

  // IF  ELSE   ( ABSOLUTE OPERATOR )
   
//   Scanner sc=new Scanner(System.in);
  // System.out.print("enter number : ");
  // int n=sc.nextInt();
  // if(n>=0){
  //   System.out.println(n);
  // }
  // else{
  //    System.out.println(-n);
  // }


  // Take real numner input and check if it is integer or not 

//  System.out.println("enter cp ");
//    double cp=sc.nextDouble();
//    System.out.println("enter sp");
//    double sp=sc.nextDouble();
//    if(cp>sp){
//     System.out.println("loss");
//    }
//    if(sp>cp) {
//     System.out.println("profit");
//    }
//    if(sp == cp){
//     System.out.println("no loss no profit");
//    }




// question take positive interge input and print
// System.out.print("Enter a number: ");
//         int num = sc.nextInt();

        // int magnitude;

        // if (num < 0) {
        //     magnitude = -num;
        // } else {
        //     magnitude = num;
        // }

        // if (magnitude < 69) {
        //     System.out.println("Magnitude is smaller than 69");
        // } else {
        //     System.out.println("Magnitude is not smaller than 69");
        // }
   // oue 
        // if(num % 5==0 || num % 3 ==0){
        //   System.out.println("divisible by 5 or 3");
        // }
        // else{
        //   System.out.println("not divisible by 5 or 3");
        // }
 //sides of triangle 
 

//  System.out.println("enter first side ");
//  int x=sc.nextInt();
//  System.out.println("enter second side");
//  int y=sc.nextInt();
//  System.out.println("enter third side ");
//  int z=sc.nextInt();
//  if(x+y>z && y+z>x && z+x>y ){
//   System.out.println("sides of a triangle ");
//  }
//  else{
//   System.out.println("not a side of triangle");
//  }

 // take positive integer in[ut and print
//   System.out.println("enter first side ");
//  int x=sc.nextInt();

//  if(x%5==0 && x%3==0){
//   System.out.println("number is divisible by 5 or 3 both");
//  }
//  else if(x%3==0){
//   System.out.println("number is divisible by 3");

//  }
//  else if(x%5==0 ){
//   System.out.println("number is divisible by 5 ");
//  }
//  else{
//   System.out.println("number is  not divisible by 5 or 3 both");
//  }
// }


 // take a lenght breadth of a trianglr as input and write a program to find whethrr the area of rectasngle is greater than its perimeter

//  System.out.print("lenght of a rectangle ");
//  int len = sc .nextInt();
//  System.out.println("breadth of rectangle");
//  int bre = sc .nextInt();

// int areaofrectangle= len*bre;
// int perimeter = 2*(len+bre);
// System.out.println(areaofrectangle);
// System.out.println(perimeter);
// if(areaofrectangle > perimeter){
//   System.out.println(" greater");
// }else{
//   System.out.println("not greater");
// }

//given a point(x,y) write a program to find out if it is lies in the 1st quadrant 2md quadrant 3 rd quDRANT ,4TH quadrant on the x axiss y axis aor at the origin

// System.out.println("enter a number");
// int x = sc .nextInt();
// System.out.println("enter second number");
// int y =sc.nextInt();

// if(x==0 && y==0){
//   System.out.println("origin");
// }
// else if (y==0){
//   System.out.println("x asis");
// }
// else if(x==0){
//   System.out.println("y axis");
// }
// else if (x>0 && y>0){
//   System.out.println("first quadrant");
// }
// else if (x<0 && y>0){
//   System.out.println("second quadrant");
// }
// else if (x<0 && y<0){
//   System.out.println("third quadrant");
// }
// else{


//   System.out.println("fourth quadrant");
// }



// take 3 positive integers input and print the greatest of them



// System.out.println("enter a number");
// int x = sc .nextInt();
// System.out.println("enter second number");
// int y =sc.nextInt();
// System.out.println("enter third number");
// int z =sc.nextInt();
// if (x > y && x > z) {
//             System.out.println("x is greatest");
//         }

//         else if (y > x && y > z) {
//             System.out.println("y is greatest");
//         }

//         else {
//             System.out.println("z is greatest");}



// ternary operator 

//first use case 
// System.out.println("enter a number");
// int x = sc .nextInt();


// String num = (x % 2 == 0) ? "even" : "odd";

// System.out.println(num);
//System.out.println((x%2==0 ? "even" : " odd"));






//LOOPS

// for(int i=1;i<=10;i++){
//      System.out.print(i + " "
//      );
// }

//print astha n times .take n input from user
Scanner sc=new Scanner(System.in);

//  System.out.println("enter n terms ");
//   int n=sc.nextInt();
//  for(int i=1;i<n;i++){
//      System.out.println("Astha");
//  }



// que 2 => print all even numbers from 1 to 100


// for(int i=2;i<=10;i++){
//      if(i%2==0){
//           System.out.println( i);
//      }
// }




// que 3=> print 17 table

// for(int i=1;i<=10;i++){
//      System.out.println(i*17);
// }



// que 4 => print all odd numbers divisible by 3 from 1 to 100

// for(int i=1;i<=100;i=i+2){
//      if(i%3==0){
//           System.out.print( i+ " ");
//      }
// }


// or


// for(int i = 1; i <= 100; i++){

//     if(i % 2 != 0 && i % 3 == 0){
//         System.out.print(i + " ");
//     }

// }


// que 5 => print nu,bers from n to 1 
// int n= 5;
// for(int i=n;i>=1;i-- ){
//      System.out.println(i);
// }



//que 6 =>print this series 99,95,91,87,...upto all terms which are positive


// for( int i=99;i>0;i=i-4) {
//      System.out.println(i);
// }


//  que 7 => display this gp 1,2,4,8,...upto n terms

//  int a=1,r=2;
//  for(int i=1;i<=10;i++){
//      System.out.println(a);
//      a*=r;

//  }


// que 8 => take n as input from user and print the following sequence 1,10,2,9,3,8,so on...

// int n=5;
// for(int i=1;i<5;i++){
//      System.out.println(i);
//      System.out.println(n);
//      n--;
// }


// que => print all alphabets with their ascii

// for(int i = 65; i <= 90; i++){
//     System.out.println((char)i + " " + i);
// }



//que 9  find number is composite or not 


// System.out.println("enter number");
// int n= sc.nextInt();
//    int count = 0;
// for(int i=1;i<n;i++)
// {
//   if(n%i==0){
//     count++;

//   }
// }
// if(count>2){
//   System.out.println("composite " );
// }
// else{
//   System.out.println("not composite");
// }

// extra approach 

// for(int i=2;i<n-1;i++){
//   if(n%i==0){
//     System.out.println("composite number");
// //     break;
//   }
// }

//prime number 


// int count=0;
// for(int i=1;i<=n;i++){
//   if(n%i==0)
// {
//   count++;
// }}
// if(count==2){
//   System.out.println("prime");
// }
// else{
//   System.out.println("notprime");
// }


//count digits 


// int n=56719;
// int count=0;
// while(n!=0){
//   n/=10;
//   count++;
  
// }
// System.out.println(count);



// print sum of digits
// int i;
// int n=65142;
// int count=0;
// while(n!=0){
//  i= n%10;
//   count=count+i;
//   n/=10;


// }
// System.out.println("sum is " + count);



// reverse a number
// int n=1286;
// int i;
// int reverse=0;
//  while(n!=0){
//   i=n%10;
//  reverse= reverse*10+i;
//   n=n/10;
  
//  }
//  System.out.println(reverse);




//print sum of number and its reverse;

// int n=1286;
// int original=n;
// int i;
// int reverse=0;
//  while(n!=0){
//   i=n%10;
//  reverse= reverse*10+i;
//   n=n/10;
  
//  }
//  System.out.println(reverse);

//  int sum= original + reverse;
//  System.out.println("sum is : " + sum);
//  int againreverse=0;
//   while(sum!=0){
//   int digit=sum%10;
//  againreverse= againreverse*10+digit;
//   sum=sum/10;
  
//  }
//  System.out.println(againreverse);



// factorial of a number
//  int n=6;
//  int f=1;
//  for(int i=1;i<=5;i++){
//   f*=i;
//  }
// System.out.println(f);


// int n=124;
// int i;
// int original=n;
// int reverse=0;
//  while(n!=0){
//   i=n%10;
//  reverse= reverse*10+i;
//   n=n/10;
  
//  }
//  if(reverse==original){
//   System.out.println("plandrone");
//  }else{
//   System.out.println("not palandrone");
//  }




// Pattern Printing
// int row = 4;
// int column=4;

// for(int i=1;i<=row;i++){
//   for(int j=1;j<=column;j++){
//     System.out.print("*"  + " ");
//   }
//   System.out.println();
// }
 



//que 2 print 1 2 3 4
              // 1 2 3 4
              // 1 2 3 4
              // 1 2 3 4

// int n=4;

//  for(int i=1;i<=n;i++){
//   for(int j=1;j<=n;j++){
//        System.out.print(j + " ");
//   }
//   System.out.println();
//  }




// que
// print   A B C D
//         A B C D
//         A B C D
//         A B C D 


// int n=4;

//  for(int i=1;i<=n;i++){
//   for(int j=65;j<=68;j++){
//        System.out.print((char)j + " ");
//   }
//   System.out.println();
//  }


// print 1 1 1 1
//       2 2 2 2
//       3 3 3 3
//       4 4 4 4

// int n = 4;

// for(int i=1; i<=n; i++){
//     for(int j=1; j<=n; j++){
//         System.out.print(i + " ");
//     }
//     System.out.println();
// }




// print A A A A
//       B B B B 
//       C C C C 
//       D D D D 


// int n = 4;

// for(int i=65; i<=68; i++){
//     for(int j=1; j<=n; j++){
//         System.out.print((char)(i) + " ");
//     }
//     System.out.println();
// }


// print a a a a
//       b b b b 
//       c c c c 
//       d d d d 


// int n = 4;

// for(int i=97; i<=100; i++){
//     for(int j=1; j<=n; j++){
//         System.out.print((char)(i) + " ");
//     }
//     System.out.println();
// }

// print *
//       * * 
//       * * * 
//       * * * *

// int n=4;
// for(int i=1; i<=n; i++){
//     for(int j=1; j<=i; j++){
//         System.out.print( "*+ " ");
//     }
//     System.out.println();
// }



// int n=4;
// for(int i=1; i<=n; i++){
//     for(int j=1; j<=i; j++){
//         System.out.print( j + " ");
//     }
//     System.out.println();
// }

//  print A 
//        A B 
//        A B C 
//        A B C D 


// int n=4;
// for(int i=1; i<=n; i++){
//     for(int j=1; j<=i; j++){
//         System.out.print((char)(64+j) + " ");
//     }
//     System.out.println();
// }



// print A
//        B B 
//        C C C 
//        D D D D 



// int n=4;
// for(int i=1; i<=n; i++){
//     for(int j=1; j<=i; j++){
//         System.out.print((char)(64+i) + " ");
//     }
//     System.out.println();
// }


// print 1
//        A B 
//        1 2 3 
//        A B C D 
          // 1 2 3 4 5



// int n = 5;

// for(int i = 1; i <= n; i++) {

//     for(int j = 1; j <= i; j++) {

//         if(i % 2 == 0) {
//             System.out.print((char)(64 + j) + " ");
//         }
//         else {
//             System.out.print(j + " ");
//         }
//     }

//     System.out.println();
// }


// int n=4;
// for(int i=1; i<=n; i++){
//     for(int j=1; j<=n+1-i; j++){
//         System.out.print("*" + " ");
//     }
//     System.out.println();
// }



// print 
// a b c d 
// a b c 
// a b 
// a


// int n=4;
// for(int i=1; i<=n; i++){
//     for(int j=1; j<=n+1-i; j++){
//         System.out.print((char)(96+j) + " ");
//     }
//     System.out.println();
// }


//print 
// A B C D 
// A B C 
// A B 
// A


// int n=4;
// for(int i=1; i<=n; i++){
//     for(int j=1; j<=n+1-i; j++){
//         System.out.print((char)(64+i) + " ");
//     }
//     System.out.println();
// }




//HOLLOW RECTANGLE  

// int m=4;
// int n=5;
// for(int i=1; i<=m; i++){
//     for(int j=1; j<=n; j++){
//         if(i==1 || i==m || j==1 || j==n){
//         System.out.print("* ");
//         }
//         else{
//             System.out.print("  ");
//         }
//            }
//     System.out.println();
// }



//starplus



// int n=5;
//         int mid = n / 2 + 1;

//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= n; j++) {

//                 if(i == mid || j == mid) {
//                     System.out.print("*");
//                 }
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println( );
//         }




//Floyd's triangle

// int n=4;
// int a=1;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print(a);
//         a++;
//     }
   
//     System.out.println();
// }


// Binary's triangle

// int n=5;
// int a=1;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//         if((i+j)%2==0){
//             System.out.print("1");
//         }else{
// System.out.print("0");
//         }
        
       
//     }
   
//     System.out.println();
// }


// int n=9;

// for(int i=1;i<=n;i=i+2){
//     for(int j=1;j<=i;j=j+2){
//         System.out.print(j);
        
//     }
   
//     System.out.println(  );
// }



// star triangle vertically flipped

// int n=4;


// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
        
//     }
// for( int j=1;j<=i;j++){
//     System.out.print("*");
// }
   
//     System.out.println(  );
// }

//Numbered Triangle vertically flipped



// int n=4;



// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
        
//     }
// for( int j=1;j<=i;j++){
//     System.out.print(j);
  
// }
   
//     System.out.println(  );
// }




//Alphabet triangle VF


// int n=4;



// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
        
//     }
// for( int j=1;j<=i;j++){
//     System.out.print((char)(64+i));
  
// }
   
//     System.out.println(  );
// }



// Rhombus

// int n=4;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
        
//     }
//     for(int j=1;j<=n;j++){
//         System.out.print("*");
//     }
//     System.out.println();
//     }





// int n=5;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print(" ");
        
//     }
 
//     for(int j=1;j<=n+1-i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
//     }


//pyramid

// int n=4;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
        
//     }
 
//     for(int j=1;j<=2*i-1;j++){
//         System.out.print("*");
//     }
//     System.out.println();
//     }



//Diamond

//     int n = 5;

// // Upper part
// for(int i=1; i<=n; i++){

//     for(int j=1; j<=n-i; j++){
//         System.out.print(" ");
//     }

//     for(int j=1; j<=2*i-1; j++){
//         System.out.print("*");
//     }

//     System.out.println();
// }

// // Lower part
// for(int i=n-1; i>=1; i--){

//     for(int j=1; j<=n-i; j++){
//         System.out.print(" ");
//     }

//     for(int j=1; j<=2*i-1; j++){
//         System.out.print("*");
//     }

//     System.out.println();
// } 




//Bridge

// int n=5;

// for(int i=1;i<=n;i++){
//     // left star
//     for(int j=1;j<=n+1-i;j++){
//         System.out.print("*"); // left star
//     }
//     for(int j=1;j<=2*i-2;j++){
//     System.out.print(" "); //spaces 
// }
// //right star
// for(int j=1;j<=n+1-i;j++){
//     System.out.print("*"); //right star
// }
// System.out.println();
// }



// Number Spiral

// int n=4;
// for(int i=1;i<=2*n-1;i++){
//     for(int j=1;j<=2*n-1;j++){
//         int a=i,b=j;
//         if(i>n) a=2*n-i;
//         if(j>n) b=2*n-j;
//         System.out.print(Math.min(a, b)+ " ");
    
//             }
//              System.out.println();
//         }
     



// FUNCTIONS/ METHODS

// System.out.println(Math.sqrt(64));
// System.out.println(Math.cbrt(8));
// System.out.println(Math.abs(-49));
// System.out.println(Math.floor(6.8));
// System.out.println(Math.floor(-7.8));
// System.out.println( Math.ceil(5.6));
// System.out.println( Math.ceil(-5.6));
// System.out.println(Math.min(3.56,4));
// System.out.println(Math.min(-36,4));
// System.out.println(Math.min(-36,-8));
// System.out.println(Math.max(-36,-8));
// System.out.println(Math.max(-36,-100));
// System.out.println(Math.min(-36,-100));


//Max Of three in built
// Scanner s =new Scanner(System.in);
// System.out.print("enter three number");
// int n=s.nextInt();
// int o=s.nextInt();
// int p=s.nextInt();
// System.out.println(Math.max(Math.max(n, o),p));


//Max Of four in built

// int n=9;
// int o=56;
// int p=3;
// int q=54;

//  System.out.println(Math.max(Math.max(n, o), Math.max(p, q)));

// System.out.println(Math.pow(2, 5));

//go to next functions file

//SYNTAK



}

}












