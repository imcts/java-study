package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BaseBallIterator {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String [] pArr = {
        "h_�̴�ȣ","p_����ȯ","h_�߽ż�","c_�ٸ��̽�",
        "h_������","p_������","h_���ٿ�","p_�ǿ�","c_���μ�"};
    
               //�ǹ̾���, Ÿ��, ����, ����
    char [] iArr = {'a','h','p','c'};  ////���� ���� ���� ����� ������ �迭
    List index = new ArrayList();    /// ���� ���� ����Ʈ ����
    
    for(char buf : iArr)  ///���� ���� �迭 ������
      index.add(buf);    ///���� ���� ������ ���� ���� ����Ʈ�� �߰� 
    
    List player = new ArrayList();  ///������ ���� ����Ʈ�� ����Ʈ ����(2���� ����Ʈ)
    
    for(Object buf : index)      /// ���� ���� ����Ʈ ��ŭ ������
    player.add(new ArrayList());  /// ���� ���� ����Ʈ ������ŭ ���� ����Ʈ�� ����Ʈ �߰�
                                   /// 1���� ����Ʈ �� ���� ����Ʈ �߰�����
                                   /// ��������Ʈ
                                        // 0 - ��������Ʈ ����(�ǹ̾���)
                          // 1 - ��������Ʈ Ÿ��
                      // 2 - ��������Ʈ ����
                      // 3 - ��������Ʈ ����
    
    for(String buf : pArr)      ///// ���� �迭 �Ѹ� ������
      ((List)player.get(0)).add(buf);  ///// 0 - ��������Ʈ ����(�ǹ̾���)�� �߰�
    
    Iterator it = ((List)player.get(0)).iterator();
            ///��������Ʈ�� 0 ���� ����Ʈ�� ����ȯ->   iterator ����
    
    
    while(it.hasNext())  //iterator ������(��������� ������)
    {
      String buf = (String)it.next();//�� ���� �޾ƿ�
      
      char ch = buf.charAt(0);    // ù��° ���� char�� ���� : h_�̴�ȣ -> h
      int nn = index.indexOf(ch);     // index ����Ʈ (���� ���� ����Ʈ���� ���°���� Ȯ��)
                        //  index : a, h, p , c
                        //          0, 1, 2,  3   ---> 1 �Ѿ�� --> nn
      List li = ((List)player.get(nn));
                          //���� �̸��� ���� ��������Ʈ�� �����´�
                          // player.get(0) : ��ü
             //li �� �ѱ� <=== player.get(1) : h  <----- 1���̹Ƿ� �̳༮ ����
                // player.get(2) : p
                // player.get(3) : c
        /// ����Ʈ�� ��ü�̹Ƿ� li�� �Ѱܵ� �ּҷ� ���� ����Ʈ�� �ش翡 �ڵ����� ��
        
                         
      String str = buf.substring(2);
                     ///���� �̸� ����  h_�̴�ȣ -> �̴�ȣ
      li.add(str);
      /// ���� ����Ʈ�� �߰�
      
    }
    
    it = player.iterator();
    
    while(it.hasNext())
      System.out.println(it.next());
  
  }

}
 