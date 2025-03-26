# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


# Function to find all root-to-leaf paths in a binary tree
def binary_tree_paths(root):
    # Implement your solution here
    return binaryTreeParse(root)


def binaryTreeParse(root):
    if not root:
        return None
    if root.left is None and root.right is None:
        return str(root.val)

    paths = []
    left = binaryTreeParse(root.left)
    right = binaryTreeParse(root.right)

    if left is not None:
        paths.insert(0, left)
    if right is not None:
        paths.insert(0, right)

    # Left side tree Path

    # Right side tree Path

    for path in paths:
        path[0].join(str(root.val) + "->" + path[0])

    return paths


# Test cases
def test_binary_tree_paths():
    # Example test cases
    # Test case 1: Tree with multiple paths
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
