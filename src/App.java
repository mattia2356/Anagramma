import java.util.*;
public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------");
        System.out.println("| ANAGRAMMA |");
        System.out.println("-------------\n");

        Anagramma a = new Anagramma();

        System.out.println("| INSERIRE LA PAROLA DA ANAGRAMMARE |");
        a.anagramma("", sc.next());
    }
}