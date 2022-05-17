import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class FinaaCorrespondingNode {
    public static void main(String[] args) {
    }

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

        if (original == target)
            return cloned;


        Queue<TreeNode> queue=new LinkedList<>();

        queue.offer(cloned);

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {

                TreeNode node = queue.poll();
                if (node == target)
                    return node;

//                if (node.right != null) queue.offer(node.right);
//                if (node.left != null) queue.offer(node.left);
            }
        }
        return null;
    }


}
