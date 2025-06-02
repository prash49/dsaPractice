package DSAProblems.patternwiseProblemSolving.slidingwindow.variableSizeWindow;

public class LongestRepeatingCharacterAfterReplacement {
    public static void main(String[] args) {
        String str = "AABBCCDD";
        int longest =characterReplacement(str, 2);
        System.out.println("longest:"+ longest);
    }
    public static int characterReplacement(String s, int k) {
        int n = s.length();
        int[] char_counts = new int[26]; // Frequency of characters in the current window
        int left = 0; // Left pointer of the sliding window
        int max_count_in_window = 0; // Frequency of the most frequent char in the window
        int max_length = 0; // Length of the longest valid substring found

        // Right pointer iterates through the string, expanding the window
        for (int right = 0; right < n; right++) {
            char current_char = s.charAt(right);
            int char_index = current_char - 'A';

            // Increment count for the entering character
            char_counts[char_index]++;

            // Update the max frequency count in the current window
            max_count_in_window = Math.max(max_count_in_window, char_counts[char_index]);

            // Check if the window is invalid (replacements needed > k)
            int window_length = right - left + 1;
            int replacements_needed = window_length - max_count_in_window;

            if (replacements_needed > k) {
                // If invalid, contract the window from the left
                char char_left = s.charAt(left);
                int char_left_index = char_left - 'A';

                // Decrement count for the leaving character
                char_counts[char_left_index]--;

                // Note: We don't need to update max_count_in_window downwards here.
                // max_count_in_window only needs to increase to find potentially
                // longer windows later. If contracting makes the max count smaller
                // for the *current* (shorter) window, that's fine - we already
                // considered the longer window before contracting.

                // Move the left pointer
                left++;
            }

            // After ensuring the window is valid (or was already valid),
            // update the max length found so far.
            // Note that window_length = right - left + 1 is calculated *after*
            // potential left pointer movement in the 'if' block.
            max_length = Math.max(max_length, right - left + 1);
        }

        return max_length;
    }
}
