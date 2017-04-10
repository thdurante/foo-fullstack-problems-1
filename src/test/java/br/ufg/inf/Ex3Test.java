package br.ufg.inf;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Ex3Test {

    private Ex3 ex;

    @Before
    public void setUp() {
        this.ex = new Ex3();
    }

    @Test
    public void operation() {
        assertNull(this.ex.operation(0.0, 0.0, "nothing"));
        assertNull(this.ex.operation(10.0, 0.0, "/"));

        assertEquals((Double) 5.0, this.ex.operation(1.0, 4.0, "+"));
        assertEquals((Double) 2.0, this.ex.operation(4.0, 2.0, "-"));
        assertEquals((Double) 6.0, this.ex.operation(2.0, 3.0, "*"));
        assertEquals((Double) 3.0, this.ex.operation(18.0, 6.0, "/"));
    }
}
