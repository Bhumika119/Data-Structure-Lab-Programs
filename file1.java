#include<stdio.h>
#include<stdlib.h>

int n,a,arr[10],pos,x,i;
int main() {
   int choice;
   printf("enter the size of array");
   scanf("%d",&n);
   for(i=0;i<n;i++)
   {
       scanf("%d",&arr[i]);
   }
   
   
   while(1)  { 
       
       printf("\n1.insertion of element at first position");
       printf("\n2.insertion of element at any position");
       printf("\n3.insertion of element at last position");
       printf("\n4.deletion of element at first position");
       printf("\n5.deletion of element at any position");
       printf("\n6.deletion of element at last position");
       printf("\n7.displaying the elements");
       printf("\n8.exit");
       
       printf("\n enter the choice");
       scanf("%d",&choice);
  
   
   switch(choice)
   {
       case 1: 
       
       printf("\n enter the element");
       scanf("%d",&x);
       for(int i=n-1;i>=0;i--)
       {
           arr[i+1]=arr[i];
       }
        arr[0]=x;
        n++;
        break;
        
        case 2:
        
        printf("\n enter the element");
        scanf("%d",&x);
        printf("\n enter the position for insertion");
        scanf("%d",&pos);
        for(int i=n-1;i>=pos-1;i--)
        {
            arr[i+1]=arr[i];
        }        
        arr[pos-1]=x;
        n++;
        break;

        case 3:
        
        printf("\n enter the element");
        scanf("%d",&x);
        arr[n]=x;
        n++;
        break;

        case 4:
        
        printf("\n delete the element");
        for (int i=0;i<=n;i++)
        {
            arr[i]=arr[i+1]; 
        }
        n--;
        break;
        
        case 5:
        
        printf("enter the position of deletion ");
        for(int i=pos-1;i<=n-1;i++)
        {
            arr[i]=arr[i+1];
        }
        n--;
        break;
        
        case 6 :
        
        printf("\n delete the element");
        n--;
        break;
        
       case 7 :
       
       printf("\n displaying the elements");
       for(int i=0;i<n;i++)
        {
       printf("%d\t",arr[i]);      //write an array
        }
        break;
        
        case 8:
        
        exit(0);
        default:printf("\n invalid choice!");
        
   } // end of switch
   }// end of while loop
   

    return 0;
}
