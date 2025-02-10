import com.diogoizele.leetcode.Solution

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class RemoveElementTest {

    @Test
    fun case1() {
        val expectedArray = listOf(2, 2, 3, 3).toIntArray()
        val expectedReturn = 2

        val argument = listOf(3, 2, 2, 3).toIntArray()
        val result = Solution().removeElement(argument, 3)

        assertContentEquals(expectedArray, argument)
        assertEquals(expectedReturn, result)
    }


    @Test
    fun case2() {

        val expectedArray = listOf(0, 1, 3, 0, 4, 2, 2, 2).toIntArray()
        val expectedReturn = 5

        val argument = listOf(0, 1, 2, 2, 3, 0, 4, 2).toIntArray()
        val result = Solution().removeElement(argument, 2)

        assertContentEquals(expectedArray, argument)
        assertEquals(expectedReturn, result)
    }
}