public class Count_Sort{
    public static void main(String[] args){
        int[] arr = {2,9,4,11,15};

        countSort(arr,arr.length);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void countSort(int[] arr,int length){
        int[] newArr = new int[length+1];

        int max  = arr[0];
        for(int i=1;i<length;i++){
            if(arr[i]>max)
                max = arr[i];
        }

        int[] countArr = new int[max+1];

        for(int i=0;i<max;i++)
            countArr[i] = 0;

        for(int i=0;i<length;i++)
            countArr[arr[i]]++;
            
        for(int i=1;i<=max;i++){
            countArr[i] += countArr[i-1];
        }

        for(int i=length-1;i>=0;i--){
            newArr[countArr[arr[i]]-1] = arr[i];
            countArr[arr[i]]--;
        }


        for(int i =0;i<length;i++){
            arr[i] = newArr[i];
        }

    }
}