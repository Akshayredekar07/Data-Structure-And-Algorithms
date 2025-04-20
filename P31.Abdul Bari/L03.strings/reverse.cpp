
#include <iostream>
#include <string>
#include <vector>
using namespace std;

void reverseStringTwoPointers(string& s) {
    int left = 0;
    int right = s.length() - 1;
    while (left < right) {
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        left++;
        right--;
    }
}

void reverseStringRecursive(string& s, int start, int end) {
    if (start >= end) return;
    char temp = s[start];
    s[start] = s[end];
    s[end] = temp;
    reverseStringRecursive(s, start + 1, end - 1);
}

string reverseStringStack(string s) {
    vector<char> stack;
    for (char c : s) {
        stack.push_back(c);
    }
    string result = "";
    while (!stack.empty()) {
        result += stack.back();
        stack.pop_back();
    }
    return result;
}

void reverseStringXOR(string& s) {
    int i = 0;
    int j = s.length() - 1;
    while (i < j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        i++;
        j--;
    }
}

string reverseStringNewString(string s) {
    string result(s.length(), ' ');
    for (int i = 0; i < s.length(); i++) {
        result[i] = s[s.length() - 1 - i];
    }
    return result;
}

int main() {
    string str1 = "HelloWorld";
    string str2 = "HelloWorld";
    string str3 = "HelloWorld";
    string str4 = "HelloWorld";
    string str5 = "HelloWorld";

    cout << "Original string: " << str1 << endl;

    reverseStringTwoPointers(str1);
    cout << "Two pointers: " << str1 << endl;

    reverseStringRecursive(str2, 0, str2.length() - 1);
    cout << "Recursive: " << str2 << endl;

    cout << "Stack: " << reverseStringStack(str3) << endl;

    reverseStringXOR(str4);
    cout << "XOR: " << str4 << endl;

    cout << "New string: " << reverseStringNewString(str5) << endl;

    return 0;
}