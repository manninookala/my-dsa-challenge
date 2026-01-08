class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        # n = len(nums)
        # for i in range(0,n-1):
        #     for j in range(i+1, n):
        #         if nums[i] + nums[j] == target:
        #             return [i,j]

        hash_map = {}
        n = len(nums)
        for i in range(0,n):
            remainder = target - nums[i]
            if remainder in hash_map:
                return [hash_map[remainder], i]
            else:
                hash_map[nums[i]] = i
        