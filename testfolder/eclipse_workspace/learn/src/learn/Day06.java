package learn;

public class Day06 {
//	public static void main(String[] args) {
//		Person3 p3 = new Person3();
//		String[] s = new String[] {"Vickie", "23"};
//		p3.printInfo(s);
//		String[] s1 = new String[] {"Shanghai", "1111111"};
//		p3.printInfo(s1);
//		
//		p3.printInfo1("Felix", "30", "female");
//		
//		String[] s2 = new String[] {"Beijing", "12311111"};
//		p3.printInfo1(s2);
//		p3.printInfo1();
//		p3.printInfo(null);
//
//    }
//		public static void swap(int i){
//			i = 6;//i = 6,把 i 在栈中的值改成6，最终 i 在栈中的值就是6
//			System.out.println("swap方法里，i的值是" + i);//总之，基本数据类型在参数传递过程中，就是把实参的值复制到形参上。
//		}
//		public static void main(String[] args) {
//			int a = 0;//先执行的int a = 0，在栈中开辟了一块内存，地址假设是AD8500,存的值是0
//			swap(a);//调用swap方法，执行int i部分，在栈中开辟一块内存，地址是AD8600，值为a赋给的0；执行swap方法体
//			System.out.println("main方法中，变量a的值是" + a);
//	    }
		
	public static void swap(DataSwap ds1) {//ds,ds1其实都是指向了同一个对象，即堆内存中地址是BE2500的DataSwap（）对象。ds,ds1都是引用对象，存的是对象实际在堆中的地址。堆中是对象实际存储的地方。
		ds1.a = 6;
		System.out.println("在swap方法中，ds1.a的值是： "+ ds1.a);
	}
	
	public static void main(String[] args) {
		DataSwap ds = new DataSwap();//先在堆内存中存了DataSwap（）对象，地址假设为BE2500，ds为引用对象，存到栈中，地址为AD9500，值为new DataSwap()对象在堆中的地址：BE2500 
		System.out.println("调用swap方法前，ds.a的值是： "+ ds.a);
		swap(ds);//调用swap方法，给ds1引用对象保存到栈中，地址是AD9600，存的值来源于实参ds，即ds的栈中存的值，即new DataSwap()对象在堆中的地址：BE2500
		System.out.println("调用swap方法后，ds.a的值是： "+ ds.a);
		
		//此例中，最终结果ds、ds1操作实际是同一个对象
	}
		
}


	
