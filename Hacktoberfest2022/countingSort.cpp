#include <iostream>
#include <vector>

using namespace std ;

void countingSort(vector<int> &arr) ;

int main()
{
	vector<int> arr = {9,8,7,6,5,0,10,15,13,12,10,2,2,2,2,4,3,2,1,1} ;
	countingSort(arr) ;
	for(int k: arr) {
				cout << k << " " ;
		}
	return 0;
}

void countingSort(vector<int> &arr) {
		int max = 0 ;
		for(int i: arr) {
				if(max<i)
					max = i ;
		}

		vector<int> nextArray(max+1,0) ;

		for(int i: arr) {
			nextArray[i]++ ;
		}

		int i = 0 ;
		int j = 0 ;
		while(i <= max){
			if(nextArray[i]!=0){
				arr[j++] = i ;
				nextArray[i]-- ;
			}
			else i++ ;
		}
}
