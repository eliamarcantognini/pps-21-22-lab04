package scala.u04lab

import org.junit.Assert.assertEquals
import org.junit.Test
import u04lab.code.{Course, Student, sameTeacher, List}

class TeacherTest:

  @Test def sameTeacherTest(): Unit =
    val cPPS = Course("PPS", "Viroli")
    val cOOP = Course("OOP", "Viroli")
    val c = List(cPPS, cOOP)
    c match
      case sameTeacher(t) =>
        assertEquals("Viroli", t)
      case _ => 

  @Test def sameTeacherTestEmpty(): Unit =
    val cPCD = Course("PCD", "Ricci")
    val cCS = Course("CS", "D'Angelo")
    val c = List(cPCD, cCS)
    c match
      case sameTeacher(t) => assertEquals(scala.Option.empty, t)
      case _ =>

