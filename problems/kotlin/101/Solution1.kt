/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun isSymmetric(root: TreeNode?): Boolean {
        if (root == null) return false
        if (root.left == null && root.right == null) return true
        val nodesToVisitLeft = Stack<TreeNode?>().apply { push(root.left) }
        val nodesToVisitRight = Stack<TreeNode?>().apply { push(root.right) }
        while (
            nodesToVisitLeft.isNotEmpty() && 
            nodesToVisitRight.isNotEmpty()
        ) {
            val headLeft = nodesToVisitLeft.pop()
            val headRight = nodesToVisitRight.pop()
            if (headLeft?.`val` != headRight?.`val`) return false
            headLeft?.apply {
                nodesToVisitLeft.push(right)
                nodesToVisitLeft.push(left)
            }
            headRight?.apply {
                nodesToVisitRight.push(left)
                nodesToVisitRight.push(right)
            }
        }
        return true
    }
}