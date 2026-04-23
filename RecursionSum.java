// Program to calculate the sum of first n natural numbers using recursion
public class RecursionSum{
    static int sumOfNaturalNum(int n){ 

        // Base Case : Stops at 1 
        if(n == 1){
            return 1;
        }
        // Recursive call : Adds n to the sum of (n-1)
        return n + sumOfNaturalNum(n - 1);

    }
    public static void main(String[] args){
        int x = 5;
        int result = sumOfNaturalNum(x);
        System.out.println("The sum of the first natural number is :"  +  result);
    }
}
