package fun;

public class Professor {
Monster m=new Monster ();
	void Woodensword() {
		m.healthpoint=m.healthpoint-50;
		System.out.println("����ʹ��ľ������˹����Ѫ������50��");
		m.judgeexist();
	
}
	void Ironsword() {
		m.healthpoint=m.healthpoint-100;
		System.out.println("����ʹ����������˹����Ѫ������100��");
		m.judgeexist();
	}
	void Magicsword() {
		m.healthpoint=m.healthpoint-200;
		System.out.println("����ʹ��ħ������˹����Ѫ������200��");
		m.judgeexist();
		}
}