class Solution {
    int minDist(int a[], int n, int x, int y) {
        	int min=Integer.MAX_VALUE,max=Integer.MAX_VALUE,minpath=Integer.MAX_VALUE;
	    int path=Integer.MAX_VALUE-1;
	   for(int i=0;i<n;i++)
	   {
	       if(a[i]==x)
	       min=i;
	       if(a[i]==y)
	       max=i;
	       if(min>max)
	       path=min-max;
	       	if(min<max)
	       path=max-min;
	       minpath=Math.min(path,minpath);
	       }

	       if(minpath<n)
        return minpath;
        else
        return -1;
	}

    }
