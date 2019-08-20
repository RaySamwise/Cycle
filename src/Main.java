import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Билеты через for:");
        for (int i = 200000 ; i <= 235000 ; i++)
        {
             if (i <=210000 || i >= 220000)
             System.out.println(i);
         }
        System.out.println("Билеты через while:");
        System.out.println("Нажмите любую клавижу для продолжения:");
        Scanner sc  = new Scanner(System.in);
        char character = sc.next().charAt(0);
        int j = 200000;
        while (j <= 235000)
        {
           if (j <=210000 || j >= 220000)
                System.out.println(j);
           j++;
        }
    }
}
