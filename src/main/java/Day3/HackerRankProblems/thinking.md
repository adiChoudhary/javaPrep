## Day3 HackerRank Thinking

- taking substring of a string 
  - Approach 1 (use java utitlity)
  - Approach 2 (use logic)
    - Try not to use any extra space
      - String in java is immutable so we would need to use character array
      - copying from relevant index and then truncating the array works
- lexicographical smallest and largest substrings of length k
  - Basic Logic (Works for 10^3)
    - Total number of such substrings = n-k+1 (since we can maintain 1 smallest)
    - Operations performed in comparng two substrings = k (since length k)
    - Total time complexity = (n-k+1)*k
      - Worst case if k = n/2 then O(n^2)
- Palindrome
  - StringBuilder can be used for reversing a String in Java