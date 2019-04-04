#include<stdio.h>
int main()
{
  int arrsize;
   scanf("%d",&arrsize);
  int arr[10];
  for(int index=0;index<=arrsize-1;index++)
  {
        scanf("%d",&arr[index]);
    
  }
  int max_no;
  //if(arr[0]>arr[1])
  //{
    //max_no=arr[0];
  //}
  //else
  //{
    //max_no=arr[1];
  //}
  
  for(int index=0;index<=arrsize-1;index++)
  {
    if(max_no < arr[index])
    { 
      max_no=arr[index];
    }
  }
  printf("%d",max_no);
    
  
  
  //fill the code
  return 0;
}