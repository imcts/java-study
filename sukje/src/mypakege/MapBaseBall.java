package mypakege;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapBaseBall {

  public static void main(String[] args) {//main �޼ҵ� ����.
 
    String [] rr = {"h3","a5","a7","h9","h1","h3","a5","a6","h2","a3","a5","h9","h3","a7","h9"}; //String rr = home���� away���� ���� �迭.
    
    
    Map<Character,TreeMap<Character,Integer>> totmap = new LinkedHashMap();//Map totmap = LinkedHashMap()���� ����. 
    //tot map <key���� caracter��, value�� TreeMap�� ���� ����> ���ʷ��̼�.  TreeMap<key���� Character, value�� Integer�� �Է°���.> ���ʷ��̼�
    totmap.put('h', new TreeMap()); //totmap�� key : h , value : TreeMap() put.
    totmap.put('a', new TreeMap()); //totmap�� key : a , value : TreeMap() put.
    
    
    for(String buf:rr) //String �迭 rr�� Ȯ��for ����.
    {
      char [] arr = buf.toCharArray(); //Char [] �迭 arr ���� �� , buf���� toCharArray()�� arr[] �迭�� �Է�. buf�� ������ �ִ� ���� h 3 �̶�� arr[0]�� h , arr[1]�� 3�� �Է�.
      
      
      
      if((totmap.get(arr[0])).containsKey(arr[1])) //arr[0]�� Ű������ �����Ű�� �� value���� TreeMap�� �������ִ� Ű���� �����µ�, �� ���߿� arr[1]�� �����ϰ��ִ����� ����� �����ϸ� ����.
      (totmap.get(arr[0])).put(arr[1],totmap.get(arr[0]).get(arr[1])+1); 
      //totmap.get(arr[0])= totmap�� �������ִ� Ű ���߿� arr[0]���� ���� value�� ã�ƿ�.
      //h Ű�������� TreeMap�� ã���� �� TreeMap�� put����. 
      //arr[1], ������ȣ�� Ű������ �ְ�, totmap.get(arr[0])���� = totmap�� �������ִ� arr[0]���� TreeMap�� arr[1]�� Ű���� �����ͼ� +1 ��Ŵ. 
      //��������� �ش� Ʈ������ �˻��ؼ� �� Ʈ���ʿ� Ű���� �ְ�, �ٽ� �� Ű������ �ҷ��� ���� +1 ����.
      
      else
        (totmap.get(arr[0])).put(arr[1], 1);//totmap�� �ش� Ű ���� ���ٸ� ���� Ű ���� �Է��ϰ� ���� �Է��ϵ� �� �ʱⰪ�� 1�̵�.
    }
    

    
    Iterator it = totmap.keySet().iterator(); //Iterator it �� totmap�� Ű������ ���ͷ����Ϳ� �Է�. EntrySet()���� ����ÿ��� Ű���� ������� �� ���Ե�.
    														  //syso�� �׽�Ʈ�غ���. h�� a�� �� ���ִ���.
    

    while(it.hasNext())//it�� ������� �ʴٸ� while�� ����.
    {
      Map<Character,Integer> sub = (totmap.get(it.next())); //totmap.get(it.next())); = totmap�� �ִ� Ű������ TreeMap�� ������ �� sub�� �� TreeMap�� ����.
      																					//���� totmap�ȿ� �ִ� TreeMap�� ���ʷ��̼��� <Character,Integer>�̹Ƿ� ���缭 ������Ŵ.
      																					//���� Iterator�� it.next() ���� h���� a���� ��������Ƿ�, ���� h�� TreeMap�� Map sub�� ����. 
      
      Iterator subit=  sub.keySet().iterator(); //sub���� h�� TreeMap�� 1�������� ���ԵǾ������Ƿ� �� Ű ���� iterator�� ����.
      
      while(subit.hasNext()) //Iterator subit �� �������� while�� ����.
      {
        Object subkey = subit.next(); //subit.next();�� �����ϸ� �ش� TreeMap�� Ű ���� Object subkey�� ���Ե�. 
        System.out.println(subkey+":"+graph(sub.get(subkey))); //subkey�� TreeMap�� �������ִ� key�� : graph()�޼ҵ带 ����. 
        																					//graph()�޼ҵ忡 �μ��� sub.get(subkey)�� ����. sub���� ���� TreeMap�� ����ְ�, subit���� �� Ű���� �������. 
        																					//���� ��Ű�� �Ǹ�, sub.get(subkey) - > sub(h.Treemap)�� subkey(�������ȣ) ���� �����ְ� �ǰ� , �ش� TreeMap�� ���� graph�� ����.
      }
      System.out.println("-----------------------------"); //h���� a���� ���������� ----------- ��¹�.
    }

  }
  
  static String graph(int vv)//�Ѿ�� Ű���� ����ŭ ���� ����ִ� �޼ҵ�, �μ��� int vv�� �޴µ�, �� ���� h�� a�� TreeMap�� �ִ� ������ ��.  ���� ��� ���´� ( subkey : )
  {
    String res="";//������� �������� String ���� res ����.
    for(int i=0;i<vv;i++)//�Ѿ�� ����ŭ ���� ����� for�� ����.
    {
      res+="*"; //res+= * ;
    }
    return res; //���� ���� ����.
  }

}