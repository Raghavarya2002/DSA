// Include header file
#include <iostream>
#include <string>
#include <vector>

class Main
{
    public:
    static void display(std::vector<int> &a)
    {
        StringBuilder sb =  java.lang.StringBuilder();
        for (auto val : a)
        {
            sb.append(std::to_string(val) + "\n");
        }
        std::cout << sb << std::endl;
    }
    // my code
    static std::vector<int> inverse(std::vector<int> &a)
    {
        std::vector<int> arr(a.size());
        int i = 0;
        while (i < a.size())
        {
            int v = a[i];
            arr[v] = i;
            i++;
        }
        return arr;
    }
    // mycode end
    static void main(std::vector<std::string> &args) throws Exception
    {
        BufferedReader br =  java.io.BufferedReader( java.io.InputStreamReader(java.io.BufferedInputStream@4629104a));
        int n = stoi(br.readLine());
        std::vector<int> a(n);
        for (int i = 0; i < n; i++)
        {
            a[i] = stoi(br.readLine());
        }
        std::vector<int> inv = Main::inverse(a);
        Main::display(inv);
    }
};
int main(int argc, char **argv){
	std::vector<std::string> parameter(argv + 1, argv + argc);
	Main::main(parameter); 
	return 0;
};
