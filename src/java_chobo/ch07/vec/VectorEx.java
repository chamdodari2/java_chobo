package java_chobo.ch07.vec;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<String> vec1 = new Vector<>();  //꺽쇠가 빠지면 오브젝트로...  꺽ㄱ쇠안은 제너릭이라고 한다 클래스만 넣을수 있다.예) 분리수거하는곳에 플라스틱,병.. 정해져있는 것 처럼 제목만 보면 내용물을 알수 있다. 제목이 비어있으면 타입캐스트가 문제다.
      //이렇게 적어주면 스트링만 꺼내고 스트링만 넣을수있다.
  
    for(int i = 0; i<5;i++) {
    	vec1.add("test"+i);
    }
    System.out.println(vec1);
    
    vec1.remove(3);  //삭제후 자동당기기 가능
    System.out.println(vec1);
    System.out.println(vec1.size());  //길이 출력
    
    System.out.println(vec1.get(0)); //해당배열인덱스 가져와서 출력
    
    
    System.out.println("idx = "+ idx);
    
	}
	
}
