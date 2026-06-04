import java.util.*;

class reversearray
 {
    public static void main(String[] args)
    {
        int [] arr= {1,2,3,4,5,6,7};
        int x= 9; 
        int l= 0;
        int r= arr.length-1;
        while(l<r)
        {
            if (arr[l]+arr[r]==x)
            {
                System.out.print(l + " and ");
                System.out.print(r);
                break;
            }
            else if (arr[l]+arr[r]>x)
            {
                r--;
            }
            else if(arr[l]+arr[r]<x)
            {
                l++;
            }
         
        }
    }
    
 }