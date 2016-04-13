package tdd.kata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StringSetTest {

    @Test
    public void getSizeTest() {

        StringSet set = new StringSet();

        assertThat(set.size(), is(0));
    }
}
