#include <bits/stdc++.h>
using namespace std;
// const int N = 1e7;
// int arr[N];
vector<int> a;
void fun(int t);
float avg();
float avg()
{
    float sum = 0.0;
    for (int i = 0; i < a.size(); i++)
    {
        sum += a[i];
    }
    return sum / a.size();
}

int main()
{
    int n, t;
    float av;
    cin >> n;
    a.push_back(0);
    while (n--)
    {
        cin >> t;
        fun(t);
        av = avg();
        cout << av << endl;
    }
    return 0;
}
void fun(int t)
{
    switch (t)
    {
    case 1:
        int z, k;
        cin >> k >> z;
        for (int i = 0; i < k; i++)
        {
            a[i] += z;
        }
        break;
    case 2:
        int y;
        cin >> y;
        a.push_back(y);
        break;
    case 3:
        a.pop_back();
        break;
    }
}
