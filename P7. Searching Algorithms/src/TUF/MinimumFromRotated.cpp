
# include <iostream>
using namespace std;


int findMin(vector<int>&arr){
    int low=0;
    int high=arr.size()-1;
    itnt ans=INT_MAX;
    while(low<=high){
        int mid=(low+high)/2;
        //if array is already sorted 
        //then always arr[low] is always sorted
        //in that search space
        if(arr[low]<=arr[high]){
            ans=min(ans, arr[low]);
            break;
        }

        if(arr[low]<=arr[mid]){
            ans=min(ans, arr[low]);
            low=mid+1;
        }else{
            high=mid-1;
            ans=min(ans, arr[mid]);
        }
        return ans;

    }

}