package Week3;

import org.w3c.dom.NodeList;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import javax.swing.text.TabExpander;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class FunWithTrees_Lists {
    private static ArrayList<Integer> setOut = new ArrayList<>();


    public static ListNode append(ListNode append, int next) {
        return append;
    }



    public static ListNode flatten(TreeNode root) {

        List<Integer> data = (treeParser(root));
        data = data.stream().sorted().distinct().collect(Collectors.toList());
        //flatMapToInt(r -> IntStream.of(r))

        ListNode li = new ListNode();
        for (Integer datum : data) {
            li = append(li,datum);
        }
        return li;
    }

        private static List treeParser(TreeNode root) {

            try {
                flatten(root.right);
                flatten(root.left);

                setOut.add(root.value.data);
                setOut.add(root.value.next.data);
                setOut.add(root.left.value.data);
                setOut.add(root.right.value.data);
            } catch (NullPointerException e) {
            }
        return setOut;
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

        ListNode(){};

        ListNode(int data) {
            this(data, null);
        }
    }
}