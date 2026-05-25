import java.util.Scanner;

public class arrayquestions {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        // question is printing double of arraay
        // System.out.println("output"); 
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]*2);
        // }

        // print negative values only 
        System.out.println("negative values only ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.println(arr[i]);
            }
        }

    }
}
