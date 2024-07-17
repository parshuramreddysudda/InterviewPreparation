from typing import List


class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        maxElement = max(candies)
        list = []
        for candie in candies:
            if candie+extraCandies > maxElement:
                list.append(True)
            else:
                list.append(False)
        return list

