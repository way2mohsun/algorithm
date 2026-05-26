# LongestPalindromicSubstr Algorithm Explanation

This algorithm attempts to find palindromic substrings using recursion.

## Main Idea

A palindrome is a string that reads the same forward and backward.

Examples:

- `"aba"`
- `"racecar"`
- `"aa"`

The algorithm works by:

1. Taking a substring
2. Comparing the first and last characters
3. If they match:
   - recursively checking the inner substring
4. If they do not match:
   - removing the last character and trying again
