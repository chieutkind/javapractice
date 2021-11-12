package polymorphism;

public class Main {

	public static void main(String[] args) {
		//2개의 클래스에 존재하는 메서드를 호출
		ProgressiveWeb browser = new MobileBrowser();
		browser.nextPage();
		
		browser = new PCBrowser();
		browser.nextPage();
		
		//현재는 아래 문장이 가능
		//추상 클래스나 인터페이스를 이용하면 아래 문장은 에러
		//browser = new ProgressiveWeb();
		//browser.nextPage();

	}

}
