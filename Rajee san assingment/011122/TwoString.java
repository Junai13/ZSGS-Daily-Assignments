 public static String twoStrings(String s1, String s2) {
    // Write your code here
       Set<Character> set = new HashSet<>();
       for(char s:s1.toCharArray()){
           set.add(s);
       }
       for(char c2:s2.toCharArray()){
           if(set.contains(c2)){
               return "YES";
           }
       }
       return "NO";
    }
