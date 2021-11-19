package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void testIsPalindrome () {
        Palindrome p = new Palindrome();
        assertTrue(p.isPalindrome("mellem"));
        assertTrue(p.isPalindrome("aba"));
        assertTrue(p.isPalindrome("abba"));
        assertTrue(p.isPalindrome("tűlevelűt"));
        assertTrue(p.isPalindrome(""));
        assertTrue(p.isPalindrome("a"));
        assertFalse(p.isPalindrome("tűlevelűti"));
    }

}