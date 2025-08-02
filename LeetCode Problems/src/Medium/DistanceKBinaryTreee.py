from typing import List, Optional
from collections import deque

# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def distanceK(self, root: TreeNode, target: TreeNode, k: int) -> List[int]:
        """
        Given the root of a binary tree, a target node, and an integer k,
        return the values of all nodes that have a distance k from the target node.
        """
        # TODO: Implement your solution here

        reqNode = -1
        if k <=0:
            return [target.val]
        hashSet = set()
        def dfs(node):

            if node is None:
                return False
            hashSet.add(node.val)
            if node.val == target.val:
                return True
            if dfs(node.left):
                return True
            if dfs(node.right):
                return True
            hashSet.remove(node.val)
            return False

        dfs(root)
        result=[]
        def trace(node,distance):
            if node is None:
                return
            if distance == k:
                result.append(node.val)

            if node.left:
                if node.left.val in hashSet:
                    trace(node.left, distance - 1)
                else:
                    trace(node.left, distance + 1)
            if node.right:
                if node.right.val in hashSet:
                    trace(node.right, distance - 1)
                else:
                    trace(node.right, distance + 1)

        trace(root, len(hashSet)-1)
        print(result)





        return result




# ------------------ Helper Functions for Tests ------------------

def build_tree(values):
    """Builds a binary tree from level-order list values (None for empty)."""
    if not values: return None
    nodes = [TreeNode(val) if val is not None else None for val in values]
    kid_index = 1
    for i, node in enumerate(nodes):
        if node:
            if kid_index < len(nodes): node.left = nodes[kid_index]; kid_index += 1
            if kid_index < len(nodes): node.right = nodes[kid_index]; kid_index += 1
    return nodes[0]

def find_node(root, val):
    """Finds a node by value (first match) using BFS."""
    if not root: return None
    queue = deque([root])
    while queue:
        node = queue.popleft()
        if node.val == val: return node
        if node.left: queue.append(node.left)
        if node.right: queue.append(node.right)
    return None

# ------------------ Test Harness ------------------

def test_distanceK():
    sol = Solution()

    def validate(tree_vals, target_val, k, expected):
        root = build_tree(tree_vals)
        target = find_node(root, target_val)
        result = sorted(sol.distanceK(root, target, k))
        assert result == sorted(expected), f"Failed for tree={tree_vals}, target={target_val}, k={k}. Expected {expected}, got {result}"

    # 🔬 Complex / Edge test cases
    # validate([3,5,1,6,2,0,8,None,None,7,4], 5, 2, [7,4,1])   # Example from problem
    # validate([1], 1, 0, [1])                                # Single node, k=0
    validate([0,1,None,3,2], 2, 1, [1])                                # Single node, k=0
    validate([1,2,3], 2, 1, [1])                            # Target is leaf, k=1
    validate([1,2,3,4,5,6,7], 3, 2, [4,5])                  # Balanced tree
    validate([0,1,None,3,2], 2, 2, [0,3])                   # Unbalanced
    validate([], None, 1, [])                               # Empty tree

    print("✅ All test cases passed!")

# Run tests
if __name__ == "__main__":
    test_distanceK()
