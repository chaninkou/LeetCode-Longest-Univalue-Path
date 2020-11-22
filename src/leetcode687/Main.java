package leetcode687;


public class Main {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.right = new TreeNode(5);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(5);
		
		FindLongestPath solution = new FindLongestPath();
		
		System.out.println("Solution: " + solution.longestUnivaluePath(root));
	}
}
