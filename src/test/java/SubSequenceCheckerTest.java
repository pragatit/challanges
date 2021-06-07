import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SubSequenceCheckerTest {

    SubSequenceChecker subSequenceChecker = new SubSequenceChecker();

    @Test
    public void shouldReturnPositive(){
        boolean impacted =
                subSequenceChecker.checkImpact("coronavirus","crnas");
        assertTrue(impacted);
    }

    @Test
    public void shouldReturnPositive1(){
        boolean impacted =
                subSequenceChecker.checkImpact("coronavirus","onarous");
        assertFalse(impacted);
    }

    @Test
    public void shouldReturnNegative(){
        boolean impacted =
                subSequenceChecker.checkImpact("coronavirus","abcde");
        assertFalse(impacted);
    }
}