// Task 6.3: unit tests for grade()

import kotlin.test.Test
import kotlin.test.assertEquals

class GradeTest {
    @Test
    fun `Mark of 55 gives a pass`(){
        assertEquals("Pass", grade(55))
    }

    @Test
    fun `Mark of 20 gives fail`(){
        assertEquals("Fail", grade(20))
    }

    @Test
    fun `Mark of 80 gives distinction`(){
        assertEquals("Distinction", grade(80))
    }

    @Test
    fun `Mark of -10 gives ?`(){
        assertEquals("?", grade(-10))
    }

    @Test
    fun `Mark of 120 gives ?`(){
        assertEquals("?", grade(120))
    }

    @Test
    fun `Mark of 0 gives fail`(){
        assertEquals("Fail", grade(0))
    }

    @Test
    fun `Mark of 1 gives fail`(){
        assertEquals("Fail", grade(1))
    }

    @Test
    fun `Mark of 39 gives fail`(){
        assertEquals("Fail", grade(39))
    }

    @Test
    fun `Mark of 40 gives pass`(){
        assertEquals("Pass", grade(40))
    }

    @Test
    fun `Mark of 69 gives pass`(){
        assertEquals("Pass", grade(69))
    }

    @Test
    fun `Mark of 70 gives Distinction`(){
        assertEquals("Distinction", grade(70))
    }

    @Test
    fun `Mark of 100 gives distinction`(){
        assertEquals("Distinction", grade(100))
    }

    @Test
    fun `Mark of 101 gives ?`(){
        assertEquals("?", grade(101))
    }

}
