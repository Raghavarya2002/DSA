// Include header file
#include <iostream>
#include <string>
#include <vector>
/* This class are provide by kalkicode.com (java to c++) */

class Settlement {
	public:
	// returns a value of standard input in c++
	template < typename T > static T input() {
		T value;
		std::cin >> value;
		return value;
	}
};
class Main
{
    public:
    static void main(std::vector<std::string> &args) throws Exception
    {
        Scanner sc =  java.util.Scanner(java.io.BufferedInputStream@17d10166);
        int m1 = Settlement::input<int>();
        int n1 = Settlement::input<int>();
        std::vector<std::vector<int>> arr1(m1,std::vector<int>(n1));
        for (int i = 0; i < m1; i++)
        {
            for (int j = 0; j < n1; j++)
            {
                arr1[i][j] = Settlement::input<int>();
            }
        }
        int m2 = Settlement::input<int>();
        int n2 = Settlement::input<int>();
        std::vector<std::vector<int>> arr2(m2,std::vector<int>(n2));
        for (int i = 0; i < m2; i++)
        {
            for (int j = 0; j < n2; j++)
            {
                arr2[i][j] = Settlement::input<int>();
            }
        }
        if (n1 != m2)
        {
            std::cout << "Invalid Input" << std::endl;
            return;
        }
        // new matrix will be of size  2*4 = m1*n2
        std::vector<std::vector<int>> arr3(m1,std::vector<int>(n2));
        for (int i = 0; i < m1; i++)
        {
            for (int j = 0; j < n2; j++)
            {
                for (int k = 0; k < m1; k++)
                {
                    // matrix1 - 2*3 , matrix2- 3*4 , k = m1 or n2 , because r1 c2 , r2 c1 , for multiplication of matrix c2=r2 like 3 in above example
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        for (int i = 0; i < m1; i++)
        {
            for (int j = 0; j < n2; j++)
            {
                std::cout << std::to_string(arr3[i][j]) + " ";
            }
            std::cout << std::endl;
        }
    }
};
int main(int argc, char **argv){
	std::vector<std::string> parameter(argv + 1, argv + argc);
	Main::main(parameter); 
	return 0;
};
