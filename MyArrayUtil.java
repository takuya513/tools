package tools;
/*
 * ソート実験のに配列の操作のために使う道具
 */

public class MyArrayUtil extends ArrayUtil{

	public static <E extends Comparable> void print(E[] a){
		for(E e : a)
			((MyData)e).print();
		System.out.println();
	}

	public static <E extends Comparable> void print(E[] a,int num){
		System.out.print("array["+ num +"] : ");
		((MyData)a[num]).print();
		System.out.println();
	}

	public static <E extends Comparable> void print(E[] a,int left,int right){
		for(int i = left;i <= right;i++)
			((MyData)a[i]).print();
		System.out.println();
	}

	public static<E extends Comparable> boolean checker(E[] a){
		int i;
		for( i = 0;i < a.length-1;i++){
			if(a[i].compareTo(a[i+1]) <= 0);
			else{
				return false;
			}

		}
		if(i == a.length-1){
			return true;
			
		}
		
		return false;
	}
}
