#include <iostream>
#include <vector>
using namespace std;

// Recursive solution to find maximum profit
int maxProfit(vector<int>& price, int start, int end) {
    if (end <= start) {
        return 0; // Base case: no days to trade
    }

    int profit = 0;

    for (int i = start; i < end; i++) {
        for (int j = i + 1; j <= end; j++) {
            // If selling is profitable
            if (price[j] > price[i]) {
                int curr_profit = price[j] - price[i] +
                                  maxProfit(price, start, i - 1) + 
                                  maxProfit(price, j + 1, end);

                profit = max(profit, curr_profit);
            }
        }
    }
    return profit;
}

// Greedy solution to find maximum profit
int maxProfit1(vector<int>& price, int n) {
    int profit = 0;
    for (int i = 1; i < n; i++) {
        if (price[i] > price[i - 1]) {
            profit += (price[i] - price[i - 1]);
        }
    }
    return profit;
}

int main() {
    vector<int> arr = {1, 5, 3, 8, 12};
    int n = arr.size();

    // Recursive solution
    cout << "Maximum Profit (Recursive): " << maxProfit(arr, 0, n - 1) << endl;

    // Greedy solution
    cout << "Maximum Profit (Greedy): " << maxProfit1(arr, n) << endl;

    return 0;
}


