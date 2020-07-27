/**
 * Check if tree is binary search tree
 */

fun main() {
    val root: BinaryTreeNode =  BinaryTreeNode(2)
    root.childLeft = BinaryTreeNode(1)
    root.childRight = BinaryTreeNode(3)
    root.printTree()
    println("Search tree? " + isBalanced(root, null, null).toString())
}

fun isBalanced(node: BinaryTreeNode?, min: Int?, max: Int?): Boolean {
    if (node == null)
        return true
    if (min != null && node.data < min.toInt() || max != null && node.data > max.toInt())
        return false
    if (!isBalanced(node.childLeft, min, node.data) || !isBalanced(node.childRight, node.data, max))
        return false
    return true
}