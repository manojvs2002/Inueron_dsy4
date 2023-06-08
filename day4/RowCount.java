package day4;

public class RowCount {
	
	static int count(int n) {
		int rowcount=0;
		int coinsneeded=1;
		
		while(n>=coinsneeded) {
			n-=coinsneeded;
			rowcount++;
			coinsneeded++;
			
		}
		return rowcount;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10;
		int res=count(n);
		System.out.println(res);
	}

}
