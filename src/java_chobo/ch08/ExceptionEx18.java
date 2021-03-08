package java_chobo.ch08;

public class ExceptionEx18 {  

	public static void main(String[] args) {
		try {
			install();
		} catch (InstallException e) {
			e.printStackTrace();
		}

	}

	public static void install() throws InstallException {
		try {
			startInstall();
			copyFiles();
			System.out.println("프로그램 설치 완료");
		} catch (SpaceException e) {
			InstallException ie = new InstallException("설치 중 에외발생");
			ie.initCause(e);
			throw ie;
		} catch (MemoryException e) {
			InstallException ie = new InstallException("설치 중 에외발생");
			ie.initCause(e);
			throw ie;
		} finally {
			deleteTempFile();
		}
	}

	private static void startInstall() throws SpaceException, MemoryException {
		// 하드디스크 공간이 충분한지 체크
		if (!isEnoughSpace()) {
			throw new SpaceException("설치할 공간이 부족합니다.");
		}
		// 메모리 공간이 충분한지 체크
		if (!isEnoughMemory()) {
			throw new MemoryException("메모리가 부족합니다.");
		}
	}
	
	private static boolean isEnoughMemory() {
		// 메모리 공간이 충분하지 체크
		return false;
	}

	private static boolean isEnoughSpace() {
		// false 하드디스크 용량이 충분하지 않음
		return true;
	}

	private static void copyFiles() {
		System.out.println("파일을 copy합니다.");
	}
	
	private static void deleteTempFile() {
		System.out.println("임시 파일을 삭제합니다.");
	}


}