

public class Factorial{
    public static void main(String[] args){
       
        for(int i=4;i<=14;i++){
        
            //for the iterative approach running time
            int n1 = i;
            int fact = 1;
            long st1 = System.nanoTime();
            while(n1!=0){
                fact=fact*n1;
                n1--;
            }
            long et1 = System.nanoTime();
            System.out.println("fact of "+ i + " is " + fact + " and iterative runnng time is :"+(et1-st1));
            
            //for the recursive approach running time
            int n2 = i;
            long st2 = System.nanoTime();
            int ans = fact(n2);
            long et2 = System.nanoTime();
            
            System.out.println("fact of "+ i + " is " + ans + " and recursive runnng time is :"+(et2-st2));

        }
    }

    static int fact(int n){

        if(n == 1){
            return 1;
        }

        return n*fact(n-1);

    }
}