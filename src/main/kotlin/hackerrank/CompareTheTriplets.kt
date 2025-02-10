/**
 * Prepare > Algorithms > Warmup
 */

package com.diogoizele.hackerrank

/*
 * Complete the 'compareTriplets' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {

    if (a.size != b.size) {
        return arrayOf(0, 0)
    }

    return a.foldIndexed(mutableListOf(0 , 0)) { index, accumulator, element ->
        if (element > b[index]) {
            accumulator[0]++
        } else if (element < b[index]) {
            accumulator[1]++
        }
        accumulator
    }.toTypedArray()
}