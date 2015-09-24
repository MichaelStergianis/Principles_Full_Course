class Student
{
	public String name;
	public int id;
}

class Lec3
{
	public static void main(String[] args){
		String a[] = new String[3];
		a[0] = "Hey bitch";
		a[1] = "22";
		a[2] = "aoue";
		for (int i = 0; i < 3; ++i){
			System.out.println(a[i]);
		}
		Student b[] = new Student[3];
		for (int i = 0; i < 3; ++i){
			b[i] = new Student();
		}
		b[0].name = "michael stergianis";
		b[0].id = 100568134;
		b[1].name = "faisal quereshi";
		b[2].id = 52354213;
	}
}
