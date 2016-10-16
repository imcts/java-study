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

//1. inner: �� �����ʸ� �ٸ����� �� �� ����
//2. �ʿ��ѳ� : �ٸ�â�� ���� ���ٽ�� ������� �Ѳ�������
//3. �������� �뤷����: �ٷ�� ���� ���ٽ�� ���ſ�

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
	public DDDDD(Frame ff, String msg, MainFrame nextFrame) {		//super�� �������� �ʿ�� �ؼ� ff �־���//�̷����ϴ°� ���������� �ʾƼ�..��
		
		// TODO Auto-generated constructor stub
		super(ff);

		this.nextFrame = nextFrame;
		this.msg = msg;
		this.ff = ff;
		
		
		setLayout(new GridLayout(3,2));
		 arr = msg.split(",");
		 add(new Label(arr[1]));
		add(new Label(msg));
		Button btn = new Button("Ȯ��");		//�¾����� ������ main���� ���� �ƴϸ� ������ �̾�����
		add(btn);
		setBounds(0, 0, 300, 200);
		setVisible(true);
		addWindowListener(new WinC());
		
		btn.addActionListener(this);		//�� ��ư�� ���� ��������. Ŭ������ ���� ����
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(arr[1].equals("�α��μ���"))
		{
//			ff.setVisible(false);
			ff.dispose();
			nextFrame.lb.setText(arr[0]+"�α��εʵʿ�");
			nextFrame.setVisible(true);		//�α��� ���������� ���� ���̰� ���ֻ�
		}
		dispose();			//�ڱⲨ ������ ��ȣ
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
		//id pw ������ �α��� ����
		
		String msg="aa,�α��� ����";
		
		if(map.containsKey(ff.id.getText()))
		{
			if(map.get(ff.id.getText()).pw.equals(ff.pw.getText()))
			msg = map.get(ff.id.getText()).name+",�α��� ����";
		}
		
			
		
		new DDDDD(ff,msg,ff.nextFrame);			//DDDDD�� id�� msg����
		
		
	}
}

class MainFrame extends Frame implements ActionListener
{
	EventLogin login;
	
	Label lb= new Label();
	public MainFrame(EventLogin login) {
		 super("���� ������");
		 this.login=login;
		setBounds(300, 500, 300, 200);		
		setLayout(new GridLayout(2,1));
		
		Button btn = new Button("�α׾ƿ�");
		
		add(new Label(lb+" �α��� ��"));
		add(btn);
		
		setVisible(true);
		
		addWindowListener(new WinC());
		
		btn.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		login.pw.setText("");		//��ȣ��������
		login.setVisible(true);		//�ڱ��ڽ��� �״°͵� ������
		dispose();
		
	}
}

public class EventLogin extends Frame{
	
	TextField id = new TextField();
	TextField pw = new TextField();
	
	MainFrame nextFrame = new MainFrame(this);			//�����°� ���� ������ �˾ƾ� ����?...
	public EventLogin() {
		// TODO Auto-generated constructor stub
		super("�α���");
		setBounds(300, 500, 300, 200);		

		Button btn = new Button("�α���");
		
		add(new Label("���̵�"));
		add(id);
		add(new Label("��ȣ"));
		add(pw);
		add(btn);
		
		
		setVisible(false);	//true�ϸ� �̹� �翩�ִ� ����
		
		addWindowListener(new WinC());
		
		btn.addActionListener(new BtnListener(this));
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EventLogin();   
	}

}
