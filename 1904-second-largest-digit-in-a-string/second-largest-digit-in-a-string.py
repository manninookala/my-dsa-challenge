class Solution:
    def secondHighest(self, s: str) -> int:
        listSet = set()
        for ele in s:
            if ele.isdigit() and ele not in listSet:
                listSet.add(ele)
        
        sorted_list = sorted(listSet)
        if len(sorted_list) < 2:
            return -1
        return int(sorted_list[-2])

