#include<stdio.h>
#include<conio.h>
#include<iostream.h>
class temp{
public:
int data;
temp *next;
};
temp *start,*p;
int top=-1;
void push(int);
void pop();
void display();
void main(){
clrscr();

start=new temp;
p=start;
p=NULL;
push(53);
push(34);
push(12);
push(72);
display();
getch();
pop();
display();
getch();
}
void push(int n)
{

p=start;
if(p==NULL)
{
p->data=n;
p->next=NULL;
top++;
}
else
{
while(p->next!=NULL)
p=p->next;

p->next=new temp;
p->data=n;
p=p->next;
p->next=NULL;
top++;
}
}
void display()
{
p=start;
while(p->next!=NULL)
{
cout<<p->data<<endl;

p=p->next ;

}

}
void pop()
{
temp *r;
p=start;
r=NULL;
while(p->next!=NULL)
{
r=p;
p=p->next;
}
r->next=NULL;
delete p;
}

