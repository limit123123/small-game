package fun;

public class Professor {
Monster m=new Monster ();
	void Woodensword() {
		m.healthpoint=m.healthpoint-50;
		System.out.println("教授使用木剑，哥斯拉的血量减少50！");
		m.judgeexist();
	
}
	void Ironsword() {
		m.healthpoint=m.healthpoint-100;
		System.out.println("教授使用铁剑，哥斯拉的血量减少100！");
		m.judgeexist();
	}
	void Magicsword() {
		m.healthpoint=m.healthpoint-200;
		System.out.println("教授使用魔剑，哥斯拉的血量减少200！");
		m.judgeexist();
		}
}