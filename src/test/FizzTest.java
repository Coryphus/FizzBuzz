import org.example.Main;
import org.junit.Assert;
import org.junit.Test;


public class FizzTest {
    @Test
    public void FizzTestTo5(){
        String[] expectedOutput = {"1", "2", "Fizz", "4", "Buzz"};

        Assert.assertArrayEquals(expectedOutput, Main.fizzBuzz(5));

    }

    @Test
    public void FizzTestTo8(){
        String[] expectedOutput = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8"};

        Assert.assertArrayEquals(expectedOutput, Main.fizzBuzz(8));

    }
}
