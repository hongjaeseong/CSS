package Ch09Ex;

class Profile{
	//속성
	private String name;
	private String addr;
	private String job;
	private String major;
	//생성자
	//1)디폴트생성자 삽입
	public Profile() {
		
	}
	//2)모든 인자 받는 생성자 삽입 -> 각멤버에 대입
	public Profile(String name, String addr, String job, String major) {
		this.name = name;
		this.addr = addr;
		this.job = job;
		this.major = major;
	}
	//3)모든 인자 받는 생성자 삽입(가변인자사용할것) -> , 를기준으로 잘라내어 각속성에 저장
	//ex, "홍길동,대구,프로그래머,컴퓨터공학" ->[홍길동,대구,프로그래머,컴퓨터공학]
	public Profile(String args) {
//		System.out.println("가변인자를 받은 생성자 호출!");
		args = args.trim();							// trim : 앞뒤 공백 제거
		String[] arr = args.split(",");				// , 기준으로 잘라내기
//		for(String val : arr) {						// 4번 반복
//			System.out.println(val);
//		}
		this.name = arr[0];		// 배열 0번째 인덱스의 값이 해당 객체 name 속성에 대입
		this.addr = arr[1];		// 배열 1번째 인덱스의 값이 해당 객체 addr 속성에 대입
		this.job = arr[2];		// 배열 2번째 인덱스의 값이 해당 객체 job 속성에 대입
		this.major = arr[3];	// 배열 3번째 인덱스의 값이 해당 객체 major 속성에 대입
	}
	//기능
	//1) getter and setter 삽입
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	//2) toString  재정의
	@Override
	public String toString() {
		return "Profile [name=" + name + ", addr=" + addr + ", job=" + job + ", major=" + major + "]";
	}
	//3) boolean isContain(String compare) 함수 완성하기
	boolean isContain(String findstr) {
		//findstr의 문자열이 각멤버인 name,addr,job,major 중 하나라도 포함되어 있으면 true 리턴
		//아니면 false 리턴
		findstr = findstr.trim();					// trim : 앞뒤 공백 제거
		if(this.name.contains(findstr)) {			// this.name에 findstr가 포함되어 있다면
			return true;							// true를 반환한다
		} else if(this.addr.contains(findstr)) {	// 그게 아니고 this.addr에 findstr가 포함되어 있다면
			return true;							// true를 반환한다
		} else if(this.job.contains(findstr)) {		// 그게 아니고 this.job에 findstr가 포함되어 있다면
			return true;							// true를 반환한다
		} else if(this.major.contains(findstr)) {	// 그게 아니고 this.major에 findstr가 포함되어 있다면
			return true;							// true를 반환한다
		} else {									// 모두 아니라면
			return false;							// false를 반환한다
		}
	}
	//4)
	boolean isEquals(String str) {
		//all로 받은 문자열을 , 단위로 잘라내어(split(",")) 각각 나눠진 문자열이
		//name,addr,job,major 와 일치 하면 true
		//아니면 false 를 리턴
		System.out.println("------------");
		String all = str.trim();
		String[] array = all.split(",");
		for(String tmp : array) {			// 각각 나눠진 문자열을 확인
			System.out.print(tmp + " ");	// --> 홍길동 대구 프로그래머 컴퓨터공학 
		}
		System.out.println();
		System.out.println("------------");
		if(this.name.equals(array[0])) {
			return true;
		} else {
			return false;
		}
		
	}
	
}

public class C01PersonMain {
	
	public static void main(String[] args) {
		Profile hong = new Profile("홍길동,대구,프로그래머,컴퓨터공학");
//		System.out.println(hong.toString());
		// 집에서 다시 해보기!
//		System.out.println("길동 포함여부 : " + hong.isContain("길동"));	//true
//		System.out.println("컴퓨터 포함여부 : " + hong.isContain("컴퓨터"));	//true
		System.out.println("프로필 일치여부 : " + hong.isEquals("홍길동,대구,프로그래머,컴퓨터공학"));//false
		System.out.println("프로필 일치여부 : " + hong.isEquals("홍길동,울산,프로그래머,컴퓨터공학"));//false

	}
}
