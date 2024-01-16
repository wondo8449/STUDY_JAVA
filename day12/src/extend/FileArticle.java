package extend;

public class FileArticle extends Article {

	String fileName;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public String toString() {
		return "질문/답변 [글번호 = " + getNum()
		+ ", 제목 = " + getTitle() + ", 첨부파일 =  " + fileName + "]";
	}
}
