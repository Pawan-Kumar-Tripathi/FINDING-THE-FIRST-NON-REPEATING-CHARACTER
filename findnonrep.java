import java.io.*;
import java.util.*;
class findnonrep
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        
        for(int i =0;i<st.length();i++)
        {
             boolean unique = true;
            for(int j = 0;j<st.length();j++)
            {
                if(i != j && st.charAt(i) == st.charAt(j))
                {
                    unique = false ;
                }
            }
            if(unique )
            {
                System.out.println(st.charAt(i));
                break;
            }
        }
    }
}