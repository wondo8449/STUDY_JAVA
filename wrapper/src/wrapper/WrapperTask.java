package wrapper;

public class WrapperTask {
	public static void main(String[] args) {
		
		Object[] datas = {1, 3.5, 12.5F, 'A', "ABC", true};
		
		for (int i = 0; i < datas.length; i++) {
			System.out.println(datas[i]);
		}
	}
}
