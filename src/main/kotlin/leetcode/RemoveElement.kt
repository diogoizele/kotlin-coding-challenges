package com.diogoizele.leetcode

class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var count = 0

        for (i in nums.indices) {
            val element = nums[i]

            if (element == `val`) {
                for (j in i + 1 until nums.size) {
                    if (nums[j] != element) {
                        nums[i] = nums[j]
                        nums[j] = element
                        count++
                        break
                    }
                }
            } else {
                count++
            }
        }

        return count
    }
}