from typing import Optional


# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


# Function to sum all root-to-leaf numbers
def sumNumbers(root: Optional[TreeNode]) -> int:
    # Implement your solution here
    paths = []

    def sumOfNumbers(root, path):

        if not root:
            return ''

        path += str(root.val)

        if root.left is None and root.right is None:
            paths.append(path)
            return
        sumOfNumbers(root.left, path)
        sumOfNumbers(root.right, path)

    sumOfNumbers(root,'')
    return sum([int(path) for path in paths])

# Test cases
def test_sumNumbers():
    # Test case 1: Simple tree
    tree1 = TreeNode(1)
    tree1.left = TreeNode(2)
    tree1.right = TreeNode(3)
    expected_output1 = 25  # Paths: "12" + "13" = 12 + 13 = 25

    # Test case 2: Tree with multiple levels
    tree2 = TreeNode(4)
    tree2.left = TreeNode(9)
    tree2.right = TreeNode(0)
    tree2.left.left = TreeNode(5)
    tree2.left.right = TreeNode(1)
    expected_output2 = 1026  # Paths: "495" + "491" + "40" = 495 + 491 + 40 = 1026

    # Test case 3: Single node tree
    tree3 = TreeNode(7)
    expected_output3 = 7  # Single path "7"

    # Test case 4: Left-skewed tree
    tree4 = TreeNode(2)
    tree4.left = TreeNode(3)
    tree4.left.left = TreeNode(4)
    expected_output4 = 234  # Path: "234"

    # Test case 5: Right-skewed tree
    tree5 = TreeNode(1)
    tree5.right = TreeNode(2)
    tree5.right.right = TreeNode(3)
    expected_output5 = 123  # Path: "123"

    test_cases = [
        (tree1, expected_output1),
        (tree2, expected_output2),
        (tree3, expected_output3),
        (tree4, expected_output4),
        (tree5, expected_output5)
    ]

    for idx, (root, expected_output) in enumerate(test_cases):
        result = sumNumbers(root)
        assert result == expected_output, f"Test case {idx + 1} failed: expected {expected_output}, but got {result}"

    print("All test cases passed!")


# Run the test cases
if __name__ == "__main__":
    test_sumNumbers()
