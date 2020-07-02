package fun;

public class Monster {
	String name="哥斯拉";
	int healthpoint=500;
	void judgeexist() {
		if(healthpoint<=0) {
			System.out.println(name+"死亡！");
		}
			else {
				System.out.println(name+"还有"+healthpoint+"血量");
			}
		}
	}