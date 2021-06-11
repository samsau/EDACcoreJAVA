package motifworks.code;

public class Singleton {
	public static void main(String[] args) {
		UserDao obj1 = UserDao.getInstance();
		System.out.println(obj1.hashCode());
		UserDao obj2 = UserDao.getInstance();
		System.out.println(obj2.hashCode());
	}
}
