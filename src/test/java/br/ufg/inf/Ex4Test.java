package br.ufg.inf;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Ex4Test {

    private Ex4 ex;

    @Before
    public void setUp() {
        this.ex = new Ex4();
    }

    @Test
    public void imc() {
        assertNull(this.ex.imc(5.0, 0.0));
        assertEquals((Double) 24.027490670890494, this.ex.imc(1.93, 89.5));
    }
}
