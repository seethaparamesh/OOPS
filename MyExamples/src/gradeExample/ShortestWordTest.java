package gradeExample;

import org.junit.Test;

import junit.framework.TestCase;

public class ShortestWordTest<ShortestWordTest> extends TestCase {
	@Test
    public void findShort() throws Exception {
        assertEquals(3, ShortestWord.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, ShortestWord.findShort("turns out random test cases are easier than writing out basic ones"));
        assertEquals(4, ShortestWord.findShort("turns  random test cases  easier than writing  basic ones"));
        assertEquals(6, ShortestWord.findShort("  random easier  writing "));
    }
}



