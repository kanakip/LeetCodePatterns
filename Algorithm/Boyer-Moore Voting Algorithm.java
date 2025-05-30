The Boyer-Moore Voting Algorithm is an efficient method for finding the majority element in an array—an element that appears **more than n/2 times**. It operates in O(n) time and O(1) space, making it optimal for this problem.

How It Works
1. Candidate Selection: 
   - Traverse the array while maintaining a candidate and a count.
   - If `count == 0`, set the current element as the new candidate.
   - If the current element matches the candidate, increase count.
   - Otherwise, decrease count.

2. Verification (Optional):
   - The algorithm does not guarantee correctness if no majority element exists.
   - A second pass can be used to **verify** whether the candidate appears more than `n/2` times.

Algorithm Steps

public int majorityElement(int[] nums) {
    int cand = 0, count = 0;

    for (int num : nums) {
        if (count == 0) {
            cand = num;
        }
        count += (num == cand) ? 1 : -1;
    }

    return cand; // Candidate for majority element
}

Example

int[] nums = {3, 3, 4, 2, 3, 3, 3};
System.out.println(majorityElement(nums)); // Output: 3


Limitations
- If no majority element exists, the algorithm may return an incorrect value.
- A second pass is needed to confirm the result.

For more details, check out [GeeksforGeeks](https://www.geeksforgeeks.org/boyer-moore-majority-voting-algorithm/) or [Wikipedia](https://en.wikipedia.org/wiki/Boyer%E2%80%93Moore_majority_vote_algorithm). Let me know if you need further explanations! 🚀
