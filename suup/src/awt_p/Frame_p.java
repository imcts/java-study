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
		Frame f = new Frame("회원가입"); // 프레임을 만들어주고.
		Button bt = new Button("눌러봐"); // 버튼을 만들 수 있고
		Choice email = new Choice(); // 초이스버튼을 만들어주고
		List job = new List(3, true); // 리스트 버튼을 만들어주고 숫자값 넣어주면 다중선택 가능.
		Label lb = new Label("이거라벨이냐?");

		f.setBounds(600, 400, 600, 500);
		bt.setBounds(50, 50, 50, 50);
		email.setBounds(50, 120, 100, 100);
		job.setBounds(50, 180, 100, 50);
		lb.setBounds(50, 150, 200, 50);

		CheckboxGroup cg = new CheckboxGroup();

		String[] str = { "사이퍼즈", "반장구경", "달리기", "농구" };
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

		job.add("오징어");
		job.add("문어");
		job.add("오다리");
		job.add("문어깡");

		f.add(c);
		f.add(scrol1);
		f.add(scrol);
		f.add(ta);
		f.add(id);
		f.add(lb);
		f.add(job);
		f.add(email);
		f.add(bt);
		f.setLayout(null); // 위치선정을 니가 알아서 잡아. 하고 던져주지 않게 하려면 layout을 잡아줘야한다.
		f.setVisible(true);

	}
}
