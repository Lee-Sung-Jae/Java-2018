class SchoolClass {
	String name;
	int studentCount, staffCount;
	
	public void print() {
		System.out.printf("%s�б����� %d���� �л��� %d���� ������ �ֽ��ϴ�.\n", name, studentCount, staffCount);
	}
}

class RoomClass {
	String name;
	int studentCount, staffCount, floor;

	public void print() {
		System.out.printf("%d���� �ִ� %s���� %d���� �л��� %d���� ������ �ֽ��ϴ�.\n", floor, name, studentCount, staffCount);
	}
}

public class School_01 {
	public static void main(String[] args) {
		SchoolClass schoolClass = new SchoolClass();
		schoolClass.name = "�����ڵ������";
		schoolClass.studentCount = 300;
		schoolClass.staffCount = 30;
		schoolClass.print();
		
		RoomClass adminOffice = new RoomClass();
		adminOffice.name = "������";
		adminOffice.studentCount = 0;
		adminOffice.staffCount = 5;
		adminOffice.floor = 3;
		adminOffice.print();
		
		RoomClass teacherOffice = new RoomClass();
		teacherOffice.name = "������";
		teacherOffice.studentCount = 0;
		teacherOffice.staffCount = 25;
		teacherOffice.floor = 3;
		teacherOffice.print();
		
		RoomClass classRoom = new RoomClass();
		classRoom.name = "2�г� 2��";
		classRoom.studentCount = 26;
		classRoom.staffCount = 2;
		classRoom.floor = 3;
		classRoom.print();
	}
}
