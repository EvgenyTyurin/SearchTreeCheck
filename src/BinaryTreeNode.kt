/**
 * Binary tree
 */


import java.util.LinkedList

class BinaryTreeNode(val data: Int) {

    var childLeft: BinaryTreeNode? = null
    var childRight: BinaryTreeNode? = null

    // Prints node + children
    fun printTree() {
        val queue = LinkedList<BinaryTreeNode>()
        queue.add(this)
        while (!queue.isEmpty()) {
            val node = queue.poll()
            print(node.data.toString() + " ")
            if (node.childLeft != null)
                node.childLeft?.let { queue.add(it) }
            if (node.childRight != null)
                node.childRight?.let { queue.add(it) }
        }
    }



}
