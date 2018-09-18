package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void hasDuplicates_test1() {
		
		int[] arr = {1,2,3,4,5};
		LatinSquare lq =new LatinSquare();
		
		assertFalse(lq.hasDuplicates(arr));
		
	}



	@Test
	public void hasDuplicates_test2() {
	
		int[] arr = {1,1,3,4,5};
		LatinSquare lq =new LatinSquare();
	
		assertTrue(lq.hasDuplicates(arr));
	
	}


	@Test
	public void hasDuplicates_test3() {
	
		int[] arr = {1,3,4,5,1};
		LatinSquare lq =new LatinSquare();
	
		assertTrue(lq.hasDuplicates(arr));
	
	}

	@Test
	public void hasDuplicates_test4() {
	
		int[] arr = null;
		LatinSquare lq =new LatinSquare();
	
		assertFalse(lq.hasDuplicates(arr));
	
	}
	
	@Test
	public void doesElementExist_test1() {
	
		int[] arr = {1,2,3,4,5};
		int iValue= 6;
		LatinSquare lq =new LatinSquare();
	
		assertFalse(lq.doesElementExist(arr, iValue));
	
}

	@Test
	public void ContainsZeroTest1()
	{
		int[][] mySquare= {{1,2,3},{3,0,1},{2,3,1}};
		LatinSquare ls= new LatinSquare(mySquare);
		assertTrue(ls.ContainsZero());
	}

@Test
public void hasAllValuesTest1()
{
	int[] arr1= null;
	int[] arr2= null;
	LatinSquare ls= new LatinSquare();
	assertFalse(ls.hasAllValues(arr1,arr2));
}
}

