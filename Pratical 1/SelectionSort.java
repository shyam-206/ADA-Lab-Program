/*Time complexity
  Best = o(n^2)
  worst = o(n^2)
  Avg = o(n^2)
  sc = o(1)
  stability = no
  no. of comparison = n-1
 */

public class SelectionSort {
    
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
            selection_sort(arr1);
            System.out.println("Worst Case : "+i);
            selection_sort(arr2);
        }
    }

    static void selection_sort(int[] arr){
        int swapCount = 0;
        int compCount = 0;

        long startTime = System.nanoTime();
        for(int i=0;i<arr.length-1;i++){
            int min = arr[i];
            int pos = i;

            for(int j=i+1;j<arr.length;j++){
                compCount++;
                if(arr[j]<min){
                    min = arr[j];
                    pos = j;
                }
            }
            if(i!=pos){
                swapCount++;
                swap(arr,i,pos);
            } 
        }
        long endTime = System.nanoTime();

        System.out.println("For " + arr.length + " : " + (endTime - startTime));
        System.out.println("SwapCount : " + swapCount);
        System.out.println("CompCount : " + compCount);
        System.out.println();

    }

    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
