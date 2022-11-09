// sum of array using recursion
#include<bits/stdc++.h>
using namespace std;
int sum(int a , int arr[]){
    if(a<0) return 0;
    return sum(a-1,arr)+arr[a];

}
int main(){
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    cout<<sum(n-1,arr);
    return 0;
}