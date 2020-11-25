
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random luck = new Random();
        System.out.println("How many random numbers should be printed?");
        int i = Integer.valueOf(scanner.nextLine());
        
        for (int f =0;f<i;f++){
            int randomNum = luck.nextInt(11);
            System.out.println(randomNum);
        }
            
    }

}
