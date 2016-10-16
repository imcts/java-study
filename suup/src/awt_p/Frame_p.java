package awt_p;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;
import java.util.ArrayList;

public class Frame_p {
	public static void main(String[] args) {
		Frame f = new Frame("ȸ������"); // �������� ������ְ�.
		Button bt = new Button("������"); // ��ư�� ���� �� �ְ�
		Choice email = new Choice(); // ���̽���ư�� ������ְ�
		List job = new List(3, true); // ����Ʈ ��ư�� ������ְ� ���ڰ� �־��ָ� ���߼��� ����.
		Label lb = new Label("�̰Ŷ��̳�?");

		f.setBounds(600, 400, 600, 500);
		bt.setBounds(50, 50, 50, 50);
		email.setBounds(50, 120, 100, 100);
		job.setBounds(50, 180, 100, 50);
		lb.setBounds(50, 150, 200, 50);

		CheckboxGroup cg = new CheckboxGroup();

		String[] str = { "��������", "���屸��", "�޸���", "��" };
		for (int i = 0; i < str.length; i++) {
			Checkbox cb = new Checkbox(str[i], false, cg);
			cb.setBounds(i * 100 + 100, 200, 100, 50);
			f.add(cb);
		}

		TextField id = new TextField();
		id.setBounds(300, 50, 100, 30);
		id.setEchoChar('d');

		TextArea ta = new TextArea();
		ta.setBounds(300, 80, 100, 300);

		Scrollbar scrol = new Scrollbar(Scrollbar.HORIZONTAL, 20, 5, 0, 50);
		scrol.setBounds(150, 300, 350, 30);

		Scrollbar scrol1 = new Scrollbar(Scrollbar.VERTICAL, 50, 80, 0, 250);
		scrol.setBounds(150, 80, 30, 200);

		Canvas c = new Canvas();
		c.setBounds(200, 50, 200, 200);
		c.setBackground(Color.pink);

		email.add("a");
		email.add("b");
		email.add("c");

		job.add("��¡��");
		job.add("����");
		job.add("���ٸ�");
		job.add("�����");

		f.add(c);
		f.add(scrol1);
		f.add(scrol);
		f.add(ta);
		f.add(id);
		f.add(lb);
		f.add(job);
		f.add(email);
		f.add(bt);
		f.setLayout(null); // ��ġ������ �ϰ� �˾Ƽ� ���. �ϰ� �������� �ʰ� �Ϸ��� layout�� �������Ѵ�.
		f.setVisible(true);

	}
}
