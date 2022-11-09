#include <iostream>
using namespace std;

int main()
{
    int  pro = 1;
    // cin>>t;
    // while (t--)
    // {
        int n;
        cin>>n;
        int arr[n];
        for (int i = 0; i < n; i++)
        {
            cin >> arr[i];
            pro *= arr[i];
        }
        // for (int j = 0; j < n; j++)
        // {
        // }
        if (pro % 10 == 2 || pro % 10 == 3 || pro % 10 == 5)
        {
            cout << "yes";
        }
        else
            cout << "no";
    // }
    return 0;
}