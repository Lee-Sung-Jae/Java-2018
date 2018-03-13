class SchoolClass {
	String name;
	int studentCount, staffCount;
	
	public void print() {
		System.out.printf("%s학교에는 %d명의 학생과 %d명의 직원이 있습니다.\n", name, studentCount, staffCount);
	}
}

class RoomClass {
	String name;
	int studentCount, staffCount, floor;

	public void print() {
		System.out.printf("%d층에 있는 %s에는 %d명의 학생과 %d명의 직원이 있습니다.\n", floor, name, studentCount, staffCount);
	}
}

public class School_01 {
	public static void main(String[] args) {
		SchoolClass schoolClass = new SchoolClass();
		schoolClass.name = "인평자동차고등";
		schoolClass.studentCount = 300;
		schoolClass.staffCount = 30;
		schoolClass.print();
		
		RoomClass adminOffice = new RoomClass();
		adminOffice.name = "행정실";
		adminOffice.studentCount = 0;
		adminOffice.staffCount = 5;
		adminOffice.floor = 3;
		adminOffice.print();
		
		RoomClass teacherOffice = new RoomClass();
		teacherOffice.name = "교무실";
		teacherOffice.studentCount = 0;
		teacherOffice.staffCount = 25;
		teacherOffice.floor = 3;
		teacherOffice.print();
		
		RoomClass classRoom = new RoomClass();
		classRoom.name = "2학년 2반";
		classRoom.studentCount = 26;
		classRoom.staffCount = 2;
		classRoom.floor = 3;
		classRoom.print();
	}
}
