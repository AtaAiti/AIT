public class Main {
    public static void ArraysStatistics (int[] arr) {

        int sum = 0, avg, min = arr[0], max = arr[0];
        int sec_min = arr[0], sec_max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < sec_min && arr[i] > min) {
                sec_min = arr[i];
            }

            if (arr[i] > sec_max && arr[i] < max) {
                sec_max = arr[i];
            }
        }

        avg = sum / arr.length;

        System.out.println("Sum of array: " + sum);
        System.out.println("Avg of array: " + avg);
        System.out.println("Min of array: " + min);
        System.out.println("Max of array: " + max);

        System.out.println("Second min of array: " + sec_min);
        System.out.println("Second max of array: " + sec_max);
    }

    public static void PalindromeChecker (String str) {

        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String rev_str = new StringBuilder(str).reverse().toString();

        System.out.println(str.equals(rev_str));
    }
}