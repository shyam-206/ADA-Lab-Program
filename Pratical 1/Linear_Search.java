//import java.util.*;

public class Linear_Search {
    public static void main(String[] args){
        
        for(int i=1000;i<=10000;i+=1000){

            int key1 = 1 ; // best case
            int key2 = 10000; // worst case
            
            int[] arr1 = new int[i];
            int[] arr2 = new int[i];

            for(int j=1;j<=i;j++){
                arr1[j-1] = j;
            }
            for(int k=i;k>0;k--){
                arr2[i-k] = k;
            }

            //for best case running time
            System.out.println("Best Case : "+i);
            int ans1 = linearSearch(arr1,key1);
            //for worst case running time 
            System.out.println("Worst Case : "+i);
            int ans2 =  linearSearch(arr2,key2);


        }
    }

    public static int linearSearch(int[] arr,int target){

        int ans = -1;
        long start = System.nanoTime();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                ans = i;
                break;
            }
        }
        long end = System.nanoTime();

        System.out.println("Running time for "+ arr.length + " = " + (end - start));
        return ans;
    }
}
