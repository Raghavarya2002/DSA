
#include <iostream>
using namespace std;
class binarySearch{
    private:
        int elementToSearch;
        int *array;
        int *arrayLength;
    public:
        binarySearch(int *arr , int *arrayl , int elemToSearch)
        {
            array = arr;
            arrayLength = arrayl;
            elementToSearch = elemToSearch;
        }
        binarySearch(){}

        int binarysearchIterMethod()
        {
            int low = 0;
            int high = *arrayLength - 1;
            while((high -low) > 1)
            {
                int mid = (low+high)/2;
                if(*(array + mid) > elementToSearch)
                {
                    high = mid-1;
                }
                else{
                    low = mid + 1;
                }
            }
            if(*(array+low) == elementToSearch)
            {
                return low;
            }
            else if (*(array+high) == elementToSearch)
            {
                return high;
            }
            else{
                return -1;
            }
        }

        int* getArray(){
            return array;
        };
        int setArray(int *arr ){
            array = arr;
        };
        int* getElementToSearch(){
            return &elementToSearch;
        };
        int setElementToSearch(int elem ){
            elementToSearch = elem;
        };
        int * getArrayLength(){
            return arrayLength;
        };
        void setArraylength(int * length)
        {
            arrayLength = length;
        };
        void printArray(){
            for(int i = 0; i < 10; i++){
                cout << array[i] << " ";
            }
            cout << endl;
        };
        void funcDef()
        {
            std::cout << "This Function uses Binary search to search for a element in an array" << std::endl;
        };
};