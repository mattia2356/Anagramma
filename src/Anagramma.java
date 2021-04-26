public class Anagramma 
{
    //calcolo anagramma
    public void anagramma(String prefisso, String suffisso)
    {
        String newPrefix, newSuffix;
        int numOfChars = suffisso.length();
        if (numOfChars == 1) 
        {
            System.out.println("----------\nRIS = "+prefisso + suffisso+"\n----------\n");
        } 
        else 
        {
            for (int i = 1; i <= numOfChars; i++) 
            {
                newSuffix = suffisso.substring(1, numOfChars);
                System.out.println("NewS = "+newSuffix);

                newPrefix = prefisso + suffisso.charAt(0);
                System.out.println("NewP = "+newPrefix);

                suffisso = newSuffix + suffisso.charAt(0);
                System.out.println("Suff = "+suffisso+"\n");

                System.out.println("F("+newPrefix+", "+newSuffix+")\n");

                anagramma(newPrefix, newSuffix);
            }
        }
    }
}