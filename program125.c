#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *next;
};
typedef struct node NODE;
typedef struct node* PNODE;
typedef struct node** PPNODE;

//void InsertLast()
void Enqueue (PPNODE Head, int no)
{
    PNODE newn=NULL;
    PNODE temp=*Head;
    newn=(PNODE)malloc(sizeof(NODE));
    newn->data=no;
    newn->next=NULL;

    if(*Head==NULL)
    {
        *Head=newn;
    }
    else 
    {
        while(temp->next!=NULL)
        {
            temp=temp->next;
        }
        temp->next=newn;
    }
}
int Dequeue(PPNODE Head)
{
    int value=0;
    PNODE temp=*Head;
    if(*Head == NULL)
    {
        printf("Queue is empty");
    }
    else
    {
        value=(*Head)->data;
        *Head=(*Head)->next;
        free(temp);
    }
    return value;
}
void Display(PNODE Head)
{
    printf("Elements of queue are: \n");
    while(Head != NULL)
    {
        printf("|%d|\n",Head->data);
        Head=Head->next;
    }
}
int main()
{
    PNODE first=NULL;
    int iRet=0;

    Enqueue(&first,11);
    Enqueue(&first,21);
    Enqueue(&first,51);
    Enqueue(&first,111);
    

    Display(first);
    iRet=Dequeue(&first);
    printf("Popped element is %d\n",iRet);

    iRet=Dequeue(&first);
    printf("Popped element is %d\n",iRet);

    

}