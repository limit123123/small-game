package fun;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Professor p = new Professor();
		Monster monster = new Monster();
		monster.judgeexist();
		Scanner in = new Scanner(System.in);
			while(monster.healthpoint>0)  {
				System.out.print("请选择您需要教授配备的装备:");
				String c = in.nextLine(); //输入三种不同的剑
				 switch(c)
			      {
			         case "木剑" :
			         p.Woodensword();
			        monster.healthpoint=monster.healthpoint-50;
			      break;
			            
			         case "铁剑" :
			        	   p.Ironsword();
			        	   monster.healthpoint=monster.healthpoint-100;
			        	   break;
			         case "魔剑" :
			           p.Magicsword();
			           monster.healthpoint=monster.healthpoint-200;
			            break;
			      }
			}  
			
		}
		
	}

