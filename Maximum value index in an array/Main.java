// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int size,i,list[10];
  scanf("%d",&size);
  for(i=0;i<size;i++)
  {
    scanf("%d",&list[i]);
  }
  lar_elem_size(list,size);
  return 0;
}
  void lar_elem_size(int list[],int size)
  {
    int i,large,max_idx;
    large=list[0];
    max_idx=0;
    for(i=1;i<size;i++)
    {
     if(large<list[i])
     {
      max_idx=i;
     }
    }
 printf("%d",max_idx);
  }
  // Type your code here 
  
   