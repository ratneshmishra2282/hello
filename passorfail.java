
import java.util.*;
import java.io.*;
class passorfail
{
    public static void main ()
    {
        Scanner sc = new Scanner(System.in);
        int mark= sc.nextInt();
        if (mark>=50)
        {
            System.out.print("pass");           
        }
        else
        {
            System.out.print("fail");
        }
    }
}
