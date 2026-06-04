import java.util.*;

class merging
 {
    public static void main(String[] args)
    {
        int [] nums1= {1,2,3,0,0,0};
        int [] nums2= {4,5,6};
        int m = nums1.length;
        int n = nums2.length;
        
        for(int i= 0; i<m;i++ )
        {
            nums3[i] = nums1[i];
        }
        for(int j=0; j<n; j++)
        {
            nums3[m+j]=nums2[j];
        }
        System.out.println(Arrays.toString(nums3));
    }
 }