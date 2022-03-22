package scala.u04lab

import org.junit.Assert.assertEquals
import org.junit.Test
import u04lab.code.List

class ListTest {

  import List.*

  @Test def testCreation(): Unit =
    val l: List[Int] = List(1, 2, 3, 4)
    assertEquals(l, Cons(1, Cons(2, Cons(3, Cons(4, Nil())))))
    assertEquals(Nil(), List())

}
