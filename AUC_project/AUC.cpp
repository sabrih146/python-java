#include <iostream>
#include <fstream>
using namespace std;

int main(int argc, char **argv)
{
double build, x, y, py, px, answer;
ifstream inData(argv[1]);
while(!inData.eof())
{
	inData >> x;
	inData >> y;
	
	build += (x - px) * (y + py);
	
	px = x;
	py = y;
	
}
cout << 1 - build; 
}


