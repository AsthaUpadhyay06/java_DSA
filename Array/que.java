public class que {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        mulAdd(arr);
        

    }
    public static void mulAdd(int[]arr){
       for(int i=0;i<arr.length;i++){
        if(i%2==0){
            System.out.println(arr[i]*2);
        }
        else{
            System.out.println(arr[i]+10);
            
        }
       }
    }
}
