Certainly! Floyd’s cycle detection algorithm, also known as the Tortoise and Hare algorithm, is used to detect cycles in linked lists efficiently using two pointers. Here’s the Java implementation:
1. Two pointers: slow moves one step at a time, while fast moves two steps.
2. Cycle Detection: If they meet, a cycle exists. If fast reaches null, there's no cycle.
3. Time Complexity: O(n) (since at worst both pointers traverse the linked list).
4. Space Complexity: O(1) (since no extra space is used).
  
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class FloydCycleDetection {
    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;
        
        ListNode slow = head, fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;       // Move slow by one step
            fast = fast.next.next;  // Move fast by two steps
            
            if (slow == fast) {
                return true;  // Cycle detected
            }
        }
        
        return false;  // No cycle
    }
}
