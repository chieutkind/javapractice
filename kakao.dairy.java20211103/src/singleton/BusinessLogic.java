package singleton;

public class BusinessLogic {
	//1. 생성자를 private로 생성 - 외부에서는 instance 생성 못함
	private BusinessLogic() {}
	
	//2. 자신의 클래스 타입으로 static 변수를 생성
	private static BusinessLogic obj;
	
	//3. static 변수가 null일때 인스턴스를 생성하는 static 메서드를 생성
	public static BusinessLogic sharedInstance() {
		if(obj==null) {
			obj = new BusinessLogic();
		}
		return obj;
	}	
}
