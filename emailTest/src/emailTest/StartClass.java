package emailTest;

import java.util.Properties;

public class StartClass {
	public static void main(String [] args){
		
		
		Properties gmailProps = new Properties();
        gmailProps.put("mail.smtp.starttls.enable", "true"); 
        gmailProps.put("mail.smtp.host", "localhost"); //smtp.gmail.com �� ������ gmail.smtp ���� ���.
        gmailProps.put("mail.smtp.auth", "true"); //���� 
        gmailProps.put("mail.smtp.port", "587");//��Ʈ��ȣ ����. smtp������ 
         
        Properties jamesProps = new Properties();
        jamesProps.put("mail.smtp.host", "localhost"); //
         
        String from = "ts.choi@spicegrid.net";
        // �������� �����ּ�
        String to = "imcts@nate.com,";
        // �޴��� �̸��� �ּҴ� �ݵ�� ","�� �������ش�. String to = "���� �̸��� �ּ�1,���� �̸��� �ּ�2";
        String subject = "�̸��� �߼� �׽�Ʈ";
        String content = "�ȳ��ϼ��� Java Email �߼� �׽�Ʈ�Դϴ�.";
         
        EmailSender emailSender = new EmailSender(jamesProps);
        emailSender.sendEmail(from, to, subject, content);
        System.out.println("����?");
	}

}
