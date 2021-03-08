package java_chobo.ch06;  //망한거. 보지말것

import java.util.Arrays;

import java.util.Collections;

import java.util.Scanner;

import java_chobo.ch06.dto.Student;

public class StudentManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a;

		String b;

		int c;

		int d;

		int e;

		Student[] students = new Student[5]; // Student 타입의 참조배열 선언 및 인스턴스화. 변수명 : students, 배열의 길이는 5.

		initial(students); // 함수호출

		System.out.println("학생관리 프로그램"); // initial 함수호출이 끝나면 실행할 문장.

		int choice;

		do { // 선 실행할 문장. 맨처음에 한번 실행하고나서, while문의 조건이 맞으면 또 실행.

			showMenu();

			System.out.print("메뉴 > ");

			choice = sc.nextInt();

			switch (choice) {

			case 1:

				System.out.println("학생 추가");
				
				addStudent(students, sc);
				
				
				

				for (int i = 0; i < students.length; i++) { // 0번지부터 4번지까지 확인. 그리고 배열 안에 빈자리가 있으면

					if (students[i] == null) {

						System.out.println(" 학번을 입력해주세요");

						a = sc.nextInt();

						students[(i)] = new Student(a, null, 0, 0, 0);

						System.out.println(" 이름을 입력해주세요");

						b = sc.next();

						students[(i)] = new Student(a, b, 0, 0, 0);

						System.out.println(" 국어성적을 입력해주세요");

						c = sc.nextInt();

						students[(i)] = new Student(a, b, c, 0, 0);

						System.out.println(" 영어성적을 입력해주세요");

						d = sc.nextInt();

						students[(i)] = new Student(a, b, c, d, 0);

						System.out.println(" 수학성적을 입력해주세요");

						e = sc.nextInt();

						students[(i)] = new Student(a, b, c, d, e);

						System.out.println("입력하신 학생정보는 " + students[i] + "입니다.");

						break;

					}

				}

				break;

			case 2:

				System.out.println("학생 수정");

				modifyStudent(students, sc);

			

					}

				break;

			case 3:

				System.out.println("학생 삭제");

				System.out.println("삭제할 학생이 몇번째에 있는지 입력해주세요.");

				int x = sc.nextInt();

				students[(x - 1)] = null;

				tmp(students);

				break;

			case 4:

				System.out.println("학생 목록");

				prnStudent(students); // 학생 목록 출력해주는 함수호출

				break;

			}

		} while (choice < 5); // 입력된 값이 5 미만이면

		sc.close();

	private static void modifyStudent(Student[] students, Scanner sc) {
		
		// 1. 학생 번호 입력
		//2. 해당 위치에 입력받은 학생 정보를 변경
		prnStudent(students);
		System.out.println("수정하고자 하는 학생번호 입력 > ");
		int findStdNo = sc.nextInt();
		int idxStdNo = searchStudent(students, findStdNo);
		if(idxStdNo < 0) {
			System.out.println("해당하는 학생이 존재하지 않음.");
		}
		students[idxStdNo] = createStudent(sc);
	}

	private static int searchStudent(Student[] students, int findStdNo) {
		for (int i = 0; i<students.length; i++) {
			if (findStdNo == students[i].stdNo) {
				return i;
			}
		}
		return -1;
	}

	}

	private static void addStudent(Student[] students, Scanner sc) {
		//1. 저장된 학생 수를 구하기, 수에 따라서 입력 or 종료
		//2. 추가할 위치검색하기
		//3. 추가할 학생정보를 입력.
		
		
		int findIdx = findIdx(students);  //findIdx : 추가할 학생의 위치
		
		if (findIdx > students.length-1) {
			System.out.println( "더 이상 학생을 입력할 수 없습니다.");
			return;
		}
		System.out.println( "학생 수 " + findIdx);
		students[findIdx] = createStudent(sc);
		
	}

	private static Student createStudent(Scanner sc) {
		System.out.println("학생 정보를 입력하세요. ex) 번호 성명 국어 영어 수학"); 
		int stdNo = sc.nextInt()
;
		String name =  sc.next();
		int kor =  sc.nextInt();
		int eng =  sc.nextInt();
		int math =  sc.nextInt();
	
		return new Student(stdNo, name, kor, eng, math);
	}

	private static int findIdx(Student[] students) {
		int i = 0; i < students.length; i++) {
		if (students[i] == null) {
				return i;
	}

	
		}
	}
	
	
	
	
	private static void tmp(Student[] students) {

		for (int i = 0; i < students.length - 1; i++) {

			if (students[i] == null) {

				Student tmp = students[i];

				students[i] = students[i + 1];

				students[(i + 1)] = tmp;

				System.out.println();

			}

		}

	}

	private static void prnStudent(Student[] students) { //

		for (Student std : students) { // Student 타입의 참조변수 std선언, students의 내용물을 순서대로 하나씩 꺼내서 std에 넣는다.널값이면 종료하고, 아니면

			// std를 찍어준다.

			if (std == null) // std가 null이면 종료

				break;

			System.out.println(std);

		}

		System.out.println();

	}

	private static void initial(Student[] students) {

		students[0] = new Student(1, "전수린", 90, 90, 90);

		students[1] = new Student(2, "김상건", 91, 91, 91);

		students[2] = new Student(3, "이태훈", 92, 92, 92);

		

		// 조건이 있으면 추가

	}

	private static void showMenu() {

		String[] m = new String[6];

		m[0] = "메뉴를 선택하세요.\n";

		m[1] = "1. 학생 추가\n";

		m[2] = "2. 학생 수정\n";

		m[3] = "3. 학생 삭제\n";

		m[4] = "4. 학생 목록\n";

		m[5] = "5. 종료\n";

		for (String str : m) {

			System.out.print(str);

		}

	}

}