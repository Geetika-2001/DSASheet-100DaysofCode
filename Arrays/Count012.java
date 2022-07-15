import java.util.Arrays;

public class Count012 {
    //Also Known as Dutch National Flag Problem
    public static void main(String[] args) {
        int i, c0=0 , c1=0 , c2=0;
        int[] arr = {0 , 1, 2, 1, 1, 1, 0, 2};
        
        for (i = 0; i < arr.length; i++) {
            switch(arr[i]){
                case 0:
                    c0++;
                    break;
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;        
            }
        }
        i =0; 
        while(c0>0){
            arr[i++]= 0;
            c0--;
        }

        while(c1>0){
            arr[i++] = 1;
            c1--;
        }

        while(c2>0){
            arr[i++] = 2;
            c2--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
