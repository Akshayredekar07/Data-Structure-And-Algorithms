
#include <stdio.h>

int isLetter(char c) {
    return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
}

int isVowel(char c) {
    if (c >= 'A' && c <= 'Z') {
        c = c + 32;
    }
    return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
}

void countVowelsConsonants(const char *str, int *vowels, int *consonants) {
    *vowels = 0;
    *consonants = 0;

    if (str == NULL) {
        printf("Error: NULL string provided\n");
        return;
    }

    int i = 0;
    while (str[i] != '\0') {
        if (isLetter(str[i])) { // Process only alphabetic characters
            if (isVowel(str[i])) {
                (*vowels)++;
            } else {
                (*consonants)++;
            }
        }
        i++;
    }
}

int main() {
    int vowels, consonants;

    // Test Case 1: Typical string with mixed case and special characters
    printf("\nTest Case 1: Typical string (Hello, World! 123)\n");
    char str1[] = "Hello, World! 123";
    countVowelsConsonants(str1, &vowels, &consonants);
    printf("String: %s\n", str1);
    printf("Vowels: %d, Consonants: %d\n", vowels, consonants);

    // Test Case 2: NULL string
    printf("\nTest Case 2: NULL string\n");
    countVowelsConsonants(NULL, &vowels, &consonants);

    // Test Case 3: Empty string
    printf("\nTest Case 3: Empty string\n");
    char str2[] = "";
    countVowelsConsonants(str2, &vowels, &consonants);
    printf("String: (empty)\n");
    printf("Vowels: %d, Consonants: %d\n", vowels, consonants);

    // Test Case 4: Only vowels
    printf("\nTest Case 4: Only vowels (AEIOU)\n");
    char str3[] = "AEIOU";
    countVowelsConsonants(str3, &vowels, &consonants);
    printf("String: %s\n", str3);
    printf("Vowels: %d, Consonants: %d\n", vowels, consonants);

    // Test Case 5: Only consonants
    printf("\nTest Case 5: Only consonants (bcd)\n");
    char str4[] = "bcd";
    countVowelsConsonants(str4, &vowels, &consonants);
    printf("String: %s\n", str4);
    printf("Vowels: %d, Consonants: %d\n", vowels, consonants);

    // Test Case 6: No letters
    printf("\nTest Case 6: No letters (123!@#)\n");
    char str5[] = "123!@#";
    countVowelsConsonants(str5, &vowels, &consonants);
    printf("String: %s\n", str5);
    printf("Vowels: %d, Consonants: %d\n", vowels, consonants);

    // Test Case 7: String with spaces only
    printf("\nTest Case 7: Spaces only (   )\n");
    char str6[] = "   ";
    countVowelsConsonants(str6, &vowels, &consonants);
    printf("String: (spaces)\n");
    printf("Vowels: %d, Consonants: %d\n", vowels, consonants);

    // Test Case 8: Single letter (vowel)
    printf("\nTest Case 8: Single vowel (a)\n");
    char str7[] = "a";
    countVowelsConsonants(str7, &vowels, &consonants);
    printf("String: %s\n", str7);
    printf("Vowels: %d, Consonants: %d\n", vowels, consonants);

    // Test Case 9: Single letter (consonant)
    printf("\nTest Case 9: Single consonant (b)\n");
    char str8[] = "b";
    countVowelsConsonants(str8, &vowels, &consonants);
    printf("String: %s\n", str8);
    printf("Vowels: %d, Consonants: %d\n", vowels, consonants);

    return 0;
}