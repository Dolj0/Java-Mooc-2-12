
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;
    private Random random;
    
    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
        this.random = new Random();
        
        
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        this.random = new Random();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        for (int i = 0; i<7;i++){
            int j = random.nextInt(40)+1;
            if (containsNumber(j)){
               i--;
            } else {
                this.numbers.add(j);
            }
        }
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        if (numbers.contains(number)){
            return true;
        }
        return false;
    }
}

