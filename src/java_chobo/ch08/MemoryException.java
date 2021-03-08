package java_chobo.ch08;

public class MemoryException extends Exception {
	private static final long serialversionuid = 1L; //rmi에서 씀. 시리얼 ?? 변경도

	public MemoryException(String message) {
		super(message);
		
	}

	
}
