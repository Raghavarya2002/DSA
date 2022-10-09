class fest {

static void update(int arr[], int l, int r, int val)
{
	arr[l] += val;
	if(r + 1 < arr.length)
	arr[r+1] -= val;
}

static int getElement(int arr[], int i)
{
	int res = 0;
	for (int j = 0 ; j <= i; j++)
		res += arr[j];

	return res;
}

public static void main(String[] args)
{
	int arr[] = {0, 0, 0, 0, 0};
	int n = arr.length;

	int l = 2, r = 4, val = 2;
	update(arr, l, r, val);

	int index = 4;
	System.out.println("Element at index " + index + " is " +getElement(arr, index));

	l = 0;
	r = 3;
	val = 4;
	update(arr,l,r,val);

	index = 3;
	System.out.println("Element at index " + index + " is " +getElement(arr, index));

}
}
