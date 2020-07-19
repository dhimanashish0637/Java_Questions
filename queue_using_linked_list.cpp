#include<iostream>
using namespace std;
struct Node
{
    int num;
    Node *next;
}
*front=NULL,*rear=NULL;
void ins(int x)
{
    Node *temp=new Node;
    temp->num = x;
    temp->next = NULL;
   if(front == NULL)
      front = rear = temp;
   else
    {
      rear->next=temp;
      rear=temp;
    }
   cout<<x<<" is inserted"<<endl;
}
void del()
{
    if(front == NULL)
      cout<<"Queue Underflow"<<endl;
   else
    {
        Node *temp=front;
        front=front->next;
        cout<<temp->num<<" is deleted"<<endl;
        delete(temp);
   }
}
void display()
{
    if(front == NULL)
      cout<<"Queue Underflow"<<endl;
   else
    {
        Node *temp=front;
        while(temp->next!= NULL)
        {
            cout<<temp->num<<endl;
            temp=temp->next;
        }
        cout<<temp->num<<endl;
    }
}
int main()
{
    int ch,e;
    cout<<"Enter Choice : 1 for Enqueue : 2 for Dequeue : 3 for Display"<<endl;
    cin>>ch;
    while(ch)
    {
        switch(ch)
        {
        case 1:
            {
                cout<<"Enter Element :";
                cin>>e;
                ins(e);
                cin>>ch;
                break;
            }
        case 2:
            {
                cout<<"Deleted Element :";
                del();
                cin>>ch;
                break;
            }
        case 3:
            {
                cout<<"Elements in array :"<<endl;
                display();
                cin>>ch;
                break;
            }
        }
    }
    return 0;
}
