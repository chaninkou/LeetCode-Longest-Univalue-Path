package leetcode687;

public class FindLongestPath {
	public int longestUnivaluePath(TreeNode root) {
		// Using an object to keep track throughout the stack
        int[] res = new int[1];
        
        if (root != null){
            dfs(root, res);
        }
        
        return res[0];
    }

    private int dfs(TreeNode node, int[] res) {
    	// Check all the left side
        int left = node.left != null ? dfs(node.left, res) : 0;
        
        // Check all the right side
        int right = node.right != null ? dfs(node.right, res) : 0;
        
        
        int resLeft = node.left != null && node.left.val == node.val ? left + 1 : 0;
        
        int resRight = node.right != null && node.right.val == node.val ? right + 1 : 0;
        
        res[0] = Math.max(res[0], resLeft + resRight);
        
        return Math.max(resLeft, resRight);
    }
}
