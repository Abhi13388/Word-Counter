import java.util.*;

public class WordCounter {
    public static void main(String[] args)
     {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text ");
        String s = sc.nextLine();

        int count = 1, frequency = 1;
        for (int i = 0; i < s.length() - 1; i++) 
        {
            if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) 
            {
                count++;
            }
       
        }
        System.out.println(count);

        String s2[] = s.split(" ");
        Map<String, Integer> mp = new HashMap<String, Integer>();
        for (int i = 0; i < s2.length; i++) 
        {
            if (mp.containsKey(s2[i]))
             {
                mp.put(s2[i], mp.get(s2[i]) + 1);
            } else {
                mp.put(s2[i], 1);
           
            }
        
        }
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            System.out.println("Frequency of " + entry.getKey() + " " + entry.getValue());
        }

    }
}
