/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
    def addTwoNumbers(l1: ListNode, l2: ListNode, i: Int): ListNode = {
        if (l1 == null && l2 == null && i == 0) return null
        val x1:Int = if (l1 != null) l1.x else 0
        val x2:Int = if (l2 != null) l2.x else 0
        val ll1 = if (l1 != null) l1.next else null
        val ll2 = if (l2 != null) l2.next else null
        //if(ll1 == null && ll2 == null && i == 0) return null
        return ListNode(
            (x1 + x2 + i) % 10,
            addTwoNumbers(ll1, ll2, (x1 + x2 + i)/10)
        )
        
    } 
    def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
        return  addTwoNumbers(l1, l2, 0)   
    }
}
