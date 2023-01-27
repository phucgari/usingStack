import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsingStackTest {
    UsingStack manager=new UsingStack();
    String wordToUse="abcd";
    @Test
    void testConstructor(){
    }
    @Test
    void testPushAndPop(){
        manager.pushWord(wordToUse);
        assertEquals('d',manager.takeLetter());
        assertEquals('c',manager.takeLetter());
        assertEquals('b',manager.takeLetter());
        assertEquals('a',manager.takeLetter());
    }
    @Test
    void testPopThenGiveToWord(){
        manager.pushWord(wordToUse);
        String newWord="";
        int size=manager.size();
        for (int i = 0; i < size; i++) {
            newWord+=manager.takeLetter();
        }
        assertEquals("dcba",newWord);
    }
}