// sorting of an array.....
// selection sort.......

#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    for (int i = 0; i < n; i++)
    {
        int mindindex = i;
        for (int j = i + 1; j < n; j++)
        {
            if (arr[j] < arr[mindindex])
                mindindex = j;
        }
        swap(arr[i], arr[mindindex]);
    }
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
    return 0;
}

// Time complexity is 0(N^2)......