import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // int [] arr={1,2,34,56,78,97,43};
        //     System.out.println(arr); // address 

        //     arr[4]=56;
        //     System.out.println(arr[4]);

            // int[] arr=new int [4]; 4 size ka array 0 to 3;

            // int[] arr={3,6,3,2,57};
            // // int n=arr.lengthl index 00 to n-1;
            // for(int i=0;i<arr.length;i++){
            //     System.out.println(arr[i] + " ");
            // }


            int[] astha=new int[4];
            // for(int i=0;i<astha.length;i++){
            //     System.out.println(astha[i]+ " "); // by defailt zero hi printm krega 
            // }

            // input 
            Scanner sc=new Scanner(System.in);
            for(int i=0;i<astha.length;i++){
                // int x= sc.nextInt();
                // astha[i]= x;

                // OR 

                astha[i]=sc.nextInt();
                
            }
            System.out.println("printing arrayy");
            for(int i=0;i<astha.length;i++){
                System.out.println(astha[i]);
                
            }
    
        }
    }

