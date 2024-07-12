object Solution {
    def remleadingwhitespaces (s: String): String = {
        var i = 0
        while (i < s.length && s(i) == ' ') {
            i += 1
        }
        return s.substring(i)
    }
    def remzeros (s: String): String = {
        var i = 0
        while (i < s.length && s(i) == '0') {
            i += 1
        }
        return s.substring(i)
    }
    def remsuf (s: String): String = {
        var i = 0
        while (i < s.length && s(i).isDigit) {
            i += 1
        }
        return s.substring(0,i)
    }
    def strcmp (s1: String, s2: String): Boolean = {
        if (s1.length < s2.length) {
            return true
        } else if (s1.length > s2.length) {
            return false
        } 
        var i = 0
        while (i < s1.length) {
            if (s1(i) < s2(i)) {
                return true
            } else if (s1(i) > s2(i)) {
                return false
            }
            i += 1
        }
        return true
    }
    def myAtoi (s: String): Int = {
        var s1 = remleadingwhitespaces(s)
        if (s1.length == 0) {
            return 0
        }
        var sign = 1
        if (s1(0) == '-') {
            sign = -1
            s1 = s1.substring(1)
        } else if (s1(0) == '+') {
            s1 = s1.substring(1)
        } else if (!s1(0).isDigit) {
            return 0
        }
        s1 = remzeros(s1)
        //println(s1)
        if (s1.length == 0) {
            return 0
        }
        //println(s1)
        s1 = remsuf(s1)
        if (s1.length == 0) {
            return 0
        }
        //println(s1)
        if (sign == 1) {
            if (strcmp("2147483647",s1)) {
                return 2147483647
            }
        } else {
            if (strcmp("2147483648",s1)) {
                return -2147483648
            }
        }
        return s1.toInt * sign
    }
}