#include<stdio.h>

   int square(int num);
  int main()
  {
    int num;
    scanf("%d",&num);
    printf("%d",square(num));
    return 0;
  }
  
  int square( int num)
  {
     int r=num*num;
    return r;
  }
    
  