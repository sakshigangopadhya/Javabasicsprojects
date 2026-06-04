import java.util.*;

class Runningsum {
    public static void main(String[] args){
        int [] arr= { 1,2,3,4,5}; 
        int [] brr= new int[arr.length];
        int a= 0;
        for(int i=0; i<arr.length; i++){
          a = arr[i]+ a;
          brr[i]= a;
          
        }
        System.out.println(Arrays.toString(brr));

    }
}