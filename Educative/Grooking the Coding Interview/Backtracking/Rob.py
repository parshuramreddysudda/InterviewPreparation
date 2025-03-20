from idlelib.tree import TreeNode


def rob(root: TreeNode) -> int:
    # Replace this placeholder return statement with your code
    return 1

# Helper function to build a tree from list input
def build_tree(nodes):
    if not nodes:
        return None
    root = TreeNode(nodes[0])
    queue = [root]
    index = 1
    while queue and index < len(nodes):
        current = queue.pop(0)
        if index < len(nodes) and nodes[index] is not None:
            current.left = TreeNode(nodes[index])
            queue.append(current.left)
        index += 1
        if index < len(nodes) and nodes[index] is not None:
            current.right = TreeNode(nodes[index])
            queue.append(current.right)
        index += 1
    return root

if __name__ == "__main__":
    def run_test_case(tree_values, expected):
        root = build_tree(tree_values)
        result = rob(root)
        print(f"Tree: {tree_values} | Expected: {expected} | Got: {result} | {'PASSED' if result == expected else 'FAILED'}")

    # Test case 1
    run_test_case([3, 2, 3, None, 3, None, 1], 7)  # Expected output: 7

    # Test case 2
    run_test_case([3, 4, 5, 1, 3, None, 1], 9)  # Expected output: 9

    # Test case 3
    run_test_case([], 0)  # Empty tree, expected output: 0

    # Test case 4
    run_test_case([2, 1, 3, None, 4], 7)  # Expected output: 7

    # Test case 5
    run_test_case([4, 1, None, 2, None, 3], 7)  # Expected output: 7
