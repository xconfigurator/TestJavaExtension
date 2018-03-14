package cn.edu.hebau.liuyang.singleton;

/**
 * 单例——懒汉模式
 * 
 * @author liuyang
 *
 */
public class Singleton02 {
	
	// 2. 创建唯一实例。
	private static Singleton02 instance;
	
	// 1. 构造方法私有化，不允许外部直接使用new创建对象。
	private Singleton02() {}
	
	// 3. 提供静态访问器。
	public static Singleton02 getInstance() {
		if (instance == null) {
			instance = new Singleton02();// 懒汉：用户调用的时候再创建。
		}
		return instance;
	}

	public static void main(String[] args) {
		Singleton02 s1 = Singleton02.getInstance();
		Singleton02 s2 = Singleton02.getInstance();
		System.out.println(s1 == s2);
	}

}
