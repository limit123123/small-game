package fun;

public class Monster {
	String name="��˹��";
	int healthpoint=500;
	void judgeexist() {
		if(healthpoint<=0) {
			System.out.println(name+"������");
		}
			else {
				System.out.println(name+"����"+healthpoint+"Ѫ��");
			}
		}
	}