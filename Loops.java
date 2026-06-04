//Take input from user and add into array and give sum
import java.util.*;

class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("give the size of the array");
        int n= sc.nextInt();
        int []arr= new int[n];
        int a= 0;
        for(int i=0; i<n; i++)
        {
            System.out.println("Give numbers:");
            arr[i]= sc.nextInt();
            a += arr[i];
        }
        System.out.println(a);

    }

}
