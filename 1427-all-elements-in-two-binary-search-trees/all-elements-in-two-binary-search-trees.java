/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;
class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        inOrder(arr1,root1);
        ArrayList<Integer> arr2 = new ArrayList<>();
        inOrder(arr2,root2);

        ArrayList<Integer> list = new ArrayList<>();
        int p1=0,p2=0;

        while(p1 < arr1.size() && p2 < arr2.size()){
            if(arr1.get(p1) < arr2.get(p2)){
                list.add(arr1.get(p1));
                p1++;
            }else{
                list.add(arr2.get(p2));
                p2++;
            }
        }

        while(p1 < arr1.size()){
            list.add(arr1.get(p1));
            p1++;
        }

        while(p2 < arr2.size()){
            list.add(arr2.get(p2));
            p2++;
        }
        return list;
    }

    public void inOrder(ArrayList<Integer> arr, TreeNode root){
        if(root == null){
            return;
        }
        inOrder(arr,root.left);
        arr.add(root.val);
        inOrder(arr,root.right);
    }
}