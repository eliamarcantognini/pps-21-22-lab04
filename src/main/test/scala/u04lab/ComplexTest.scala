package scala.u04lab

import org.junit.Assert.assertEquals
import org.junit.Test
import u04lab.code.Complex

class ComplexTest:

  import Complex.*

  @Test def checkEquals(): Unit =
    val c1 = Complex(10.0, 3.0)
    val c2 = Complex(10.0, 3.0)
    assertEquals(c1, c2)

  @Test def checkToString(): Unit =
    val c = Complex(10.0, 3.0)
    assertEquals(c.toString, "ComplexImpl(10.0,3.0)")