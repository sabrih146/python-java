#include <iostream>
#include <fstream>
#include <string>
#include <cmath>
using namespace std;


int main()
{
	ofstream myfile;
	double surface_area;
	myfile.open("Text_surface_with_radius.txt");
	for (double height = 1; height < 24; height += 1)
	{

		surface_area = 710/height + 6.28* pow(height, 2);
		myfile << height << " " << surface_area << "\n";
	}
	myfile.close();

}
