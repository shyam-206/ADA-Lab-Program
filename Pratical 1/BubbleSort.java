/*Time complexity
  Best = o(n)
  worst = o(n^2)
  Avg = o(n^2)
  sc = o(1)
  stability = yes
  No of comparison = n-1 
 */

 
public class BubbleSort {
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
            bubble_sort(arr1);
            System.out.println("Worst Case : "+i);
            bubble_sort(arr2);

            //display

        }
    }

    public static void bubble_sort(int[] arr){
        int len = arr.length;
        int swapCount = 0;
        int compCount = 0;

        long startTime = System.nanoTime();
        for(int i =0;i<len-1;i++){
            boolean swapped = false;
            for(int j=0;j<len-i-1;j++){
                compCount++;
                if(arr[j] > arr[j+1]){
                    swapCount++;
                    swapped = true;
                    swap(arr[j],arr[j+1]);
                }
            }
            if(swapped == false)
                break;
        }
        long endTime = System.nanoTime();

        System.out.println("For " + arr.length + " : " + (endTime - startTime));
        System.out.println("SwapCount : " + swapCount);
        System.out.println("CompCount : " + compCount);
        System.out.println();
    }

    static void swap(int a1, int a2){
        int temp = a1;
        a1 = a2;
        a2 = temp;
    }
}
