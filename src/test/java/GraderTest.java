import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class GraderTest {
   Grader grader = new Grader();

    @Test
     void fiftyNineShouldBeGraded (){
       assertEquals('f', grader.determineLetterGrade(59));
    }

    @Test
    void sixtyFiveShouldBeGraded () {
        assertEquals('D', grader.determineLetterGrade(65));
    }
    @Test
    void seventyShouldReturn( ){
        assertEquals('C', grader.determineLetterGrade(70));
    }

    @Test
    void eightyOneShouldReturn () {
        assertTrue(grader.determineLetterGrade(81) == 'B');
    }

    @Test
    void ninetyShouldReturn (){
        assertTrue(grader.determineLetterGrade(90) == 'A');
    }

//    @Test
//    void zeroShouldReturnError(){
//        assertTrue(grader.determineLetterGrade(0)== throw new IllegalArgumentException);
//    }



    @Test
    void seventyShouldReturnB(){
        assertTrue(grader.determineLetterGrade(70) == 'C');
    }

    @Test
    void sixtyShouldReturnF(){
        assertTrue(grader.determineLetterGrade(60) == 'D');
    }

    @Test
    void zeroShouldReturnF(){
        assertEquals('f', grader.determineLetterGrade(0));
    }
@Test
    void negativeOneShouldReturnIllegalArgumentsException(){
        assertThrows(IllegalArgumentException.class, ()->{
           grader.determineLetterGrade(-1);
        });
}
}
