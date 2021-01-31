package pkex4;
class NumCheck
{
	public static boolean isZero(int num){
			boolean flg = false;
			if(num==0){
				flg=true;
			}
			return flg;
	}
	
	public static int compare(int num1,int num2){
		int num=0;
		
		if(num1 < num2){
			num = -1;
		}else if(num1 > num2){
			num = 1;
		}else if(num1 == num2){
			num = 0;
		}
		
		return num;
	}
}
