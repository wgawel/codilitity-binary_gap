package pl.gawly;

import org.junit.*;

public class SolutionTest {

    Solution s = new Solution();

    @Test
    public void number9() {
        Assert.assertEquals(2, s.solution(9));
    }

    @Test
    public void number529() {
        Assert.assertEquals(4, s.solution(529));
    }

    @Test
    public void number20() {
        Assert.assertEquals(1, s.solution(20));
    }

    @Test
    public void number15() {
        Assert.assertEquals(0, s.solution(15));
    }

    @Test
    public void number1041() {
        Assert.assertEquals(5, s.solution(1041));
    }

    @Test
    public void numberMax1() {
        Assert.assertNotNull(s.solution(2147483647));
    }

    @Test
    public void numberMin() {
        Assert.assertEquals(0, s.solution(1));
    }

}
