package Semester_1.Lab_06;

import java.util.Random;

public class Problem_01 {
    static Random random = new Random();

    public static void main(String[] args) {
        int[] misspelled_sentence_indexes = new int[8];

        for (int i = 0; i < 8; ++i)
            if (!array_contains(misspelled_sentence_indexes, i))
                misspelled_sentence_indexes[i] = random.nextInt(101);

        for (int i = 0; i < 100; ++i) {
            String sentence = "I will not spam my friends again";

            if (array_contains(misspelled_sentence_indexes, i))
                sentence = misspell_sentence(sentence) + " (error)";

            System.out.println((i + 1) + ". " + sentence);
        }
    }

    private static boolean array_contains(int[] array, int target) {
        for (int element : array)
            if (element == target)
                return true;

        return false;
    }

    private static String misspell_sentence(String original_sentence) {
        int random_index = random.nextInt(original_sentence.length());
        char random_char = generate_random_char();

        StringBuilder misspelled_sentence = new StringBuilder(original_sentence);
        misspelled_sentence.setCharAt(random_index, random_char);

        return misspelled_sentence.toString();
    }

    private static char generate_random_char() {
        return (char) (65 + random.nextInt(52));
    }
}
