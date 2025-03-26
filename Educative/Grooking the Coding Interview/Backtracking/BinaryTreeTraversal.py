# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


# Function to find all root-to-leaf paths in a binary tree
def binary_tree_paths(root):
    # Implement your solution here
    def backtrack(node, path):
        if node:
            path += str(node.val)

            if not node.left and not node.right:
                paths.append(path)
            else:
                path += '->'
                backtrack(node.left,path)
                backtrack(node.right,path)
    paths =[]
    backtrack(root,'')
    return paths



def binaryTreeParse(root):
    if not root:
        return []
    if root.left is None and root.right is None:
        return [str(root.val)]

    paths = []
    left = binaryTreeParse(root.left)
    right = binaryTreeParse(root.right)

    if left is not None:
        paths += left
    if right is not None:
        paths += right

    # Left side tree Path

    # Right side tree Path

    for i in range(len(paths)):
        paths[i] = str(root.val) + "->" + paths[i]

    return paths


# Test cases
def test_binary_tree_paths():
    # Example test cases
    # Test case 1: Tree with multiple paths
    tree6 = TreeNode(1)
    tree6.left = TreeNode(2)
    tree6.right = TreeNode(3)
    tree6.left.left = TreeNode(4)
    tree6.left.right = TreeNode(5)
    tree6.right.left = TreeNode(6)
    tree6.right.right = TreeNode(7)
    expected_output6 = ["1->2->4", "1->2->5", "1->3->6", "1->3->7"]

    tree1 = TreeNode(1)
    tree1.left = TreeNode(2)
    tree1.right = TreeNode(3)
    tree1.left.right = TreeNode(5)
    expected_output1 = ["1->2->5", "1->3"]

    # Test case 2: Single node tree
    tree2 = TreeNode(1)
    expected_output2 = ["1"]

    # Test case 3: Empty tree
    tree3 = None
    expected_output3 = []

    test_cases = [
        (tree6, expected_output6),
        (tree1, expected_output1),
        (tree2, expected_output2),
        (tree3, expected_output3)
    ]

    for idx, (root, expected_output) in enumerate(test_cases):
        result = binary_tree_paths(root)
        assert result == expected_output, f"Test case {idx + 1} failed: expected {expected_output}, but got {result}"

    print("All test cases passed!")


# Run the test cases
if __name__ == "__main__":
    test_binary_tree_paths()
