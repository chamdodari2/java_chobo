package java_chobo.ch08;

public class ExceptionEx16 {  //사용자가 예외처리를 만들어서 이렇게 수행할수있당

	public static void main(String[] args) {
		try {
			startInstall();							//요 3줄만  보면 된다. 코드가 간결해진당 (알고리즘이 보인당)
			copyFiles();							//
			System.out.println("프로그램 설치 완료");	//
		} catch (SpaceException e) {
			System.out.println("에러메세지 : " + e.getMessage());
			e.printStackTrace();
			System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
		} catch (MemoryException e) {

			System.out.println("에러메세지 : " + e.getMessage());
			e.printStackTrace();
			System.gc(); // 에러뜨면 사용했던 메모리 반납 지시??
			System.out.println("다시 설치를 시도하세요.");
		} finally {
			deletetempfile();
		}

	}

	

	private static void startInstall() throws SpaceException, MemoryException {
		// 1.하드디스크 공간이 충분한지 체크해야한다
		if (!isEnoughSpace()) { // 충분하징낳을경우
			throw new SpaceException("설치할 공간이 부족합니다.");

		}
		// 2.메모리 공간이 충분한지 체크해야한다.
		if (!insEnoughMemory()) {
			throw new MemoryException("메모리 공간이 부족합니다.");

		}
		// 3. 다 체크되면 인스톨
	}

	private static boolean insEnoughMemory() {
		// false를 던져준거는 메모리 공간이 충분하지 않다는것
		return false;
	}

	private static boolean isEnoughSpace() {
		// false를 던져준거는 하드디스크 용량이 충분하지 않다는것
		return false;
	}

	private static void copyFiles() {
		System.out.println("파일을 카피합니다.");
	
		
	}
	private static void deletetempfile() {
		System.out.println("임시 파일을 삭제합니다.");

	}
}
