package mypakege;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

class WinClose extends WindowAdapter{
	
	public void windowClosing(WindowEvent e) {
		e.getWindow().dispose();
	};
}

/////////////////////////////////////////////

class TimerThread extends Thread{
	TotalMain tot;
	Quest[] quest;

	public TimerThread(TotalMain tot, Quest[] quest) {
		this.tot=tot;
		this.quest=quest;
	}
	@Override
	public void run() {
		for(int i=10; i>=0; i--){
			try {
				if(this.tot.formNum==4){
					tot.timejum=i;
					break;				
				}
				
				System.out.println(i);
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		for(int i=0; i<tot.quest.length; i++){
			tot.quest[i].setVisible(false);
		}
		tot.startPaint();
	}
}




/////////////////////////////////////////////////////////////

class UserInfo{
	Map list;
	public UserInfo() {
		this.list=new LinkedHashMap<>();
		list.put("aaa", "aaa");
		list.put("bbb", "bbb");
		list.put("ccc", "ccc");
		list.put("ddd", "ddd");
		list.put("eee", "eee");
	}
}
//////////////////////////////////////////////////////

class LoginForm extends Frame implements ActionListener{
	Label lb1,lb2;
	TextField id,pw;
	Button bt1,bt2;
	Font f;
	UserInfo user;
	TotalMain tot;
	
	
	public LoginForm(String title,TotalMain tot) {
		
		super(title);
		this.tot=tot;
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(400,300);
		int x = (int)(screen.getWidth()/2 - super.getWidth()/2);
		int y = (int)(screen.getHeight()/2 - super.getHeight()/2);
		setLayout(new GridLayout(3,2));
		
		this.user=new UserInfo();
		
		this.f = new Font(null,Font.PLAIN+Font.BOLD,20);
		this.bt1 = new Button("로그인");
		this.bt2 = new Button("종 료");
		this.lb1 = new Label("                      id : ");
		this.lb2 = new Label("                     pw : ");
		this.id = new TextField();
		this.id.setFont(new Font(null,Font.BOLD,25));
		this.pw = new TextField();
		this.pw.setFont(new Font(null,Font.BOLD,25));
		this.bt1.addActionListener(this);
		this.bt2.addActionListener(this);
		this.lb1.setFont(f);
		this.lb2.setFont(f);
		
		add(lb1);
		add(id);
		add(lb2);
		add(pw);
		add(bt1);
		add(bt2);
		
		
		setLocation(x,y);
		setResizable(false);
		setVisible(true);
		addWindowListener(new WinClose());
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("로그인")){
			Iterator it = user.list.keySet().iterator();
			while(it.hasNext()){
				String res=(String)it.next();
				if(this.id.getText().equals(res)){
					if(this.pw.getText().equals(user.list.get(res))){
						tot.quest[0].setVisible(true);
						tot.time.start();
						
						this.dispose();
						break;
					}else{
						System.out.println("비밀번호가 맞지 않습니다.");
					}
				}
			}
		}else{
			System.exit(0);
		}
	}
}


//////////////////////////////////////////////////////
class Quest extends Frame implements ActionListener{
	Label lb1;
	Button bt1,bt2;
	TextField t;
	int time=0;
	TotalMain tot;
	String text;
	
	
	public Quest(String title,String text, TotalMain tot) {
		super(title);
		this.text=text;
		setSize(400,500);
		setLayout(new GridLayout(3,1));
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int)(screen.getWidth()/2 - super.getWidth()/2);
		int y = (int)(screen.getHeight()/2 - super.getHeight()/2);
		
		
		this.tot=tot;
		this.t = new TextField();
		this.bt1 = new Button("확인");
		this.lb1 = new Label("문제 :   "+text);
		//스레드 받아와서 초 시계 돌아가게 만들어야지.
		
		lb1.setFont(new Font(null,Font.BOLD,20));	
		t.setFont(new Font(null,Font.BOLD,30));
		bt1.setFont(new Font(null,Font.BOLD,18));
		add(lb1);
		add(t);
		add(bt1);
		
		bt1.addActionListener(this);
		
		setLocation(x,y);
		setResizable(false);
		setVisible(false);
		addWindowListener(new WinClose());
			
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(this.t.getText().equals(((String)((Map)tot.info.get(1)).get(this.text)))){
			this.dispose();
			if(tot.formNum<5){
			this.tot.quest[tot.formNum].setVisible(true);
			this.tot.jum++; 
			}
			if(tot.formNum<5){
			this.tot.formNum++;
			}
		
			
		}
	}
	
	
}
//////////////////////////////////////////////////////
class Paint extends Frame implements Runnable{
	TotalMain tot;
	TextArea ta;
	MenuBar mb;
	Menu me[];
	MenuItem[] mi;
	Panel p1,p2;
	int su1=255,su2=0,su3=0;
	Panel p[];
	
	public Paint(TotalMain tot,String title) {
		super(title);
		this.tot=tot;
	
		
		setSize(800,700);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int)(screen.getWidth()/2 - super.getWidth()/2);
		int y = (int)(screen.getHeight()/2 - super.getHeight()/2);
		setLayout(null);
		
		this.p1=new Panel();
		this.p2=new Panel();
		this.p=new Panel[24];
		
		this.ta=new TextArea();
		this.me = new Menu[17];
		this.mb = new MenuBar();
		this.mi = new MenuItem[6];
		this.ta.setBounds(100, 76, 1000, 500);
		ta.setFont(new Font(null,Font.BOLD,20));
		
		this.input();
		this.menu();
		this.painting();
	
		
		add(p1);
		add(p2);
		add(ta);
		setMenuBar(mb);
		setLocation(x,y);
		setVisible(false);
		
	}
	private void painting() {
		
		p1.setLayout(new GridLayout(8,2));
		p2.setLayout(new GridLayout(2,14));
		p1.setBounds(11, 76, 80, 650);
		p2.setBounds(100, 600 , 450, 60);
		
		for(int i=1; i<11; i++){
		p1.add(new Button(""+i+""));
		}
		
		
		for(int i=0; i<p.length; i++){
			su1=((int)(Math.random()*254))+1;
			su2=((int)(Math.random()*254))+1;
			su3=((int)(Math.random()*254))+1;
			
			
			p[i]=new Panel();
			p[i].setBackground(new Color(su1,su2,su3));
			p2.add(p[i]);
		}
		
	}
	private void menu() {

		mb.add(me[0]);
		mb.add(me[1]);
		mb.add(me[2]);
		mb.add(me[3]);
		mb.add(me[4]);
		mb.add(me[5]);
		me[0].add(mi[0]);
		me[0].add(mi[1]);
		me[0].add(mi[2]);
		me[0].add(me[6]);
		me[0].add(me[7]);		
		me[0].add(mi[3]);
		me[0].add(mi[4]);
		me[1].add(me[8]);
		me[1].add(me[9]);
		me[2].add(me[10]);
		me[2].add(me[11]);
		me[3].add(me[12]);
		me[3].add(me[13]);
		me[3].add(me[14]);
		me[4].add(me[15]);
		me[4].add(me[16]);
		me[5].add(mi[5]);
		
	}
	private void input() {
		String [] arr={"파일(F)","편집(E)","보기(V)","이미지(I)","색(C)","도움말(H)","다른이름으로 저장","인쇄","새로편집","기존거편집"
				,"가로보기","세로보기","새이미지","이미지가져오기","이미지저장","색조정","색옵션"};
		String [] arr1={"새로만들기","열기","저장","속성","끝내기","도움말"};
		for(int i=0; i<me.length; i++){
			me[i]=new Menu(arr[i]);
		}
		for(int i=0; i<mi.length; i++){
			mi[i]=new MenuItem(arr1[i]);
		}
		
		
		
	}
	
	@Override
	public void run() {
		while(true){
		
		ta.setText("맞춘 문제 : "+tot.jum+"개   점수 : " + tot.jum*20 +" 시간보너스 : " + tot.timejum
				+ " 점");
		}
}
	
	
	
	
	
}
//////////////////////////////////////////////////////
class TotalMain{
	TimerThread time;
	LoginForm log;
	Quest quest[];
	Map  info;
	int formNum=1,jum=0,timejum=0;
	Iterator it;
	Paint paint;
	
	
	public TotalMain() {
		this.info=new LinkedHashMap<>();
		this.info.put(1, new LinkedHashMap());
		((Map)info.get(1)).put("8 * 5 =", "40");
		((Map)info.get(1)).put("6 * 5 =", "30");
		((Map)info.get(1)).put("4 * 5 =", "20");
		((Map)info.get(1)).put("5 * 5 =", "25");
		((Map)info.get(1)).put("7 * 5 =", "35");
		
		this.it=((Map)info.get(1)).keySet().iterator();
		
		this.quest=new Quest[5];
		
		quest[0]=new Quest("문제 1",(String)it.next(),this);
		quest[1]=new Quest("문제 2",(String)it.next(),this);
		quest[2]=new Quest("문제 3",(String)it.next(),this);
		quest[3]=new Quest("문제 4",(String)it.next(),this);
		quest[4]=new Quest("문제 5",(String)it.next(),this);
		
		this.time = new TimerThread(this,quest);
		this.log = new LoginForm("로그인",this); //로그인이 된다면, 내가 가지고있는 값을 실행시켜줘야지. 그치?
		this.paint=new Paint(this,"그림판");
	}
	
	public void startPaint(){
		paint.setVisible(true);
		paint.run();
	}
	
	
	
}

///////////////////////////////////////////////

public class Login_c {
	public static void main(String[] args){

	new TotalMain();
		
	}
}
