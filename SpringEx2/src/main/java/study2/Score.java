package study2;

public class Score {
	private int kor, eng, mat;
	
	public Score(int kor) {
		this.kor = kor; //생성자로 보냄
	}
	
	public void setEng(int eng) {
		this.eng = eng; //setter 
	}
	
	public void setMat(int mat) {
		this.mat = mat; //setter
	}
	
	public String getScore() {
		String s ="국어:"+kor+",영어:"+eng+",수학:"+mat;
		return s;
	}
}
