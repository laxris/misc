// https://www.hackerrank.com/challenges/is-fibo

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


bool isFibo(long a) {
  return  (fmod((sqrt(5*pow(a,2) + 4)),1) == 0) || (fmod((sqrt(5*pow(a,2) - 4)),1) == 0);
}

int main() {
  int _cycles;
  long number;
  cin>>_cycles;
    
  for(int i=0;i<_cycles;i++) {
    cin>>number;
    if(isFibo(number)) {
          cout<<"IsFibo";
    }
    else {
          cout<<"IsNotFibo";
    }
   cout<<'\n';
  }
    
  return 0;
}