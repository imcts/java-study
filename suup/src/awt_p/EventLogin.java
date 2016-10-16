package awt_p;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//1. inner: 이 리스너를 다른데서 쓸 수 없음
//2. 필요한놈만 : 다른창에 대한 접근쉬운데 모든일을 한꺼번에받
//3. 프레임을 통ㅇ으로: 다루기 쉽고 접근쉬운데 무거움

class EventMem
{
	String id,pw,name;

	public EventMem(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
}
class DDDDD extends Dialog implements ActionListener
{
	Frame ff;
	String msg;
	MainFrame nextFrame;
	String [] arr;
	public DDDDD(Frame ff, String msg, MainFrame nextFrame) {		//super는 프레임을 필요로 해서 ff 넣어줌//이렇게하는건 종속적이지 않아서..음
		
		// TODO Auto-generated constructor stub
		super(ff);

		this.nextFrame = nextFrame;
		this.msg = msg;
		this.ff = ff;
		
		
		setLayout(new GridLayout(3,2));
		 arr = msg.split(",");
		 add(new Label(arr[1]));
		add(new Label(msg));
		Button btn = new Button("확인");		//맞았을때 누르면 main으로 가고 아니면 가만히 이쓰면대요
		add(btn);
		setBounds(0, 0, 300, 200);
		setVisible(true);
		addWindowListener(new WinC());
		
		btn.addActionListener(this);		//지 버튼은 지가 갖고있음. 클래스로 구현 ㄴㄴ
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(arr[1].equals("로그인성공"))
		{
//			ff.setVisible(false);
			ff.dispose();
			nextFrame.lb.setText(arr[0]+"로그인됨됨요");
			nextFrame.setVisible(true);		//로그인 성공했을때 눈에 보이게 해주삼
		}
		dispose();			//자기꺼 닫을땐 오호
	}
}

class BtnListener implements ActionListener{
	
	Map<String,EventMem> map = new HashMap();
	EventLogin ff;
	public BtnListener(EventLogin ff) {
		// TODO Auto-generated constructor stub
		this.ff = ff;
		map.put("aaa",new EventMem("","",""));
		map.put("bbb",new EventMem("","",""));
		map.put("ccc",new EventMem("","",""));
		map.put("ddd",new EventMem("","",""));
		map.put("fff",new EventMem("","",""));
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//id pw 같을때 로그인 성공
		
		String msg="aa,로그인 실패";
		
		if(map.containsKey(ff.id.getText()))
		{
			if(map.get(ff.id.getText()).pw.equals(ff.pw.getText()))
			msg = map.get(ff.id.getText()).name+",로그인 성공";
		}
		
			
		
		new DDDDD(ff,msg,ff.nextFrame);			//DDDDD에 id와 msg보냄
		
		
	}
}

class MainFrame extends Frame implements ActionListener
{
	EventLogin login;
	
	Label lb= new Label();
	public MainFrame(EventLogin login) {
		 super("메인 프레임");
		 this.login=login;
		setBounds(300, 500, 300, 200);		
		setLayout(new GridLayout(2,1));
		
		Button btn = new Button("로그아웃");
		
		add(new Label(lb+" 로그인 됨"));
		add(btn);
		
		setVisible(true);
		
		addWindowListener(new WinC());
		
		btn.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		login.pw.setText("");		//암호지워야햄
		login.setVisible(true);		//자기자신이 죽는것도 보여쥼
		dispose();
		
	}
}

public class EventLogin extends Frame{
	
	TextField id = new TextField();
	TextField pw = new TextField();
	
	MainFrame nextFrame = new MainFrame(this);			//보내는게 어디로 보낼지 알아야 받지?...
	public EventLogin() {
		// TODO Auto-generated constructor stub
		super("로그인");
		setBounds(300, 500, 300, 200);		

		Button btn = new Button("로그인");
		
		add(new Label("아이디"));
		add(id);
		add(new Label("암호"));
		add(pw);
		add(btn);
		
		
		setVisible(false);	//true하면 이미 띄여있는 상태
		
		addWindowListener(new WinC());
		
		btn.addActionListener(new BtnListener(this));
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EventLogin();   
	}

}
