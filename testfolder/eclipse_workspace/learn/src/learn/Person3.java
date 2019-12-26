/**
 * Day06 Page01
 * Person3 类
 */
package learn;

public class Person3 {
	
	/**
	 * 用数组的方式来传递可变个数的参数
	 * 如果没有参数就要定义一个空数组或null
	 * @param args
	 */
	
	public void printInfo(String [] args) {//问题，能够打印的信息都来源于方法的参数，即形参的传递
	//如果想要给方法传递不同的参数？事先不确定有多少个参数
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
			
		}
	}
	
	/**
	 * 此处有问题，待解决（Syntax error on token "...", . expected） -> 解决： String和...之间记得要有空格，否则会报错
	 * 用Java特有的方式传递可变个数的参数，这种参数在使用时与数组的使用方式相同
	 * 没有参数可以不填
	 * ... 代表可以传递0 - 多个参数
	 * 如果有多个形参，可变的要放在最后
	 * @param args
	 */
	public void printInfo1(String ... args) {
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
	
	public void test(int ... i) {
		
	}

}
