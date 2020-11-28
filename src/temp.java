import java.util.Scanner;


public class temp {
	static int count=0;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int first = in.nextInt();
		int second = in.nextInt();
		HighArray array = new HighArray(2);
		for(int i=first;i<=second;i++){
			count=0;
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					if(count>=2) {
						count=0;
						break;
					}
					array.insertSort(j);
					count++;
				}
			}
			if(count==2)array.show();
			array.clear();
		}
	}
}
