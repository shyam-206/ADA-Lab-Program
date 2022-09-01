

public class Binary_Search {
public static void main(String[] args){ 
    
    for(int i=1000;i<=10000;i+=1000){

        int key1 = 1 ; // best case
        int key2 = 10000; // worst case
        
        int[] arr1 = new int[i];
        int[] arr2 = new int[i];

        for(int j=1;j<=arr1.length;j++){
            arr1[j-1] = j;
        }
        for(int k=arr2.length;k>0;k--){
            arr2[i-k] = k;
        }

        //for best case running time
        System.out.println("Best case : " + i);
        binarySearch(arr1,key1);
        //for worst case running time
        System.out.println("Worst Case : " + i);
        binarySearch(arr2, key2);
        
    }
} 

   static void binarySearch(int[] arr,int target){
    int l = 0;
    int h = arr.length-1;
   // boolean ans = false;

    long start = System.nanoTime();
    while(l<=h){
        int mid = l+(h-l)/2;

        if(target > arr[mid])
            l = mid + 1;
        else if(target == arr[mid])
           break;
        else 
            h = mid-1;
    
    }
    long end = System.nanoTime();

    System.out.println("Running time for "+ arr.length + " = " + (end - start));

    // if(ans==true)
    //     System.out.print("Found");
    // else
    //     System.out.print("not Found");
   }

}
