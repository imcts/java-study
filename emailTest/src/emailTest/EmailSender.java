package emailTest;
import java.util.Date;
import java.util.Properties;
 
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
 
public class EmailSender {
 
    private Properties props;
    private String id, pass;
     
    public EmailSender(Properties props) {
        this.props = props;
        this.id = "root";
        this.pass = "root";
    }
     
    public void sendEmail(String from, String to, String subject, String content) {
 
        EmailAuthenticator authenticator = new EmailAuthenticator(id, pass);
 
        Session session = Session.getInstance(props, authenticator);
         
        try {
            Message msg = new MimeMessage(session); //session 에서 props를 받아서 메일 보낼 class 생성.
             
            msg.setFrom(new InternetAddress(from)); //보내는 사람 설정.
            // Recipients 받는사람
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            msg.setSubject(subject); //제목
            msg.setContent(content, "text/html; charset=UTF-8"); //내용 + charset설정. 이 설정을 안해주면 한글이 깨질 우려가 있음.
            msg.setSentDate(new Date());//보낸 날자 설정.
            Transport.send(msg); //메일 전송.
        } catch (MessagingException e) {
 
            e.printStackTrace();
            
        }
 
    }
     
    class EmailAuthenticator extends Authenticator { //인증용 클래스.
 
        private String id; 
        private String pw; 
 
        public EmailAuthenticator(String id, String pw) {
            this.id = id;
            this.pw = pw;
        }
 
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(id, pw);
        }
 
    }
 
}

