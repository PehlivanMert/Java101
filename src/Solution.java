import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Rakam Giriniz: ");
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {


                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                if(x>=-32768 && x<=32767)System.out.println("* short");}


        }
    }




