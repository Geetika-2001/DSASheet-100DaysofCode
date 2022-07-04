
public class MaxMinelement{
    public static void main(String[] args) {
        //function to return minimum and maximum in an array. 
        //Your program should make the minimum number of comparisons.
        int[] arr= {5 , 2 , 9 , 10 , 1};
        int n= 5; 
        Pair Minmax = getMinMax(arr, n);
        System.out.printf("\nMinimum element %d" , Minmax.min);
        System.out.printf("\nMaximun Element %d" , Minmax.max);

    }
    //creating new structure to return multivle values as return type of function
    static class Pair {
 
        int min;
        int max;
    }

    //function to evaluate max and min element
    static Pair getMinMax(int[] arr ,int n){
        Pair Minmax =new Pair();
        int i;

        //if there is only one element in array
        if(n ==1){
            Minmax.min=arr[0];
            Minmax.max=arr[0];
            return Minmax;
        }

        //if multiple elements in array
        if(arr[0]>arr[1]){
            Minmax.min= arr[1];
            Minmax.max= arr[0];
        }else {
            Minmax.min= arr[0];
            Minmax.max= arr[1];
        }

        //traversing complete array
        for (i = 2; i < arr.length; i++) {
            if(arr[i]< Minmax.min){
                Minmax.min= arr[i];
            }else if(arr[i]> Minmax.max){
                Minmax.max= arr[i];
            }
        }
        return Minmax;
}
}