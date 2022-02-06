class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode currentNode = head;
        while (currentNode != null && currentNode.next != null) {
            if (currentNode.val == currentNode.next.val)
                currentNode.next = currentNode.next.next;
            else
                currentNode = currentNode.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode tail = new ListNode(3);
        ListNode node3 = new ListNode(3, tail);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode head = new ListNode(1, node1);

        System.out.println(solution.deleteDuplicates(head));
    }
}