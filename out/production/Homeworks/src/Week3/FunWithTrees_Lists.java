package Week3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;


public class FunWithTrees_Lists {


    public static ListNode flatten(TreeNode root) {


        Set<Integer> tempArray = new HashSet<>();
        ArrayList<Integer> tempArray2 = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();

            try {

                tempArray.add(node.value.data);
                tempArray.add(node.value.next.data);
                //System.out.println(node.value.data) ;
                //System.out.println(node.value.next.data);

            } catch (NullPointerException e) {
                //System.out.println("main");
            }


            if (root == null) continue;
            try {
                stack.push(node.left);
            } catch (NullPointerException e) {
                //System.out.println("left");
            }
            try {
                stack.push(node.right);
            } catch (NullPointerException e) {
                //System.out.println("right");
            }

        }

        tempArray2.addAll(tempArray);
        tempArray2.sort(Integer::compareTo);
        //System.out.println(tempArray2.toString());




        for (int i = 1; i <tempArray2.size() ; i++) {
          ListNode ret = new ListNode(tempArray2.get(i));


        }



        return null;
    }

     static class TreeNode {
        public TreeNode left;
        public TreeNode right;
        public ListNode value;

        TreeNode(ListNode value, TreeNode left, TreeNode right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        TreeNode(ListNode value) {
            this(value, null, null);
        }
    }

     static class  ListNode {
        public int data;
        public ListNode next;

        ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }

        ListNode(int data) {
            this(data, null);
        }


    }
}