// Reverse the string.........



#include<iostream>
#include<string>
// #include<bits/stdc++.h>
using namespace std;

int main(){
    string s;
    string str;
    cin>>s;
    for(int i = s.size()-1; i>=0; i--){
        


    str.push_back(s[i]);

    }


cout << str;
    return 0;
}