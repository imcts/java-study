package excep_p;

public class Excep369 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
  
    for(int i=1;i<=99;i++)
    {
      try{
        
        int aa = 123456/(i%10%3);
        
        try{
          int aaa = 12345/(i/10%3);
          System.out.print(i);
        }catch(Exception eee)
        {
          System.out.print("¦");
        }
        
      }catch(Exception e)
      {
        try{
          int aaa = 12345/(i%10);
          
          
          try{
            int aaaaaa = 12345/(i/10%3);
            
          }catch(Exception eee)
          {
            System.out.print("¦");
          }

          System.out.print("¦");
        }catch(Exception ee)
        {
          try{
            int aaa = 12345/(i/10%3);
            System.out.print(i);
          }catch(Exception eee)
          {
            System.out.print("¦");
          }
        }
      }
      System.out.println();
    }    
  }

}