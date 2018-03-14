package cn.edu.hebau.liuyang.singleton;

/**
 * 单例——饿汉模式
 * 
 * @author liuyang
 *
 */
public class Singleton01 {
	
	// 2. 创建唯一实例。
	private static Singleton01 instance = new Singleton01();// 饿汉：类加载的时候就会初始化实例
	
	// 1. 构造方法私有化，不允许外部直接使用new创建对象。
	private Singleton01() {}
	
	// 3. 提供静态访问器。
	public static Singleton01 getInstance() {
		return instance;
	}

	public static void main(String[] args) {
		Singleton01 s1 = Singleton01.getInstance();
		Singleton01 s2 = Singleton01.getInstance();
		System.out.println(s1 == s2);
	}

}
