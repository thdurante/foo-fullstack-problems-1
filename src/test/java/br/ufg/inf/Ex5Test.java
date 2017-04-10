package br.ufg.inf;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Ex5Test {

    private Ex5 ex;

    @Before
    public void setUp() {
        this.ex = new Ex5();
    }

    @Test
    public void territorialTax() {
        assertEquals((Double) 566.934, this.ex.territorialTax(120.93, 89.5));
    }
}
