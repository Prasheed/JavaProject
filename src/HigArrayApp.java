
public class HigArrayApp {
	public static void main(String[] args){
		HighArray a = new HighArray(100);
		for(int i=0;i<8;i++){
			a.insert(misc.getRandom(0, 500));
		}
		a.show();
		a.sortInsert();
		a.show();
		System.out.println(a.media());
		/*System.out.println("Макимальное число массива\n"+a.getMax());
		System.out.println("Минмальное число массива\n"+a.getMin());
		System.out.println("Среднее арифметическое\n"+a.getAvarage());
		a.showEven();
		a.showOdd();
		a.showPow2();
		a.fastFind(20);*/
	}
}
