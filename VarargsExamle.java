public class VarargsExample{

public static int sum(int ...numbers){
	int result=0;
	for(int num:numbers){
	result+=num;
		}
	return result;
	}

public static void main(String[] args){
	int sum1=sum(1,2,3,4,5);
	System.out.println("The sum of 1,2,3,4,5 is:" + sum1);
	
	int sum2=sum(10,20,30);
	System.out.println("The sum of 10,20,30 is :" + sum2);
	
	int sum3=sum();
	System.out.println("The sum with no arguments is:" + sum3);
	
	}


}
