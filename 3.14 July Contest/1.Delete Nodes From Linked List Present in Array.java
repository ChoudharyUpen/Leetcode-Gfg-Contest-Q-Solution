//Weekly Contest 406
//this is the final 3rd attempt that is passing all test cases
//rest 2 learning attempt are downside of it in the form of comment


class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        if (head == null || nums == null || nums.length == 0) {
            return head;
        }

        // nums ko Set mein convert karte hain O(1) lookup time ke liye
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        // Pointers initialize karte hain
        ListNode dummy = new ListNode(0); // Dummy node edge cases handle karne ke liye
        dummy.next = head;
        ListNode current = head;
        ListNode prev = dummy;

        // Traverse karte hain aur nodes ko remove karte hain
        while (current != null) {
            if (numSet.contains(current.val)) {
                prev.next = current.next; // Current node ko skip karte hain
            } else {
                prev = current; // prev ko current node par move karte hain
            }
            current = current.next; // Next node par move karte hain
        }

        return dummy.next; // Naya head return karte hain, dummy node ko skip karke
    }
}





// class Solution   
// {
//     public ListNode List(int[] nums, ListNode head ,ListNode temp,ListNode curr,int 
//                          len,int a) {
//         if( head.val ==null || head.next ==null){
//              return head;
//         }
//         if(temp==null){
//             return;
//         }
//         while(temp!=null && a < len) 
//        {
//         if(nums[a] ==curr.val)
//         {
//             if(curr.val==head.val)
//             {
//              curr=curr.next;
//             head =curr;
//             }
//             else
//             {
//                 curr=curr.next;
//                 head.next=curr;
//             }
//         }
//         else
//         {
//               curr=curr.next;
//         }
//            temp=temp.next;
           
        
//        }
//          return List( nums,  head , temp,curr, len, a+1);
        
//     }
   
//     public ListNode modifiedList(int[] nums, ListNode head) 
//     {
//         // int len=nums.length;
//        ListNode curr=head;
//          ListNode temp=head;
       
       
//       List( nums,  head , temp,curr, nums.length, 0);
//        return head;
//     }
// }
    
// class Solution {

//     private ListNode deleteNodes(ListNode head, int[] nums, int len, int index) {
//         if (head == null || index >= len) {
//             return head;
//         }
        
//         ListNode curr = head;
//         ListNode prev = null;
        
//         while (curr != null && index < len) {
//             if (curr.val == nums[index]) {
//                 if (prev == null) {
//                     head = curr.next;
//                 } else {
//                     prev.next = curr.next;
//                 }
//                 curr = curr.next;
//             } else {
//                 prev = curr;
//                 curr = curr.next;
//             }
//             index++;
//         }
        
//         return deleteNodes(head, nums, len, index);
//     }
    
//     public ListNode modifiedList(int[] nums, ListNode head) {
//         if (head == null || nums == null || nums.length == 0) {
//             return head;
//         }
        
//         return deleteNodes(head, nums, nums.length, 0);
//     }
// }
