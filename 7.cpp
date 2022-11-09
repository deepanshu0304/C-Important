#include <iostream>
using namespace std;

int main()
{
    int a, b, c, cth;
    cin >> a >> b >> c;
    for (int i = 1; c > 0; i++)
    {
        if (i % a == 0 || i % b == 0)
            c--;
        cth = i;
    }
    cout << cth;
    return 0;
}          
        