package AnagramChecker;

import org.example.AnagramChecker;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramCheckerTest {

    @Test
    public void testAnagramSucess(){

    String str1 = "spring";
    String str2 = "prings";

    assertTrue(AnagramChecker.areAnagrams(str1,str2));
}

    @Test
    public void testAnagramFailure(){

        String str1 = "java";
        String str2 = "kotlin";

        assertFalse(AnagramChecker.areAnagrams(str1,str2));
    }

    @Test
    public void testAnagramWithDifferentLength(){

        String str1 = "hello world";
        String str2 = "world";

        assertFalse(AnagramChecker.areAnagrams(str1,str2));
    }

    @Test
    public void testAreAnagramEmptyStrings() {
        String str1 = "";
        String str2 = "";

        assertTrue(AnagramChecker.areAnagrams(str1, str2));
    }

    @Test
    public void testAreAnagramWhitespaceStrings() {
        String str1 = "  ";
        String str2 = " ";

        assertTrue(AnagramChecker.areAnagrams(str1, str2));
    }
}
