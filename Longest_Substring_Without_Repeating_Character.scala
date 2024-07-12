object Solution {
    def lengthOfLongestSubstring(s: String): Int = {
        var prevPos: Map[Char, Int] = Map() //= ('a' to 'z').map(ch => ch -> -1).toMap
        var maks: Int = 0
        var start: Int = 0
        for (i <- 0 to s.length - 1) {
            val c = s(i)
            if (prevPos.contains(c) && prevPos(c) >= start) {
                if (i - start > maks) maks = i - start
                start = prevPos(c) + 1
            }
            prevPos = prevPos.updated(c, i)
        }
        if (s.length - start > maks) maks = s.length - start
        maks
    }
}