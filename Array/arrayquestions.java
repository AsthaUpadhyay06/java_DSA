import java.util.Scanner;

public class arrayquestions {
    public static void main(String[] args) {
        //  int[] arr=new int[5];
        // Scanner sc=new Scanner(System.in);
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();
        // }
        
        // // question is printing double of arraay
        // // System.out.println("output"); 
        // // for(int i=0;i<arr.length;i++){
        // //     System.out.println(arr[i]*2);
        // // }

        // // print negative values only 
        // System.out.println("negative values only ");
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]<0){
        //         System.out.println(arr[i]);
        //     }
        // }



        //Print array sum 

        // Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        // int[] arr=new int[n];
        // for(int i=0;i<n;i++){
        // arr[i]= sc.nextInt();
        // }
        // int sum=0;
        // for(int i=0;i<n;i++){
        //     sum=arr[i]+sum;
        // }
        // System.out.println("Sum is " + sum);

        //Maximum elements in array
        

        
        // int [] arr={-4,5,3,89 ,654,-34,2};
        // int max=arr[0];
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>max){
        //         max=arr[i];
                
        //     }
        // }
        
        // System.out.println(max);

//search element in array

// int[] arr={34,5,6,4,3,2};
// int x=4;
// boolean flag=false;
// for(int i=0;i<arr.length;i++){
//  if(arr[i]==x){
//     flag=true;
//     break;
//  }
// }
//  if(flag==true){
//     System.out.println("exist");
//  }
//  else{
//     System.out.println("not exists");
//  }

//Two sum

// int [] arr={1,19,5,-3};
// int target=6;
// boolean found=false;
// for(int i=0;i<arr.length-1;i++){
//     if(arr[i]+arr[i+1]==target){
//     found=true;
//     break;
//     }
//  }
//  if(found==true){
//     System.out.println("found");
//  }
//  else{
//     System.out.println("not found");
//  }



//find second Maximum

// int [] arr={4,6,2,6,8,88,866,332};
// int max=Integer.MIN_VALUE;
// int smax=Integer.MIN_VALUE;
// for(int i=0;i<arr.length;i++){
//    if(arr[i]>max){
//       max=arr[i];
//    }
//       }
//       for(int i=0;i<arr.length;i++){
//       if(arr[i]>smax && arr[i]!=max){
//          smax=arr[i];
//    }

// }
//  System.out.println(smax);
//  System.out.println(max);


//Two pointer approach Reverse Array

// int [] arr={45,67,53,2,4,56,6,78,8};
// int n=arr.length;
// int i=0;
// int j=n-1;

// while(i<j){
//    int temp=arr[i];
//    arr[i]=arr[j];
//    arr[j]=temp;
//    i++;
//    j--;
// }
// for(int ele:arr){
//    System.out.print(ele+ " ");
// }

//Rotate Array

// int [] arr={1,2,3,4,5};
// int d=2;
// int n=arr.length;
// for(int r=0;r<d;r++){
//     int first=arr[0];
//     for(int i=0;i<n-1;i++){
//         arr[i]=arr[i+1];

//     }
//     arr[n-1]=first;
// }
// for(int ele:arr){
//     System.out.print(ele+ " ");
// }


//Segregate 0s ad 1s

int []arr={1,0,0,1,1,0,0,1};
 // count the number of zeroes and ones first
  int countzero=0;
  int countone=0;
  for(int i=0;i<arr.length;i++){
    if(arr[i]==0){
        countzero++;
    }
    else{
        countone++;
    }
  }
//   System.out.println(countone);
//   System.out.println(countzero);

  for(int i=0;i<countzero;i++){
    arr[i]=0;
  }
  for(int i=countzero;i<arr.length;i++){
    arr[i]=1;
  }
  for(int ele:arr){
    System.out.print(ele + " ");
  }
    }
}
       

