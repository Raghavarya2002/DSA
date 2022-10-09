class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        
        int len = a.length + b.length;
        
        int aIndex = 0;  // Iterator for nums1 array
        int bIndex = 0;  // Iterator for nums2 array
        
        int previous = 0;           // for even case
        int current = 0;            // for odd and even case
        int resultIndex = 0;        // merged sorted array Index 
        
        while(resultIndex++ <= (len / 2)) {     // LOOP UP TO (M + N) / 2
            
            previous = current;          // assign current value to previous

            if(aIndex >= a.length) {     // if aIndex >= a length then only use b;
                current = b[bIndex++];   // update current value and increment bIndex;
                continue;                
            } 
            
            if(bIndex >= b.length ) {    // similar as above,for bIndex
                current = a[aIndex++];
                continue;
            } 
            
            if(a[aIndex] < b[bIndex]) {  // marge method;
                current = a[aIndex++];
            } else {
                current = b[bIndex++];
            }
        }
        
        if(len % 2 == 0) {   
            return (double) (previous  + current)/2;   // if len is even
        } else {
            return (double) current;                   // if len is odd
        }
    }
}