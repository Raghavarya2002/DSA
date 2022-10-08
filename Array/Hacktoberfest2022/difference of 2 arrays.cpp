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
        Scanner sc =  java.util.Scanner(java.io.BufferedInputStream@3b95a09c);
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
        std::vector<int> diff(n2);
        int i = arr1.size() - 1;
        int j = arr2.size() - 1;
        int k = diff.size() - 1;
        int c = 0;
        while (k >= 0)
        {
            int d = 0;
            int arr1v = ((i >= 0) ? arr1[i] : 0);
            if (arr2[j] + c > arr1v)
            {
                d = arr2[j] + c - arr1v;
                c = 0;
            }
            else 
            {
                d = arr2[j] + c + 10 - arr1v;
                c = -1;
            }
            diff[k] = d;
            i--;
            j--;
            k--;
        }
        int index = 0;
        while (index < diff.size())
        {
            if (diff[index] == 0)
            {
                index++;
            }
            else 
            {
                break;
            }
        }
        while (index < diff.size())
        {
            std::cout << diff[index] << std::endl;
            index++;
        }
    }
};
int main(int argc, char **argv){
	std::vector<std::string> parameter(argv + 1, argv + argc);
	Main::main(parameter); 
	return 0;
};
