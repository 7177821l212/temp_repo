public class vowel
{  
    public static void main(String[] args) {
        String str = "bob";
        char vow = '\0';
        for(int i = 0; i < str.length(); i++)
        {  
            char curr = str.charAt(i);
            if(curr == 'a' || curr == 'e'|| curr == 'i' || curr == 'o' || curr == 'u' )
            {
                vow = curr;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++)
        {
            sb.append(vow);
        }
        System.out.print(sb.toString());

    }
}