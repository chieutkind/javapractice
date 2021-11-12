package singleton;

public class Main {
	public static void main(String[] args) {
		BusinessLogic obj1 = new BusinessLogic();
		BusinessLogic obj2 = new BusinessLogic();
		
		BusinessLogic obj3 = obj1;
				
		System.out.println(obj1 == obj2);
		System.out.println(obj1 == obj3);
		
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		System.out.println(System.identityHashCode(obj2));

	}

}
