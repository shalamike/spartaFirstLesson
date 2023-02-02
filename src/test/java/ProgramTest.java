import org.example.Program;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ProgramTest {


    @Test
    @DisplayName("My first test")
    public void fistTest(){
        Assertions.assertTrue(5==4);
    }

    @Test
    @DisplayName("given morning greeting")
    public void GivenMorningTime(){
        int time = 12;
        String greeting = Program.greeting(time);
        String result = "good morning";
        Assertions.assertEquals(greeting,result);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 8, 12})
    @DisplayName("given a time between 5 and 12, the greeting should remain morning")
    public void GivenTimeBetween5And12_ReturnGoodMorning(int time){
        String expected = "good morning";
        String result = Program.greeting(time);
        Assertions.assertEquals(expected,result);
    }

    @ParameterizedTest
    @ValueSource(ints = {13, 15, 18})
    @DisplayName("given a time between 5 and 12, the greeting should remain good afternoon")
    public void GivenTimeBetween13And18_ReturnGoodEvening(int time){
        String expected = "good afternoon";
        String result = Program.greeting(time);
        Assertions.assertEquals(expected,result);
    }


}
