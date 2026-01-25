class Solution:
    def bestClosingTime(self, customers: str) -> int:
        # ❌ Implement your solution here

        prefSumShopOpen = [0] * (len(customers) + 1 )
        prefSumShopClosing = [0] * (len(customers) + 1 )
        sufSumShopOpen = [0] * (len(customers) + 1)
        sufSumShopClosing = [0] * (len(customers) + 1)
        index = 0
        prefSumOpen = 0
        sufSumOpen = 0
        prefSumClosing = 0
        sufSumClosing = 0

        shopArra = [
            [1, 0],
            [0, 1]
        ]

        for i in range(len(customers)):
            if customers[i] == 'Y':
                prefSumShopOpen[i+1] = prefSumOpen
                prefSumClosing += 1
                prefSumShopClosing[i+1] = prefSumClosing
            else:
                prefSumOpen += 1
                prefSumShopOpen[i] = prefSumOpen
                prefSumShopClosing[i] = prefSumClosing

        for i in range(len(customers),0):
            if customers[i] == 'Y':
                sufSumShopOpen[i-1] = prefSumOpen
                prefSumClosing += 1
                sufSumShopClosing[i-1] = prefSumClosing
            else:
                prefSumOpen += 1
                sufSumShopOpen[i-1] = prefSumOpen
                sufSumShopClosing[i-1] = prefSumClosing


        return 0


def test_bestClosingTime_2483():
    sol = Solution()

    def validate(customers, expected):
        result = sol.bestClosingTime(customers)
        assert result == expected, (
            f"❌ Failed for customers='{customers}'. "
            f"Expected {expected}, got {result}"
        )

    # 🔬 Core test cases
    validate("YYNY", 2)
    validate("NNNNN", 0)
    validate("YYYY", 4)

    # 🔬 Edge cases
    validate("", 0)                         # Empty string
    validate("Y", 1)                        # Single customer
    validate("N", 0)                        # Single no-customer
    validate("YN", 1)
    validate("NY", 0)

    # 🔬 Corner / tricky cases
    validate("YNYNY", 1)
    validate("NNYNN", 2)
    validate("YYNNYY", 2)
    validate("NYNYNYNY", 0)
    validate("YYYNNN", 3)

    # 🔬 Large input case (performance)
    large_customers = "Y" * 50000 + "N" * 50000
    validate(large_customers, 50000)

    print("✅ All test cases passed!")


# Run tests
if __name__ == "__main__":
    test_bestClosingTime_2483()
