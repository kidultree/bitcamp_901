package study2;

public class Score {
	private int kor, eng, mat;
	
	public Score(int kor) {
		this.kor = kor; //�����ڷ� ����
	}
	
	public void setEng(int eng) {
		this.eng = eng; //setter 
	}
	
	public void setMat(int mat) {
		this.mat = mat; //setter
	}
	
	public String getScore() {
		String s ="����:"+kor+",����:"+eng+",����:"+mat;
		return s;
	}
}