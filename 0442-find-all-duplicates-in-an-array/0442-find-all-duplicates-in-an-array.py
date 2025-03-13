class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        result = []
        nums.sort()
        a = 0
        for i in nums:
            if (i == a):
                result.append(i)
            else:
                a = i
        return result