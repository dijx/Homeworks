package Week3;

import static Week3.FunWithTrees_Lists.*;
import  Week3.FunWithTrees_Lists.ListNode;
import  Week3.FunWithTrees_Lists.TreeNode;

public class Tester {


    public static void main(String [] Args) {
        ListNode l1 = new ListNode(17, new ListNode(1));
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(16);
        ListNode l6 = new ListNode(7, new ListNode(3));
        TreeNode root = new TreeNode(l1, new TreeNode(l2, new TreeNode(l4), null), new TreeNode(l3, new TreeNode(l5), new TreeNode(l6)));


        System.out.println(root.value.next.data);


        flatten(root);

    }


}
