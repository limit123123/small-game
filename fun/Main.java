package fun;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Professor p = new Professor();
		Monster monster = new Monster();
		monster.judgeexist();
		Scanner in = new Scanner(System.in);
			while(monster.healthpoint>0)  {
				System.out.print("��ѡ������Ҫ�����䱸��װ��:");
				String c = in.nextLine(); //�������ֲ�ͬ�Ľ�
				 switch(c)
			      {
			         case "ľ��" :
			         p.Woodensword();
			        monster.healthpoint=monster.healthpoint-50;
			      break;
			            
			         case "����" :
			        	   p.Ironsword();
			        	   monster.healthpoint=monster.healthpoint-100;
			        	   break;
			         case "ħ��" :
			           p.Magicsword();
			           monster.healthpoint=monster.healthpoint-200;
			            break;
			      }
			}  
			
		}
		
	}

