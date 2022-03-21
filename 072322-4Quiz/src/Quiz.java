
	public class Quiz {
		String question;
		String ch1;
		String ch2;
		String ch3;
		String ch4;
		String ans;
		
		public Quiz(String question, String ch1, String ch2, String ch3, String ch4, String ans) {
			//this를 빼면 둘다 가까운 변수인 생성자 파라메터를 가리키게 되기 때문에 this를 넣음.
			//자바에서 this의 의미는 자기가 속한 클래스를 의미함.
			this.question = question;
			this.ch1 = ch1;
			this.ch2 = ch2;
			this.ch3 = ch3;
			this.ch4 = ch4;
			this.ans = ans;

		}
	}


