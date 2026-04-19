#include <iostream>

int main(){
    int n;
    std::cin>>n;
    n %= 8;
    std::cout<<(n > 5 || n == 0 ? (10 - n) % 8 : n);
    return 0;
}