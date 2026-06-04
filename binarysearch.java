import java.util.*;

class binarysearch
 {
    public static void main(String[] args)
    {
        int l = 0;
        int [] arr={1,2,3,4,5,6,7,8,9,10,12,13,14};
        int target= 8;
        int r= arr.length;
        int n= r-1;
        while(true)
        {
            int mid = (r+l)/2;
            if(arr[mid] == target)
            {
                System.out.println(mid);
                break;
            }
            else if(arr[mid] < target )
            {
                l=mid;
            }
            else if(arr[mid]>target)
            {
                r=mid;
            }
        }
    }
 }
 