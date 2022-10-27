class Solution {
   public int largestOverlap(int[][] img1, int[][] img2) {
	var n = img1.length;
	var maxOverlap = 0;

	for (var i = 1 - n; i < n; i++)
		for (var j = 1 - n; j < n; j++)
			maxOverlap = Math.max(maxOverlap, getOverlap(img1, img2, n, i, j));

	return maxOverlap;
}

private int getOverlap(int[][] img1, int[][] img2, int n, int i, int j) {
	var overlap = 0;

	for (var r = 0; r < n; r++)
		for (var c = 0; c < n; c++)
			if (Math.min(r + i, c + j) >= 0 
			 && Math.max(r + i, c + j) < n 
		 	 && Math.min(img1[r][c], img2[r + i][c + j]) == 1)
				overlap++;
	return overlap;
}
}
