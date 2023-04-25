
#include<iostream.h>
using namespace std;
class temp{
char x[10];
public:
temp(){}
temp(char a){x[0]=a;}
void left(char a ,int y){x[(y*2)+1]=a;}
void right(char a ,int y){x[(y*2)+2]=a;}
void display(){for(int i=0;i<10;i++)if(x[i]!='\0')cout<<x[i]<<endl; }
};
int main()
{
clrscr();
temp p('A');
p.left('B',0);
p.right('C',0);
p.left('D',1);
p.right('E',1);
p.right('F',2);
p.display();
return 0;
}
