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
            Message msg = new MimeMessage(session); //session ���� props�� �޾Ƽ� ���� ���� class ����.
             
            msg.setFrom(new InternetAddress(from)); //������ ��� ����.
            // Recipients �޴»��
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            msg.setSubject(subject); //����
            msg.setContent(content, "text/html; charset=UTF-8"); //���� + charset����. �� ������ �����ָ� �ѱ��� ���� ����� ����.
            msg.setSentDate(new Date());//���� ���� ����.
            Transport.send(msg); //���� ����.
        } catch (MessagingException e) {
 
            e.printStackTrace();
            
        }
 
    }
     
    class EmailAuthenticator extends Authenticator { //������ Ŭ����.
 
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

