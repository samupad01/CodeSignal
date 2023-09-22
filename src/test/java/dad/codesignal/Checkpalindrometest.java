package dad.codesignal;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Checkpalindrometest {
	private Checkpalindrome checkpalindrome;

    @Before
    public void setup() {
        checkpalindrome = new Checkpalindrome();
    }

    @Test
    public void test1() {
        assertTrue(checkpalindrome.solution("aabaa"));
    }

    @Test
    public void test2() {
        assertTrue(checkpalindrome.solution("abac"));
    }

    @Test
    public void test3() {
        assertTrue(checkpalindrome.solution("a"));
    }

    @Test
    public void test4() {
        assertTrue(checkpalindrome.solution("az"));
    }

    @Test
    public void test5() {
        assertTrue(checkpalindrome.solution("abacaba"));
    }

    @Test
    public void test6() {
        assertTrue(checkpalindrome.solution("z"));
    }


}
