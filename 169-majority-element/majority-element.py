class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        hash = {}
        ans = maj = 0
        for n in nums:
            hash[n] = 1 + hash.get(n, 0)
            if hash[n] > maj:
                ans = n
                maj = hash[n]
        return ans     