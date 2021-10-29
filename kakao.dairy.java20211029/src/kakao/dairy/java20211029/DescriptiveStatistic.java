package kakao.dairy.java20211029;

public class DescriptiveStatistic {

	public static void main(String[] args) {
		// ���� ������ ����
		int [] data = {95, 80, 70, 87, 93};
		
		//1. �������� �հ� ���ϱ�
		//�հ踦 ������ ������ �����ϰ� �հ踦 ���ϱ� ������ ������ �ʱ�ȭ
		//�����͸� ��ȸ�ϸ鼭 �����͸� �հ踦 ������ ������ �߰�
		
		int data_sum = 0;
		for(int imsi : data) {
			data_sum=data_sum+imsi;
		}
		System.out.println("�հ�: "+data_sum);

		//2. ���, �߾Ӱ�, �ֺ� - �����͸� ��ǥ�ϴ� ��
		//����� ����� �� ������ ��
		//������ ���� 0���� Ȯ�� - ������ 0���� ������ ����
		//�Ǽ��� 0�� ������ Infinity�� NaN���� ���� ���ɴϴ�.
		
		//����/����=������� ���� ���
		//����� �Ҽ� ù°�ڸ����� ���ϱ�
		if(data.length==0) {
			System.out.println("�����Ͱ� ����");
		}else {
			//������ �� 1���� �Ǽ��� ��ȯ�ؾ߸� �Ǽ��� ����� ���� �� ����
			double mean = data_sum / (double)data.length;
			System.out.println("���: "+mean);
		}
		
		//���Ŀ� �ִ밪�� �ּҰ� ���ϴ� ���� �ϰ� ���� �ִ밪�� �ּҰ���
		//������ �������� ����� ���غ����� - ���� ���
		
		//�ִ밪�� ���� ���� �ִ밪�� ������ ������ ����
		//�������� ���� �� �ִ� ���� �� ���� ���� ���̳�
		//ù��° �������� ������ �ʱ�ȭ�� �մϴ�.
		
		//��� �����͸� ��ȸ�ϸ鼭 �ִ밪���� ū �����Ͱ� ������ �ִ밪��
		//�� ������ �����մϴ�.
		
		//�����ʹ� 0~100�� ������ ���´ٰ� ����
		int max_data = 0;
		//��� ������ ��ȸ
		for(int imsi : data) {
			//�����Ϳ� �ִ밪�� ���ؼ� �����Ͱ� �� ũ�� �ִ밪�� ����
			if(max_data < imsi) {
				max_data = imsi;
			}
		}
		System.out.println("���� ū ������: "+max_data);
		
		
		
		//�ּҰ�
		
		int min_data = 100;
		int min_idx = -1;
		int len = data.length;
		//��� ������ ��ȸ
		for(int i=0; i<len; i=i+1) {
			//�����Ϳ� �ִ밪�� ���ؼ� �����Ͱ� �� ũ�� �ִ밪�� ����
			if(min_data > data[i]) {
				min_data = data[i];
				min_idx=i;
			}
		}
		System.out.println("���� ���� ������: "+min_data);
		System.out.println("���� ���� �������� ��ġ:"+min_idx);
		
		//���ǿ� �´� �������� ���� ã��
		//������ ������ ������ ������ ���� ������ ���� ������ ������
		//�ʱ�ȭ - ��κ� 0���� �ʱ�ȭ
		
		//��� �����͸� ��ȸ�ϸ鼭 �����Ͱ� ���ǿ� �´��� Ȯ���ؼ� ���ǿ� ������
		//������ 1 ���������ָ� �˴ϴ�.
		
		//90�� �Ѵ� �������� ���� ã��
		int cnt = 0;
		
		for(int temp : data) {
			if(temp>90) {
				cnt = cnt+1; //cnt++;
			}
		}
		System.out.println("90�� �Ѵ� ������ ����: "+cnt);
	}

}