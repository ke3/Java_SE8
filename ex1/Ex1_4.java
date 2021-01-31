//*****************************//
//   ファイル名 :Ex1_4.java    //
//   課題番号   :1_4           //
//   作成者     :大友          //
//   番号       :8             //
//   日付       :2020-10-08    //
//*****************************//
import java.util.*;
	class Ex1_4{
		public static void main(String[] args){
			Random rd = new Random();
			int[] gs_dt = new int[20];
			int[] ks_dt = new int[20];
			int gcnt=0;
			int kcnt=0;
			for(int rcnt=0; rcnt<20; rcnt++){
				int su = rd.nextInt(1000)+1;
				if(su%2==0){
					gs_dt[gcnt]=su;
					gcnt++;
				}else{
					ks_dt[kcnt]=su;
					kcnt++;
				}
			}
			for(int i=0; i<gcnt; i++){
				System.out.printf(" %3d",gs_dt[i]);
			}
			System.out.printf("\n偶数：%d\n",gcnt);
			for(int i=0; i<kcnt; i++){
				System.out.printf(" %3d",ks_dt[i]);
			}
			System.out.printf("\n奇数：%d\n",kcnt);
		}
	}

/*実行結果
 964 890 588 886 382 226 560 802 778 462
偶数：10
 915  95 523 749 911 197 155 389 149 109
奇数：10

 654 736 508 308 156 506 640 868 774  66 778 318 416  22 690
偶数：15
 835 351 479 553 633
奇数：5

*/