package membermanagement;

public class Main {
	
	public static void main(String[] args) {
		Template t = new TemplateImpl();
		t.method();
		
		new Template() {

			@Override
			public void method() {
				System.out.println("익명 객체를 이용한 인터페이스 사용")
				
			}	
		}.method();
	}

}
