package tools;

public class MyDouble implements Comparable,MyData{
	private double data;
	public MyDouble(double data2){
		this.data = data2;
	}
	public double getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public void print(){
		System.out.print(" " + data);
	}

	public int compareTo(Object anotherData){
		if(this.data < ((MyDouble)anotherData).data)
			return -1;
		else if(this.data == ((MyDouble)anotherData).data)
			return 0;
		else
			return 1;
	}
}
