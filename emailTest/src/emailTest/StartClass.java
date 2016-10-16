package emailTest;

import java.util.Properties;

public class StartClass {
	public static void main(String [] args){
		
		
		Properties gmailProps = new Properties();
        gmailProps.put("mail.smtp.starttls.enable", "true"); 
        gmailProps.put("mail.smtp.host", "localhost"); //smtp.gmail.com 로 설정시 gmail.smtp 서버 사용.
        gmailProps.put("mail.smtp.auth", "true"); //인증 
        gmailProps.put("mail.smtp.port", "587");//포트번호 설정. smtp서버의 
         
        Properties jamesProps = new Properties();
        jamesProps.put("mail.smtp.host", "localhost"); //
         
        String from = "ts.choi@spicegrid.net";
        // 보내는이 메일주소
        String to = "imcts@nate.com,";
        // 받는이 이메일 주소는 반드시 ","로 구분해준다. String to = "받을 이메일 주소1,받을 이메일 주소2";
        String subject = "이메일 발송 테스트";
        String content = "안녕하세요 Java Email 발송 테스트입니다.";
         
        EmailSender emailSender = new EmailSender(jamesProps);
        emailSender.sendEmail(from, to, subject, content);
        System.out.println("성공?");
	}

}
