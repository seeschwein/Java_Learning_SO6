import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
    @Test
    void fiftyNineReturnF(){
        var grader = new Grader(); // new object called grader
        assertEquals('F', grader.graderConverter(59));
    }
    @Test
    void sixtyNineReturnD(){
        var grader = new Grader(); // new object called grader
        assertEquals('D', grader.graderConverter(69));
    }
    @Test
    void seventyeightReturnC(){
        var grader = new Grader(); // new object called grader
        assertEquals('J', grader.graderConverter(78));
    }
    @Test
    void eightyNineReturnB(){
        var grader = new Grader(); // new object called grader
        assertEquals('B', grader.graderConverter(89));
    }
    @Test
    void ninetyoneReturnA(){
        var grader = new Grader(); // new object called grader
        assertEquals('A', grader.graderConverter(91));
    }
}
