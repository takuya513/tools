package tools;
import java.util.Random;
import java.util.Scanner;

/*
 * ソート実験の配列を生成、制御するクラス
 */
public class ArrayUtil {

	public static int[] randomIntArray(int length){
		int[] a = new int[length];
		Scanner sc = new Scanner(System.in);
		//System.out.println("Input range of Intenger 0 ~ n: ");
		//System.out.print("n : ");
		//int n = sc.nextInt();
		int n = 10000000;
		for(int i = 0; i < a.length;i++)
			a[i] = generator.nextInt(n);

		return a;
	}

	public static int[] myIntArray(int length){
		int a[] = new int[length];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < a.length;i++){
			System.out.print("Input Integer Number : ");
			a[i] = sc.nextInt();
		}

		return a;
	}

	public static double[] randomDoubleArray(int length){
		double[] a = new double[length];
		Scanner sc = new Scanner(System.in);
		System.out.println("Input range of Intenger 0 ~ n: ");
		System.out.print("n : ");
		long n = sc.nextLong();
		for(int i = 0; i < a.length;i++)
			a[i] = n * generator.nextDouble();

		return a;
	}

	public static double[] myDoubleArray(int length){
		double[] a = new double[length];

		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < a.length;i++){
			System.out.print("Input Integer Number : ");
			a[i] = sc.nextInt();
		}

		return a;
	}


	private static Random generator = new Random();
}