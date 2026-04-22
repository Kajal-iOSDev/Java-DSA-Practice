 public class SumOfArray{                                                                                           
 // function to calculate sum of an array
    static int SumArray(int [] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i]; // Adding each element to sum
        }
        return sum;

    }
    public static void main(String[] args){
        int [] ar1 = {23, 4, 67, 87, 90}; 
        int total = SumArray(ar1); // Call function & store result
        System.out.println("The sum of array is : "   +  total);
    }
}
