import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StandardInOutTest {

    private StandardInOut standardInOut = new StandardInOut();

    @Test
    void reverseWords() {
        assertEquals("name? your is What", standardInOut.reverseWords("What is your name?"));
    }

    @Test
    void reverseWords_more() {
        assertEquals("Britain Great of capital the is London", standardInOut.reverseWords("London is the capital of Great  Britain"));
    }

    @Test
    void reverseWordsCharacters() {
        assertEquals("?eman ruoy si tahW", standardInOut.reverseWordsCharacters("What is your name?"));
    }

    @Test
    void reverseWordsAndCharacters() {
        assertEquals("?eman ruoy si tahW", standardInOut.reverseWordsCharacters("What is your name?"));
    }

    @Test
    void reverseWordsAndCharactersWithWhitespace() {
        assertEquals("?eman ruoy si tahW", standardInOut.reverseWordsAndCharactersShort("What  is your name?"));
    }
}