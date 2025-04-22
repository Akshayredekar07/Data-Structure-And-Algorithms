#include <stdio.h>
#include <string.h>

int main()
{
    char A[] = "Painter";
    char B[] = "Painting";
    int i, j;

    for(i = 0, j = 0; A[i] != '\0' && B[j] != '\0'; i++, j++)
    {
        if(A[i] != B[j]) // Break only if characters differ
        {
            if(A[i] < B[j])
                printf("smaller");
            else
                printf("greater");
            break;
        }
    }

    // Check if one string is a prefix of the other
    if(A[i] == '\0' && B[j] != '\0')
        printf("smaller");
    else if(A[i] != '\0' && B[j] == '\0')
        printf("greater");

    return 0;
}

/* Dry Run:
   - Input:
     - A = "Painter" (length 7, {'P', 'a', 'i', 'n', 't', 'e', 'r', '\0'})
     - B = "Painting" (length 8, {'P', 'a', 'i', 'n', 't', 'i', 'n', 'g', '\0'})
   - Initial State: i = 0, j = 0

   - Loop Execution:
     | Iteration | i | j | A[i] | B[j] | Condition (A[i] != B[j]) | Action |
     |-----------|---|---|------|------|--------------------------|--------|
     | 1         | 0 | 0 | 'P'  | 'P'  | False ('P' == 'P')       | Continue |
     | 2         | 1 | 1 | 'a'  | 'a'  | False ('a' == 'a')       | Continue |
     | 3         | 2 | 2 | 'i'  | 'i'  | False ('i' == 'i')       | Continue |
     | 4         | 3 | 3 | 'n'  | 'n'  | False ('n' == 'n')       | Continue |
     | 5         | 4 | 4 | 't'  | 't'  | False ('t' == 't')       | Continue |
     | 6         | 5 | 5 | 'e'  | 'i'  | True ('e' != 'i')        | Compare |

   - At i=5, j=5:
     - A[5] = 'e', B[5] = 'i'
     - 'e' < 'i' (ASCII: 101 < 105)
     - Prints "smaller"
     - Breaks loop

   - Post-Loop:
     - i = 5, A[5] = 'e', A[6] = 'r', A[7] = '\0'
     - j = 5, B[5] = 'i', B[6] = 'n', B[7] = 'g', B[8] = '\0'
     - Since loop broke due to differing characters, prefix check is skipped

   - Output: "smaller"
   - Explanation: "Painter" is lexicographically smaller than "Painting" as 'e' < 'i' at position 5
*/