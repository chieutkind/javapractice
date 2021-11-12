package singleton;

public class BusinessLogic {
	//1. �����ڸ� private�� ���� - �ܺο����� instance ���� ����
	private BusinessLogic() {}
	
	//2. �ڽ��� Ŭ���� Ÿ������ static ������ ����
	private static BusinessLogic obj;
	
	//3. static ������ null�϶� �ν��Ͻ��� �����ϴ� static �޼��带 ����
	public static BusinessLogic sharedInstance() {
		if(obj==null) {
			obj = new BusinessLogic();
		}
		return obj;
	}	
}
