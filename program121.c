#include<stdio.h>
#include<stdlib.h>
typedef struct node
{
    int data;
    struct node *next;
}NODE, *PNODE, **PPNODE;

void InsertFirst(PPNODE Head, PPNODE Tail, int no)
{
    PNODE newn=NULL;
    newn=(PNODE)malloc(sizeof(NODE));
    newn->data=no;
    newn->next=NULL;

    if(*Head==NULL && *Tail==NULL)
    {
        *Head=newn;
        *Tail=newn;
        (*Tail)->next=*Head;
    }
    else
    {
        newn->next=*Head;
        *Head=newn;
        (*Tail)->next=*Head;
    }
}

void InsertLast(PPNODE Head, PPNODE Tail, int no)
{
    PNODE newn=NULL;
    newn=(PNODE)malloc(sizeof(NODE));
    newn->data=no;
    newn->next=NULL;

    if(*Head==NULL && *Tail==NULL)
    {
        *Head=newn;
        *Tail=newn;
        (*Tail)->next=*Head;
    }
    else
    {

    }
}

void InsertAtPos(PPNODE Head, PPNODE Tail, int no,int ipos)
{}

void DeleteFirst(PPNODE Head, PPNODE Tail)
{}

void DeleteLast(PPNODE Head, PPNODE Tail)
{}

void DeleteAtPos(PPNODE Head, PPNODE Tail, int ipos)
{}

void Display(PNODE Head, PNODE Tail)
{}

int Count(PNODE Head, PNODE Tail)
{}

int main()
{
    PNODE First=NULL;
    PNODE Last=NULL;

    return 0;
}