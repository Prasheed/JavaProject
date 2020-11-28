
public class HighArray {
	private int[] a;
	private int nElements;
	public HighArray(int max){
		a = new int[max];
		nElements = 0;
	}
	public boolean find(int search){////////////////////////////////////////
		int i;
		for(i=0;i<nElements;i++){
			if(a[i]==search) return true;
		}
		if(i==nElements) return false;
		else return false;
	}
	public void insert(int value){////////////////////////////////
		a[nElements++]=value;
	}
	public void show(){/////////////////////////////
		//System.out.println("Массив:");
		for(int i=0;i<nElements;i++){
			if(i==nElements-1) System.out.println(a[i]+" ");
			else System.out.print(a[i]+" ");
		}
	}
	public void delete(int value){//////////////////////////////////////
		int j;
		for(j=0;j<nElements;j++){		
			if(a[j]==value) break;
		}
		for(int i=j;i<nElements;i++){
			a[i]=a[i+1];
		}
	}
	public void showByIndex(int index) {//////////////////////////////////
		System.out.println(a[index]);
	}
	public int getMax(){///////////////////////
		int result = a[0];
		for(int i=0;i<nElements;i++){
			if (result<a[i]){
				result = a[i];
			}
		}
		return result;
	}
	public int getMin(){///////////////////////
		int result = a[0];
		for(int i=0;i<nElements;i++){
			if (result>a[i]){
				result = a[i];
			}
		}
		return result;
	}
	public float getAvarage(){////////////////////////////////////////
		int sum=0;
		for(int i=0;i<nElements;i++){
			sum = sum + a[i];
		}
		return sum/nElements;
	}
	public void showEven(){
		int local;
		System.out.println("Чётные числа массива:");
		for(int i=0;i<nElements;i++){
			local=a[i]%2;
			if(local==0){
				System.out.println(a[i]);
			}
		}
	}
	public void showOdd(){/////////////////////////////
		int local;
		System.out.println("Нечётные числа массива:");
		for(int i=0;i<nElements;i++){
			local=a[i]%2;
			if(local!=0){
				System.out.println(a[i]);
			}
		}
	}
	public void showPow2(){//////////////////////////////////////////
		int local;
		System.out.println("Числа массива, являющиеся степенью двойки:");
		for(int i=0;i<nElements;i++){
			local = a[i]&a[i]-1;
			if(local==0) System.out.println(a[i]);
		}
	}
	public void fastFind(int value){//////////////////////////////////
		int curr;
		int lower = 0;
		int upper = nElements-1;
		while(upper>=lower){
			curr = (upper+lower)/2;
			if(a[curr]==value){
				System.out.println(a[curr]+" Число найдено!");
				break;
			}
			if(a[curr]>value) upper = curr-1;
			else lower = curr+1;
		}
	}
	public void insertSort(int value){///////////////////////////////
		int i;
		for(i=0;i<nElements;i++){
			if(value<a[i]) break;
		}
		for(int j=nElements;j>i;j--){
			a[j]=a[j-1];
		}
		a[i]=value;
		nElements++;
	}
	public int removeMax(){///////////////////////////////////////////////////////
		int res = a[nElements-1];
		a[nElements]=0;
		nElements--;
		return res;
	}
	public void sortBubble(){
		for(int i=nElements-1;i>1;i--){
			for(int j=0;j<i;j++){
				if(a[j]>a[j+1]) swap(j,j+1);
			}
		}
	}
	public void sortSelect(){//////////////////////////////////////////////////////
		for(int i = 0;i<nElements-1;i++){
			for(int j =i+1;j<nElements;j++){
				if(a[i]>a[j]) swap(i,j);
			}
		}
	}
	public void sortInsert(){
		for(int i = 1;i<nElements;i++){
			int in = i;
			int temp=a[in];
			while(in>0&&a[in-1]>=temp){
				a[in]=a[in-1];
				in--;
			}
			a[in]=temp;
		}
	}
	private void swap(int i, int b) {
		int temp;
		temp = a[i];
		a[i]=a[b];
		a[b]=temp;
	}
	public void clear(){
		for(int i = 0;i<nElements;i++){
			a[i]=0;
		}
		nElements=0;
	}
	public int media(){
		if(nElements%2!=0){
			return a[nElements/2];
		}else{
			return (a[nElements/2]+a[nElements/2-1])/2;
		}
	}
}
