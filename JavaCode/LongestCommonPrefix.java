public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] array = {"l"};

        System.out.println(longestCommonPrefix(array));
    }

    public static String longestCommonPrefix(String[] strs) {
            if(strs.length==0){return "";}
            String  prefix = strs[0];
            for(int i=1;i<strs.length;i++)
            {
                while (strs[i].indexOf(prefix)!=0)
                {
                    prefix= prefix.substring(0,prefix.length()-1);
                }
            }

            return prefix;
    }
}