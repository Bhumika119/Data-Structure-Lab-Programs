#include<stdio.h>
#include<stdlib.h>

int main ()
 {
    
   int top=-1,stack[10],x,n,i,choice;
   printf("\n Enter the size of stack");
   scanf("%d",&n);
 
   while(1)  
   {
       printf("\n1.push : insertion of element in stack");
       printf("\n2.pop : deletion of element in stack");
       printf("\n3.peek : show topmost emement from stack");
       printf("\n4.underflow : check whether the stack is empty");
       printf("\n5.overflow : check whether the stack is full");
       printf("\n6.display");
       printf("\n7.exit");
       
       printf("\n enter the choice");
       scanf("%d",&choice);
   
   
   
   switch(choice)
   {
        case 1:
    
       if (top==n-1)
       {
           printf("\n overflow!!");
       }
       else
       {
           printf("\n enter the element to the stack");
           scanf("%d",&x);
           top++;
           stack[top]=x;
       }
       
        break;
        
        case 2:
        
        if(top=-1)
        {
        printf("\n underflow!!");
        
        }
        else
        {
            top--;
        }
        break;

        case 3:
        
        printf("\n show the top element,stack[top]");
        break;

        case 4:
        
        if(top==-1)
        {
            printf("\n underflow!!");
        }
        else
        {
            printf("\n not underflow!!");
        }
       
        break;
        
        case 5:
        
        if(top=n-1)
        {
            printf("\n overflow!!");
        }
       else
       {
           printf("\n not overflow!!");
       }
        break;
        
        case 6:
        
        for(i=top;i>=0;i--)
       {
           printf("%d\n",stack[i]);
       }
        break;
        
        case 7:
        exit(0);
        default:printf("\n invalid choice!");
       
         break;
   } // end of switch case
       
   } // end of while loop
 

     return 0;
}