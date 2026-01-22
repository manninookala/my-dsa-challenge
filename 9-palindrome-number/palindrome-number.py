class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x <= 9 and x > 0:
            return True
        if x < 0:
            return False
            
        arr = []
        while x != 0:
            temp = x%10
            x = x//10
            arr.append(temp)
            if x <= 9:
                arr.append(x)
                break

        n=len(arr)
        limit = n//2

        for i in range(limit):
            if arr[i] == arr[n-1-i]:
                continue
            else :
                return False
        return True
        
        