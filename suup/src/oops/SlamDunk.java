package oops;

class BasketPlayer{
	String name, num;
	String [] posStr = {"����","����","����"};
	double [] rate = {0.3,0.2,0.3,0.2};
		//����, ���ͼ���, �帮��, ��ǽ� 
	int [] jum = new int[rate.length];
	int tot = 0,pos; 
	
	
	
	
	
	void input(String nm, String nn, int pp, int shut, int inter, int dri, int show ){
		name = nm;
		num = nn;
		pos = pp;
		jum[0]=shut;
		jum[1]=inter;
		jum[2]=dri;
		jum[3]=show;		
	}
	
	void cal(){
		for(int i=0; i<jum.length; i++){
			tot+= jum[i] * rate[i];
			tot=tot / 4;
		}	
	}
	
		
	String toStringg(){
			
			String res = name +"\t"+	num +"\t"+ posStr[pos] +"\t";
					
			for(int i=0; i<jum.length; i++){
				res += jum[i] + "\t";
			}
			res += tot;
					
					
					return res;
		}
	}

class BasKetTeam{
	String name;
	BasketPlayer [] player;
	
	void input(BasketPlayer [] arr){
		player = arr;
	}
	void print(int no){
		System.out.println(name + " : " +player[no].toStringg());
		
	}
	void teamPrint(){
		for(int i=0; i<player.length; i++){
			print(i);
		}			
	}
	
}


class BaKetBest{
	BasKetTeam [] team;
	BasKetTeam best = new BasKetTeam();
	void input(BasKetTeam [] arr){
		
		team = arr;
		cal();
	}
	
	void cal(){
		best.name="����Ʈ";
		best.player = new BasketPlayer[3];
		
		for(int i=0; i<best.player.length; i++){
			best.player[i]=new BasketPlayer();
			for(int j=0; j<team.length; j++){
				for(int k=0; k<team[j].player.length; k++){
					if(team[j].player[k].pos==i && best.player[i].tot < team[j].player[k].tot)
					best.player[i] = team[j].player[k];
				}
			}
		}
	}
	
	void teamPrint(){
		String [] index = {"���� : �̸�\t","���ȣ","������","����","���ͼ���","�帮��","��ǽ�","����"};
		for(String str : index){
			System.out.print(str+"\t");
		}
		
		System.out.println();
		
		for(String str : index){
			System.out.print("=========");
		}
		
		System.out.println();
		
		for(int i=0; i<team.length;i++){
			team[i].teamPrint();
		}
	}
	
	
}

public class SlamDunk {
	public static void main(String [] args){
		BasketPlayer [] buksan = new BasketPlayer[5];
		
		for(int i=0; i<buksan.length; i++){
			buksan[i]=new BasketPlayer();
		}
		
		
		BasketPlayer [] neung = new BasketPlayer[5];
		
		for(int i=0; i<neung.length; i++){
			neung[i]=new BasketPlayer();
		}
		
		
		BasketPlayer [] hae = new BasketPlayer[5];
		
		for(int i=0; i<hae.length; i++){
			hae[i]=new BasketPlayer();
		}
		
		
		buksan[0].input("äġ��", "4", 1 ,98, 97, 96, 95);
		buksan[1].input("����ȣ", "10",2 ,87 , 86, 85, 84);
		buksan[2].input("���¼�", "7", 0, 75, 76, 74, 73);
		buksan[3].input("���¿�", "11", 1,66,67 ,68 ,69 );
		buksan[4].input("���븸", "14", 2,58, 59, 57, 51);
		
		
		neung[0].input("����", "44", 1, 98, 97, 96, 95);
		neung[1].input("������", "77", 2, 87, 86, 85, 84);
		neung[2].input("��Ÿ1", "88", 0, 77, 76, 77, 75);
		neung[3].input("��Ÿ2", "99", 1, 67, 66, 66,64 );
		neung[4].input("��üũ", "00", 2, 57, 56, 54, 53);
		
		hae[0].input("����ȯ", "13", 1,98, 97, 96, 95);
		hae[1].input("���ؼ�", "15", 2,87, 86, 85, 84);
		hae[2].input("�Ȱ���", "16", 0,76,75 ,74 ,73 );
		hae[3].input("��������ǰ", "17", 1,67,68 ,69 ,70 );
		hae[4].input("���ĸ�", "19", 2,56,57 , 58, 59);
		
		/////////////////////////////////////////////////////����
		
		
		
		BasKetTeam team[] = new BasKetTeam[3];
		
		
		for(int i=0; i<team.length; i++){
			team[i] = new BasKetTeam();
		}
		
		
		team[0].name="�ϻ�";
		team[1].name="�ɳ�";
		team[2].name="�س�";
		
		team[0].input(buksan);
		team[1].input(neung);
		team[2].input(hae);
		
		
		////////////////////////////////////////////////////��
		
		BaKetBest bb = new BaKetBest();
		bb.input(team);
		bb.teamPrint();
		
		
		bb.best.teamPrint();
		
	}
}
