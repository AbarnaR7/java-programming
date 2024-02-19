  int nums[]={1,3};
  int target=3;
  int index=0;
    for(int i=0;i<nums.length-1;i++)
  {   

      if(target>nums[i]&&target<nums[i+1])
      {
          index=i+1;
      }
      else if(target>nums[nums.length-1])
      index=nums.length;
 }
 for(int i=0;i<nums.length;i++)
 {
                 if(nums[i]==target)
      {
          index=i;
      }

 }
System.out.print(index);
  }
	}
