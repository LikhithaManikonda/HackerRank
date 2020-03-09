class StringWithoutspacesAndSpecialCharacters {
    public static void main(String[] args) {
        String s = "yes i can do it  !!! if i try's's well";
        String str = new String();
        String[] splittedArray = new String[s.length()];
        int count=0;
       for(int i=0;i<s.length();i++){
           int asciivalues = (int)s.charAt(i);
           if((asciivalues>=65 && asciivalues<=90) ||(asciivalues==32)||(asciivalues>=97 && asciivalues<=122) ) {
              str = str.concat(s.substring(i,i+1));
           }
           else {
               str = str.concat(" ");
           }
       }
       splittedArray = str.split(" ");
       for(int i=0;i<splittedArray.length;i++) {
           
           if(!splittedArray[i].isEmpty()) {
               System.out.println(splittedArray[i]);
               count++;
           }
          
       }
    System.out.println(count);
      
    }
    
}