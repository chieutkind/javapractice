package membermanagement;

public class Main {
	
	public static void main(String[] args) {
		Template t = new TemplateImpl();
		t.method();
		
		new Template() {

			@Override
			public void method() {
				System.out.println("�͸� ��ü�� �̿��� �������̽� ���")
				
			}	
		}.method();
	}

}
