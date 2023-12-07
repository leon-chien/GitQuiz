import java.util.Scanner;

public class Main
{
    public static void main (String[]args)
    {/* 
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        int space = line.indexOf(" ");
        int c = Integer.parseInt(line.substring(0,space));
        int d = Integer.parseInt(line.substring(space+1,line.length()));
        */

    Adder adder = (int a, int b ) -> 
    {
        int sum = 0; 
        for(int i = a; i <= b; i++)
        {
            sum+=i;
        }
        return sum;
    };
    int sum = adder.add(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
    System.out.println(sum);
    }
}