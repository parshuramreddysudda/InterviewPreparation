# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


# Function to find the lexicographically smallest string from leaf to root
def smallestFromLeaf(root):
    # Implement your solution here
    if not root: return ''
    return findSmallest(root, '')


def findSmallest(root, path):
    if not root:
        return None

    path = chr(97 + root.val)+ path

    if not root.left and not root.right:
        return path

    lString = findSmallest(root.left, path)

    rString = findSmallest(root.right, path)

    if lString and rString: return min(lString, rString)
    return lString or rString


# Test cases
def test_smallestFromLeaf():
    # Example test cases

    root = TreeNode(4)
    root.left = TreeNode(0)
    root.right = TreeNode(1)
    root.right.left = TreeNode(1)
    expected_output1 = "bae"  # Possible paths: "ba", "ca", smallest is "ba"

    tree2 = TreeNode(2, TreeNode(2, TreeNode(1, TreeNode(0))), TreeNode(1, TreeNode(0)))
    expected_output2 = "abc"  # Smallest string from leaf to root

    tree3 = TreeNode(25, TreeNode(1, TreeNode(0)), TreeNode(3, TreeNode(2)))
    expected_output3 = "abz"  # Possible paths: "az", "cb", smallest is "az"

    tree4 = TreeNode(3, TreeNode(1, TreeNode(3)), TreeNode(2, TreeNode(2, TreeNode(1))))
    expected_output4 = "bccd"  # Smallest lexicographically

    # Additional edge cases
    tree5 = TreeNode(0)
    expected_output5 = "a"  # Single node tree

    tree6 = None
    expected_output6 = ""  # Empty tree

    test_cases = [
        (root, expected_output1),
        (tree2, expected_output2),
        (tree3, expected_output3),
        (tree4, expected_output4),
        (tree5, expected_output5),
        (tree6, expected_output6),
    ]

    for idx, (root, expected_output) in enumerate(test_cases):
        result = smallestFromLeaf(root)
        assert result == expected_output, f"Test case {idx + 1} failed: expected {expected_output}, but got {result}"

    print("All test cases passed!")


# Run the test cases
if __name__ == "__main__":
    test_smallestFromLeaf()
