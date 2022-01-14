class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode headNode = new ListNode();
        ListNode currentNode = headNode;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                currentNode.next = list1;
                list1 = list1.next;
            } else {
                currentNode.next = list2;
                list2 = list2.next;
            }
            currentNode = currentNode.next;
        }

        if (list1 == null) {
            currentNode.next = list2;
        } else {
            currentNode.next = list1;
        }
        return headNode.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode node13 = new ListNode(4);
        ListNode node12 = new ListNode(2, node13);
        ListNode node11 = new ListNode(1, node12);

        ListNode node23 = new ListNode(4);
        ListNode node22 = new ListNode(3, node23);
        ListNode node21 = new ListNode(1, node22);

        System.out.println(solution.mergeTwoLists(node11, node21));
    }
}