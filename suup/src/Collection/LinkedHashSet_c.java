package Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Order implements Comparator
{
  @Override
  public int compare(Object o1, Object o2) {
    // TODO Auto-generated method stub
    //return -1;
    Comparable oo1 = (Comparable)o1;
    Comparable oo2 = (Comparable)o2;
    //System.out.println(o1+":"+o2+"=> "+oo1.compareTo(oo2));
    
    if(oo1.compareTo(oo2)==0)
      return 1;
    return oo1.compareTo(oo2);
  }
}

class OrderSt implements Comparator
{
  @Override
  public int compare(Object o1, Object o2) {

    Comparable oo1 = ((OrderStud)o1).avg;
    Comparable oo2 = ((OrderStud)o2).avg;
    
    if(oo1.compareTo(oo2)==0){
    	 Comparable kor1 = ((int)(((OrderStud)o1).jum).get(0));
    	 Comparable kor2 = ((int)(((OrderStud)o2).jum).get(0));
    	 if(kor1.compareTo(kor2)==0){
        	 Comparable eng1 = ((int)(((OrderStud)o1).jum).get(1));
        	 Comparable eng2 = ((int)(((OrderStud)o2).jum).get(1));
        	   return eng1.compareTo(eng2)*-1; //평균이 같을때 국어점수값을 올려버림.  
        	 
        }  
    	 return kor1.compareTo(kor2)*-1; //평균이 같을때 국어점수값을 올려버림.  
    	 
    }
    	
    return oo1.compareTo(oo2)*-1;
  }
}

class OrderStud
{
  String name;
  List jum = new ArrayList();
  int sum=0,avg;
  
  public OrderStud(String name, int kor, int eng,int mat) {
    this.name = name;
    jum.add(kor);
    jum.add(eng);
    jum.add(mat);
    cal();
  }
  
  void cal()
  {
    for(Object buf: jum)
      sum+=(int)buf;
    
    avg = sum/jum.size();
  }

  @Override
  public String toString() {
    return name + ", " + jum + ", " + sum  + ", " + avg;
  }
  
  
}
public class LinkedHashSet_c {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    int [] data = {1,3,76,4,376,90,432,14,7,9,3,1,4,7,5,3,23,5,767,7,7,7,76};
    
    Set s1 = new HashSet();
    Set s2 = new LinkedHashSet();
   // Set s3 = new TreeSet(new Order());
    Set s3 = new TreeSet();
    TreeSet s4 = new TreeSet();
    TreeSet s5 = new TreeSet();
    
    for(int buf : data)
    {
      s1.add(buf);
      s2.add(buf);
      s3.add(buf);
      s4.add(buf);
      s5.add(buf);
    }
    
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4.headSet(50)); //50보다 앞쪽의 것들. 
    System.out.println(s4.tailSet(50)); //50보다 뒤쪽의 것들. 
    System.out.println("------------------------------------------");
    System.out.println(s5.headSet(50)); //50보다 앞쪽의 것들. 
    System.out.println(s5.tailSet(50)); //50보다 뒤쪽의 것들.  트리셋의 경우에는 컴페어를 하면 -1정렬과 1정렬로 나뉘기떄문. 
    
    
  /*  Set stSet = new TreeSet(new OrderSt());
    
    stSet.add(new OrderStud("한가인",88,87,86));
    stSet.add(new OrderStud("두가인",91,98,97));
    stSet.add(new OrderStud("삼가인",65,67,68));
    stSet.add(new OrderStud("사가인",88,86,87));
    stSet.add(new OrderStud("오가인",44,45,48));
    
    Iterator it = stSet.iterator();
    
    while(it.hasNext())
      System.out.println(it.next());*/
    
    System.out.println();
  }

}
