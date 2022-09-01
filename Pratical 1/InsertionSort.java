

public class InsertionSort {
    public static void main(String[] args){
       
        for(int i = 100; i <=1000; i+=100){
            int[] arr1 = new int[i];
            int[] arr2 = new int[i];
            
            for(int j = 1;  j <= arr1.length; j++){
                arr1[j-1] = j;
            }
            for(int k = arr2.length; k>=1; k--){
                arr2[i-k] = k;
            }

            System.out.println("Best Case : "+i);
            insertion_sort(arr1);
            System.out.println("Worst Case : "+i);
            insertion_sort(arr2);
        }
    }  
    
    static void insertion_sort(int[] arr){
        int swapCount = 0;
        int compCount = 0;

        long startTime = System.nanoTime();
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;

            while(++compCount>0 && j>=0 && arr[j]>key){
                swapCount++;
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }
        long endTime = System.nanoTime();

        System.out.println("For " + arr.length + " :- " + (endTime - startTime));
        System.out.println("SwapCount :- " + swapCount);
        System.out.println("CompCount :- " + compCount);
        System.out.println();   
    }
}
