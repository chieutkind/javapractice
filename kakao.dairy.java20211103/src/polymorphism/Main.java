package polymorphism;

public class Main {

	public static void main(String[] args) {
		//2���� Ŭ������ �����ϴ� �޼��带 ȣ��
		ProgressiveWeb browser = new MobileBrowser();
		browser.nextPage();
		
		browser = new PCBrowser();
		browser.nextPage();
		
		//����� �Ʒ� ������ ����
		//�߻� Ŭ������ �������̽��� �̿��ϸ� �Ʒ� ������ ����
		//browser = new ProgressiveWeb();
		//browser.nextPage();

	}

}
