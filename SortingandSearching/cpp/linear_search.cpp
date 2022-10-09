#include <iostream>
using namespace std;

class linearSearch{
    private:
        int elementToSearch;
        int *array;
        int *arrayLength;
    public:
        /*
        * Default Constructor 
        * @param int* arr Pointer to the Array
        * @param int* arrlen Pointer to length of array
        * @param int searchElem Element to search in array
        * @return Void
        */
        linearSearch(int* arr , int* arrlen , int searchElem)
        {
            array = arr;
            arrayLength = arrlen;
            elementToSearch = searchElem;
        }
        /*
        * Returns the pointer to array
        * @return array(int *) Return the pointer to array
        */
        int* getArray()
        {
            return array;
        }
        /*
        * Returns the length of array
        * @return length(int *) Return the array length as pointer
        */
        int* getArrLen()
        {
            return arrayLength;
        }
        int* search(int* len = new int(0))
        {
            int* arr = (int*)(malloc(sizeof(int)*(*arrayLength)));
            for(int i = 0 ;i< *arrayLength ; i++)
            {
                if(elementToSearch == array[i])
                {
                    arr[*len] = i;
                    *len = *len + 1;
                }
            }
            return arr;
        }
};