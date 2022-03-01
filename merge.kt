class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int):Unit {
        var p1 = m - 1
        var p2 = n - 1
        var tail = m + n - 1
        var cur: Int
        while (p1 >= 0 || p2 >= 0) {
            cur = when {
                p1 == -1 -> {
                    nums2[p2--]
                }
                p2 == -1 -> {
                    nums1[p1--]
                }
                nums1[p1] > nums2[p2] -> {
                    nums1[p1--]
                }
                else -> {
                    nums2[p2--]
                }
            }
            /*
            cur = if (p1 == -1) {
                nums2[p2--]
            } else if (p2 == -1) {
                nums1[p1--]
            } else if (nums1[p1] > nums2[p2]) {
                nums1[p1--]
            } else {
                nums2[p2--]
            }
            */
            nums1[tail--] = cur
        }
    }
}
