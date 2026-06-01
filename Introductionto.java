import java.util.*;
class Introductionto
{ 
    public static void main (String[]args)
    {
      Scanner sc= new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      String c = sc.next();

      if (c.charAt(0) == '+') {
        System.out.println(a+b);
      }
      else if (c.charAt(0 )== '-') {
        System.out.println(a-b);
      }
      else if (c.charAt(0) == '*') {
        System.out.println(a*b);
      }
            }
    }
            
    
           
    
