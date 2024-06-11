package teste;
import application.Grader;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Teste {

    @Test

   void fiftyNineShouldReturnA() {
        var grader = new Grader();
        assertEquals('A', grader.determineLetterGrade(59));
    }
    @Test
        void fiftyNineShouldReturnB() {
            var grader = new Grader();
            assertEquals('B', grader.determineLetterGrade(69));
        }
        @Test
            void fiftyNineShouldReturnC() {
            var grader = new Grader();
            assertEquals('C', grader.determineLetterGrade(79));
        }
@Test
                void fiftyNineShouldReturnD() {
            var grader = new Grader();
            assertEquals('D', grader.determineLetterGrade(91));
        }
    }
