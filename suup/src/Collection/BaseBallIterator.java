package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BaseBallIterator {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String [] pArr = {
        "h_이대호","p_오승환","h_추신수","c_다리미슛",
        "h_박정권","p_류현진","h_정근우","p_피에","c_조인성"};
    
               //의미없다, 타자, 투수, 포수
    char [] iArr = {'a','h','p','c'};  ////선수 구분 으로 사용할 데이터 배열
    List index = new ArrayList();    /// 선수 구분 리스트 생성
    
    for(char buf : iArr)  ///선수 구분 배열 돌리기
      index.add(buf);    ///돌린 구분 내용을 선수 구분 리스트에 추가 
    
    List player = new ArrayList();  ///선수를 받을 리스트의 리스트 생성(2차원 리스트)
    
    for(Object buf : index)      /// 선수 구분 리스트 만큼 돌리기
    player.add(new ArrayList());  /// 선수 구분 리스트 갯수만큼 선수 리스트에 리스트 추가
                                   /// 1차원 리스트 에 각각 리스트 추가형태
                                   /// 선수리스트
                                        // 0 - 선수리스트 원본(의미없다)
                          // 1 - 선수리스트 타자
                      // 2 - 선수리스트 투수
                      // 3 - 선수리스트 포수
    
    for(String buf : pArr)      ///// 선수 배열 한명씩 돌리기
      ((List)player.get(0)).add(buf);  ///// 0 - 선수리스트 원본(의미없다)에 추가
    
    Iterator it = ((List)player.get(0)).iterator();
            ///선수리스트의 0 번을 리스트로 형변환->   iterator 추출
    
    
    while(it.hasNext())  //iterator 돌리기(선수명단이 돌려짐)
    {
      String buf = (String)it.next();//각 선수 받아옴
      
      char ch = buf.charAt(0);    // 첫번째 글자 char로 받음 : h_이대호 -> h
      int nn = index.indexOf(ch);     // index 리스트 (선수 구분 리스트에서 몇번째인지 확인)
                        //  index : a, h, p , c
                        //          0, 1, 2,  3   ---> 1 넘어옴 --> nn
      List li = ((List)player.get(nn));
                          //선수 이름을 넣을 선수리스트를 가져온다
                          // player.get(0) : 전체
             //li 로 넘김 <=== player.get(1) : h  <----- 1번이므로 이녀석 리턴
                // player.get(2) : p
                // player.get(3) : c
        /// 리스트는 객체이므로 li로 넘겨도 주소로 선수 리스트의 해당에 자동으로 들어감
        
                         
      String str = buf.substring(2);
                     ///선수 이름 추출  h_이대호 -> 이대호
      li.add(str);
      /// 선수 리스트에 추가
      
    }
    
    it = player.iterator();
    
    while(it.hasNext())
      System.out.println(it.next());
  
  }

}
 