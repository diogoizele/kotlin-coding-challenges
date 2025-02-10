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

    var aScore = 0
    var bScore = 0

    for (i in a.indices) {
        val aElement = a[i]
        val bElement = b[i]

        if (aElement == bElement) {
            continue
        } else if (aElement > bElement) {
            aScore++
        } else {
            bScore++
        }
    }

    return arrayOf(aScore, bScore)
}