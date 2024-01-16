package extend;

public class Main02 {

	public static void main(String[] args) {
		QNAArticle qna = new QNAArticle();
		FileArticle file = new FileArticle();
		
		qna.setNum(1);
		qna.setTitle("제목입니다");	
		qna.setAnswer("답변입니다");
		System.out.println(qna.toString());
		
		file.setNum(1);
		file.setTitle("제목입니다");	
		file.setFileName("첨부파일입니다");
		System.out.println(file.toString());
		
		
	}
}
