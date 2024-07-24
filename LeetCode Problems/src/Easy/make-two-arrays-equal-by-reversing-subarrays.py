from typing import List


class Solution:
    def canBeEqual(self, target: List[int], arr: List[int]) -> bool:
        if (len(target)!=len(arr)):return False
        return (set(target) != set(arr))