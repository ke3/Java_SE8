//*****************************//
//   ファイル名 :Ex1_2.java    //
//   課題番号   :1_2           //
//   作成者     :大友          //
//   番号       :8             //
//   日付       :2020-10-2     //
//*****************************//
class Ex1_2
{
	public static void main(String[] args){
		long idata=0b00000000_00000000_00000000_00000001L;
		
		System.out.println("*** 2のべき乗計算 ***\nべき乗     結果");		
		for(int i=0; i<33; i++){
			System.out.printf("%3d%15d\n",i,idata);
			idata=idata<<1;
		}
	}
}
/*実行結果
  0              1
  1              2
  2              4
  3              8
  4             16
  5             32
  6             64
  7            128
  8            256
  9            512
 10           1024
 11           2048
 12           4096
 13           8192
 14          16384
 15          32768
 16          65536
 17         131072
 18         262144
 19         524288
 20        1048576
 21        2097152
 22        4194304
 23        8388608
 24       16777216
 25       33554432
 26       67108864
 27      134217728
 28      268435456
 29      536870912
 30     1073741824
 31     2147483648
 32     4294967296
*/