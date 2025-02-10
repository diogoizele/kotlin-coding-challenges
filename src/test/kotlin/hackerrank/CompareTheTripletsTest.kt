package hackerrank

import com.diogoizele.hackerrank.compareTriplets
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class CompareTheTripletsTest {
    @Test
    fun `must tie the score between 'a' and 'b'`() {
        val a = arrayOf(1, 2, 3)
        val b = arrayOf(3, 2, 1)
        val expected = arrayOf(1, 1)

        val result = compareTriplets(a, b)

        assertContentEquals(expected, result)
    }


    @Test
    fun `'a' must have the higher score`() {
        val a = arrayOf(17, 28, 30)
        val b = arrayOf(99, 16, 8)
        val expected = arrayOf(2, 1)

        val result = compareTriplets(a, b)

        assertContentEquals(expected, result)
    }

    @Test
    fun `'b' must have the higher score`() {
        val a = arrayOf(17, 28, 30)
        val b = arrayOf(99, 30, 80)
        val expected = arrayOf(0, 3)

        val result = compareTriplets(a, b)

        assertContentEquals(expected, result)
    }

    @Test
    fun `must return an array with zeros if the input sizes are different`() {
        val a = arrayOf(17, 28, 30)
        val b = arrayOf<Int>()
        val expected = arrayOf(0, 0)

        val result = compareTriplets(a, b)

        assertContentEquals(expected, result)

    }
}
