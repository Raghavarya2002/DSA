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
        Scanner sc =  java.util.Scanner(java.io.BufferedInputStream@5b80350b);
        int n1 = Settlement::input<int>();
        std::vector<int> arr1(n1);
        for (int i = 0; i < arr1.size(); i++)
        {
            arr1[i] = Settlement::input<int>();
        }
        int n2 = Settlement::input<int>();
        std::vector<int> arr2(n2);
        for (int i = 0; i < arr2.size(); i++)
        {
            arr2[i] = Settlement::input<int>();
        }
        std::vector<int> sum(((n1 > n2) ? n1 : n2));
        int i = arr1.size() - 1;
        int j = arr2.size() - 1;
        int k = sum.size() - 1;
        int c = 0;
        while (k >= 0)
        {
            int d = c;
            if (i >= 0)
            {
                d += arr1[i];
            }
            if (j >= 0)
            {
                d += arr2[j];
            }
            c = d / 10;
            d = d % 10;
            sum[k] = d;
            i--;
            j--;
            k--;
        }
        if (c != 0)
        {
            std::cout << c << std::endl;
        }
        for (auto val : sum)
        {
            std::cout << val << std::endl;
        }
    }
};
int main(int argc, char **argv){
	std::vector<std::string> parameter(argv + 1, argv + argc);
	Main::main(parameter); 
	return 0;
};
