class Solution {
     private static final String[] KEYPAD_MAP = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return combinations;
        }
        backtrack(digits, 0, new StringBuilder(), combinations);
        return combinations;
    }

    private void backtrack(String digits, int index, StringBuilder currentPath, List<String> combinations) {
        // Base case: if current path length matches digits length, add to results
        if (index == digits.length()) {
            combinations.add(currentPath.toString());
            return;
        }

        // Retrieve mapped letters for the current digit character
        String letters = KEYPAD_MAP[digits.charAt(index) - '0'];
        
        // Iterate through each possible letter and recurse
        for (int i = 0; i < letters.length(); i++) {
            currentPath.append(letters.charAt(i)); // Choose
            backtrack(digits, index + 1, currentPath, combinations); // Explore
            currentPath.deleteCharAt(currentPath.length() - 1); // Un-choose (backtrack)
        }
    }
}
