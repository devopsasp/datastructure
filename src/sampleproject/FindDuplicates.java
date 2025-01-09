package sampleproject;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {12, 11, 14, 13, 14, 16, 19, 12, 22};
        findDuplicates(arr);
    }

    public static void findDuplicates(int[] arr) {
        boolean[] checked = new boolean[arr.length]; // To keep track of checked elements
        boolean foundDuplicate = false; // Flag to check if duplicates are found

        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            // Skip already checked elements
            if (checked[i]) {
                continue;
            }

            int count = 1; // Count occurrences of the current element

            // Check for duplicates
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    checked[j] = true; // Mark this element as checked
                }
            }

            // If count is greater than 1, we found duplicates
            if (count > 1) {
                System.out.println("Value: " + arr[i] + " | Count: " + count);
                foundDuplicate = true;
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicates found.");
        }
    }
}