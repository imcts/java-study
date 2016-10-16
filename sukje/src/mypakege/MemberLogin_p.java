package mypakege;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.omg.CORBA.portable.ValueBase;

class MemberFirst{
	Frame f;
	Dimension screen;
	int x,y;
	Panel p;
	TextField tx [];
	TextArea ta;
	Label lb[];
	List arr;
	Font ft;
	Button bt[];
	Choice cs[];
	Checkbox cb[];
	CheckboxGroup cg;

	public MemberFirst(String title) {
		this.f=new Frame(title);
		this.screen=Toolkit.getDefaultToolkit().getScreenSize();
		this.f.setSize(800,900);
		this.x=(int)(screen.getWidth()/2 - this.f.getWidth()/2);
		this.y=(int)(screen.getHeight()/2 - this.f.getHeight()/2);
		this.f.setLocation(x,y);
		this.f.setLayout(null);
		this.f.setResizable(false);
		this.f.setVisible(true);
		this.ft=new Font(null,Font.PLAIN+Font.BOLD,18);
		this.tx=new TextField[10];
		this.p = new Panel();
		this.lb= new Label[19];
		this.arr=new ArrayList();
		this.bt=new Button[5];
		this.cs=new Choice[8];
		this.cb=new Checkbox[16];
		this.ta=new TextArea();
		this.cg=new CheckboxGroup();
		
		this.setCheckBox();
		this.setButton();
		this.setLabel();
		this.setText();
		this.choice();
		this.init();
		
	}

	private void setCheckBox() {
		
		String [] arr = {"남자","여자","교사","가수","프로그래머","직장인","중졸","고졸","초대졸","대졸",
								"컴퓨터","음악감상","운동","기타"};
		for(int i=0; i<cb.length-2; i++){
			cb[i]=new Checkbox(arr[i]);
		}
	}

	private void choice() {

		for(int i=0; i<cs.length; i++){
			cs[i]=new Choice();
		}
		
		for(int i=2015; i>1950; i--){
			cs[0].add(""+i+"");
		}
		
		for(int i=12; i>0; i--){
			cs[1].add(""+i+"");
		}
		
		for(int i=31; i>0; i--){
			cs[2].add(""+i+"");
		}
		
		
		cs[3].add("naver.com");
		cs[3].add("nate.com");
		cs[3].add("google.com");
		cs[3].add("hanmail.net");

		
		
	
		
	}

	private void setButton() {
		this.arr.add("아이디 중복 체크");
		this.arr.add("사진등록");
		this.arr.add("우편번호 검색");
		this.arr.add("확인");
		this.arr.add("취소");
		
		Iterator it = arr.iterator();
		
		for(int i=0; i<bt.length; i++){
			bt[i]=new Button((String)it.next());
		}
	}

	private void setText() {
		for(int i=1; i<tx.length+1;i++){
			tx[i-1]=new TextField();
			tx[i-1].setFont(ft);
		}
	}

	private void setLabel() {
		
		this.arr.clear();
		this.arr.add("아이디 :");
		this.arr.add("비밀번호 입력 :");
		this.arr.add("비번확인 확인 :");
		this.arr.add("이 름 :");
		this.arr.add("생년월일 :");
		this.arr.add("이메일 :");
		this.arr.add("핸드폰 :");
		this.arr.add("집전화 :");
		this.arr.add("기본주소 :");
		this.arr.add("상세주소 :");
		this.arr.add("성별 :");
		this.arr.add("직업 :");
		this.arr.add("학력 :");
		this.arr.add("취미 :");
		this.arr.add("특기 :");
		this.arr.add("하고픈말 :");
		this.arr.add("@");
		this.arr.add("ex) 02-2222-3333");
		this.arr.add("ex) 010-1234-1234");
	
		
		Iterator it = arr.iterator();
		
		
		for(int i=0; i<arr.size(); i++){
			this.lb[i]=new Label((String)it.next());
			lb[i].setFont(ft);
		}
	
		int sum=80;
		for(int i=0; i<lb.length; i++){
		lb[i].setBounds(20, sum, 150, 30);
		sum+=40;
		f.add(lb[i]);
	}
		
		
		
	}

	private void init() {
		p.setBounds(600, 80, 140, 160);
		p.setBackground(Color.pink);
		bt[1].setBounds(630, 260, 80, 30);
		
		
		
		tx[0].setBounds(200, 80, 250, 30);
		bt[0].setBounds(470, 80, 100, 30);
		
		
		tx[1].setBounds(200, 120, 250, 30);
		tx[2].setBounds(200, 160, 250, 30);
		tx[1].setEchoChar('*');
		tx[2].setEchoChar('*');
		tx[3].setBounds(200, 200, 300, 30);
		tx[4].setBounds(200, 280, 150, 30);
		
		
		cs[0].setBounds(200, 240, 100, 30);
		cs[1].setBounds(300, 240, 100, 30);
		cs[2].setBounds(400, 240, 100, 30);
		
		
		lb[16].setBounds(360, 280, 30, 30); 
		cs[3].setBounds(400, 285, 100, 100);
		
		tx[5].setBounds(200, 320, 200, 30);
		lb[18].setBounds(430, 316, 200, 30);
		
		tx[6].setBounds(200, 360, 200, 30);
		lb[17].setBounds(430, 360, 200, 20);
		
		tx[7].setBounds(200, 400, 200, 30);
		bt[2].setBounds(430, 400, 150, 30);
		
		tx[8].setBounds(200, 440, 300, 30);
		cb[0].setBounds(200, 480, 40, 30);
		cb[1].setBounds(350, 480, 40, 30);
		
		
		cb[2].setBounds(200, 520, 40, 30);
		cb[3].setBounds(310, 520, 40, 30);
		cb[4].setBounds(420, 520, 80, 30);
		cb[5].setBounds(560, 520, 60, 30);
		
		cb[6].setBounds(200, 560, 60, 30);
		cb[7].setBounds(320, 560, 60, 30);
		cb[8].setBounds(440, 560, 60, 30);
		cb[9].setBounds(560, 560, 60, 30);
		
		
		cb[10].setBounds(200, 600, 60, 30);
		cb[11].setBounds(320, 600, 70, 30);
		cb[12].setBounds(440, 600, 60, 30);
		cb[13].setBounds(560, 600, 60, 30);
		
		tx[9].setBounds(200, 640, 300, 30);
		
		ta.setBounds(200, 680, 450, 100);
		ta.setFont(ft);
		
		Label lb1 = new Label("메일 수신동의 :");
		lb1.setBounds(20, 800, 150, 30);
		lb1.setFont(new Font(null,Font.PLAIN+Font.BOLD,15));
		f.add(lb1);
		cb[14]=new Checkbox("동의합니다.",false,cg);
		cb[14].setBounds(250, 800, 100, 30);
		cb[15]=new Checkbox("동의하지 않습니다.",false,cg);
		cb[15].setBounds(450, 800, 150, 30);
		
		
		
		bt[3].setBounds(250, 840, 80, 25);
		bt[4].setBounds(450, 840, 80, 25);
		
		
		
		
		
		
		f.add(ta);
		
		f.add(cb[14]);
		f.add(cb[15]);
		
		f.add(cb[0]);
		f.add(cb[1]);
		f.add(cb[2]);
		f.add(cb[3]);
		f.add(cb[4]);
		f.add(cb[5]);
		f.add(cb[6]);
		f.add(cb[7]);
		f.add(cb[8]);
		f.add(cb[9]);
		f.add(cb[10]);
		f.add(cb[11]);
		f.add(cb[12]);
		f.add(cb[13]);
		
		
		
		f.add(bt[0]);
		f.add(bt[1]);
		f.add(bt[2]);
		f.add(bt[3]);
		f.add(bt[4]);
		
		
		f.add(cs[0]);
		f.add(cs[1]);
		f.add(cs[2]);
		f.add(cs[3]);
		f.add(cs[4]);
		
		f.add(tx[0]);
		f.add(tx[1]);
		f.add(tx[2]);
		f.add(tx[3]);
		f.add(tx[4]);
		f.add(tx[5]);
		f.add(tx[6]);
		f.add(tx[7]);
		f.add(tx[8]);
		f.add(tx[9]);
		
		
		f.add(p);
	}
	
	
}

public class MemberLogin_p {
	public static void main(String [] args){
		new MemberFirst("회원가입 메뉴");
		
		
	}
}
