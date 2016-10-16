package mypakege;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapBaseBall {

  public static void main(String[] args) {//main 메소드 시작.
 
    String [] rr = {"h3","a5","a7","h9","h1","h3","a5","a6","h2","a3","a5","h9","h3","a7","h9"}; //String rr = home팀과 away팀의 성적 배열.
    
    
    Map<Character,TreeMap<Character,Integer>> totmap = new LinkedHashMap();//Map totmap = LinkedHashMap()으로 생성. 
    //tot map <key값은 caracter만, value는 TreeMap만 생성 가능> 제너레이션.  TreeMap<key값은 Character, value는 Integer만 입력가능.> 제너레이션
    totmap.put('h', new TreeMap()); //totmap에 key : h , value : TreeMap() put.
    totmap.put('a', new TreeMap()); //totmap에 key : a , value : TreeMap() put.
    
    
    for(String buf:rr) //String 배열 rr로 확장for 실행.
    {
      char [] arr = buf.toCharArray(); //Char [] 배열 arr 생성 후 , buf값을 toCharArray()로 arr[] 배열에 입력. buf가 가지고 있는 값이 h 3 이라면 arr[0]은 h , arr[1]은 3이 입력.
      
      
      
      if((totmap.get(arr[0])).containsKey(arr[1])) //arr[0]을 키값으로 실행시키면 그 value값은 TreeMap이 가지고있는 키값이 나오는데, 그 값중에 arr[1]을 포함하고있는지를 물어보고 포함하면 실행.
      (totmap.get(arr[0])).put(arr[1],totmap.get(arr[0]).get(arr[1])+1); 
      //totmap.get(arr[0])= totmap이 가지고있는 키 값중에 arr[0]값을 가진 value를 찾아옴.
      //h 키값을가진 TreeMap을 찾으면 그 TreeMap에 put실행. 
      //arr[1], 선수번호를 키값으로 주고, totmap.get(arr[0])으로 = totmap이 가지고있는 arr[0]번의 TreeMap의 arr[1]의 키값을 가져와서 +1 시킴. 
      //결과적으로 해당 트리맵을 검색해서 그 트리맵에 키값을 주고, 다시 그 키값으로 불러온 값을 +1 해줌.
      
      else
        (totmap.get(arr[0])).put(arr[1], 1);//totmap에 해당 키 값이 없다면 새로 키 값을 입력하고 값을 입력하되 그 초기값은 1이됨.
    }
    

    
    Iterator it = totmap.keySet().iterator(); //Iterator it 에 totmap의 키값으로 이터레이터에 입력. EntrySet()으로 실행시에는 키값과 밸류값이 다 들어가게됨.
    														  //syso로 테스트해볼것. h와 a가 다 들어가있는지.
    

    while(it.hasNext())//it이 비어있지 않다면 while문 구동.
    {
      Map<Character,Integer> sub = (totmap.get(it.next())); //totmap.get(it.next())); = totmap에 있는 키값으로 TreeMap을 가져온 후 sub에 그 TreeMap을 대입.
      																					//현재 totmap안에 있는 TreeMap의 제너레이션은 <Character,Integer>이므로 맞춰서 연동시킴.
      																					//현재 Iterator의 it.next() 에는 h값과 a값이 들어있으므로, 먼저 h의 TreeMap을 Map sub에 대입. 
      
      Iterator subit=  sub.keySet().iterator(); //sub에는 h의 TreeMap이 1차적으로 대입되어있으므로 그 키 값을 iterator에 연동.
      
      while(subit.hasNext()) //Iterator subit 이 빌때까지 while문 구동.
      {
        Object subkey = subit.next(); //subit.next();를 실행하면 해당 TreeMap의 키 값이 Object subkey로 대입됨. 
        System.out.println(subkey+":"+graph(sub.get(subkey))); //subkey는 TreeMap이 가지고있는 key값 : graph()메소드를 실행. 
        																					//graph()메소드에 인수로 sub.get(subkey)를 연동. sub에는 현재 TreeMap이 들어있고, subit에는 그 키값이 들어있음. 
        																					//실행 시키게 되면, sub.get(subkey) - > sub(h.Treemap)에 subkey(선수등번호) 값을 던져주게 되고 , 해당 TreeMap의 값은 graph로 연동.
      }
      System.out.println("-----------------------------"); //h팀과 a팀을 구문지어줄 ----------- 출력문.
    }

  }
  
  static String graph(int vv)//넘어온 키값의 수만큼 별을 찍어주는 메소드, 인수로 int vv를 받는데, 이 값은 h와 a의 TreeMap에 있는 값들이 됨.  현재 출력 상태는 ( subkey : )
  {
    String res="";//결과값을 리턴해줄 String 변수 res 생성.
    for(int i=0;i<vv;i++)//넘어온 수만큼 별을 찍어줄 for문 구동.
    {
      res+="*"; //res+= * ;
    }
    return res; //별의 개수 리턴.
  }

}