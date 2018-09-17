package pkgHelper;

import java.util.Arrays;

public class LatinSquare {

	private int[][] LatinSquare;
	

	public LatinSquare()
	{
		
	}
	public LatinSquare(int[][] puzzle) {
		super();
		LatinSquare = puzzle;
	}
	public int[][] getLatinSquare() {
		return LatinSquare;
	}
	public void setLatinSquare(int[][] latinSquare) {
		LatinSquare = latinSquare;
	}
	
	public boolean hasDuplicates(int [] arr)
	{
		boolean hasDuplicates = false;
		if (arr == null)
			return false;
		
		Arrays.sort(arr);
		
		for (int i=0; i< arr.length-1; i++)
		{
			if (arr[i]==arr[i+1])
			{
				hasDuplicates= true;
				break;
			}
		}
		
		
		
		return hasDuplicates;
	}
	public boolean doesElementExist(int[] arr,int iValue)
	{
		boolean doesElementExist= false;
		if (arr == null)
			return false;
		
		for (int i:arr)
		{
			if (i==iValue)
			{
				doesElementExist=true;
				break;
			}
		}
		
		return doesElementExist;
		
	}
	public boolean ContainsZero()
	{
		for ( int iCol=0; iCol < LatinSquare.length; iCol++)
		{
			for (int iRow=0; iRow < LatinSquare.length; iRow++)
			{
				if (LatinSquare[iCol][iRow]==0)
				{
					return true;
				}
			}
		}
		
		return false;
	}
	
	public boolean hasAllValues( int[] arr1, int[] arr2)
	{
		int totalEle=0;
		if (arr1 == null)
			return false;
		if (arr2 == null)
			return false;
		
		for (int i= 0; i< arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if (arr1[i]==arr2[j])
				{
					totalEle+=1;
					
					}
				}
			}
		if (totalEle == arr2.length)
		{
			return true;
		}
		return false;
		}
	
	}


