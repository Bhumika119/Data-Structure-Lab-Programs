#include <stdio.h>
#include <stdlib.h>

int main()
{
    int queue[10],i,n,x,f=-1,r=-1,choice;
   
    printf("\n enter the size of queue");
    scanf("%d",&n);
    while(1)
 {
    printf("\n1.insertion of element in queue:enqueue");
    printf("\n2.deletion of element in queue:dequeue");
    printf("\n3.underflow:check whether the stack is empty");
    printf("\n4.overflow:check whether the stack is full");
    printf("\n5.peek:show first element");
    printf("\n6.display");
    printf("\n7.exit");
    
    printf("\n enter the choice");
    scanf("%d",&choice);
    
    switch(choice)
    {
        case 1:
        //insertion
        printf("\n enter the element for insertion in queue");
        scanf("%d",&x);
        
        if(r==n-1)
        {
            printf("\n overflow");
           
        }
        else if(f==-1&&r==-1)
        {
            f=r=0;
            queue[r]=x;
        }
        else
        {
            r++;
            queue[r]=x;
        }
        break;
        
        case 2:
       
        if(f==-1&&r==-1)
        {
            printf("'\n underflow");
        }
        else if(f==r)
        {
            printf("\n element deleted fron queue:%d",queue[f]);
            f=r=-1;
        }
        else
        {
            printf("\n element deleted from queue: %d",queue[f]);
            f++;
        }
        break;
        
        case 3:
        //underflow
        if(f==-1&&r==-1)
        {
            printf("queue is empty: underflow");
           
        }
        else
        {
            printf("queue is not empty");
        }
        break;
        
        case 4:
        //overflow
        if(r==-1)
        {
            printf("queue is full: overflow");
        }
        else
        {
            printf("queue is not full");
        }
        break;
        
        case 5:
        //peek:sho first element
        printf("the element at first position is %d",queue[f]);
        break;
        
        case 6:
        //display
        printf(" \n displaying the elements");
        for(int i=f;i<=r;i++)
        {
            printf("%d\t",queue[i]);
        }
        break;
        
        case 7:
        //exit
         exit(0);
        break;
        default:
        printf("invalid choice!!");
    }
 }

      return 0;  
}