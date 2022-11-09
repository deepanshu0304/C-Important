// code for converting binary to DECIMAl.....
#include <iostream>
#include <string>
using namespace std;

int main()
{ int sum =0;
int power_of_2 = 1;
    string binary;
    cin>>binary;
    for (int  j = binary.size() - 1;  j>= 0; j--)
    {
        int digit = binary[j] - 48;
          sum = sum + (digit*power_of_2);
          power_of_2 = power_of_2*2;
    }
    cout<<sum;
    return 0;
}