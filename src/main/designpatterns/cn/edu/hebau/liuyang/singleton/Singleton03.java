package cn.edu.hebau.liuyang.singleton;

import java.util.Arrays;

/**
 * 单例——线程安全版本
 * 
 * @author liuyang
 *
 */
public class Singleton03 {

	// 2. 创建唯一实例。
	// private static Singleton03 instance;
	private static class Inner {
		private static Singleton03 instance = new Singleton03();
	}

	// 1. 构造方法私有化，不允许外部直接使用new创建对象。
	private Singleton03() {
	}

	// 3. 提供静态访问器。
	public static Singleton03 getInstance() {
		return Inner.instance;
	}

	// 测试1
//	public static void main(String[] args) {
//		Singleton03 s1 = Singleton03.getInstance();
//		Singleton03 s2 = Singleton03.getInstance();
//		System.out.println(s1 == s2);
//	}
	
	// 测试2
	public static void main(String[] args) {
		Thread[] threads = new Thread[200];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(() -> {
				Singleton03.getInstance();
			}) ;
		}
		
		Arrays.asList(threads).forEach(o -> o.start());
	}

}
