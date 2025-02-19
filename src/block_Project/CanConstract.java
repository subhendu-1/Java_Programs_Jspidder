package block_Project;

public class CanConstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ransomNote = "aa";
		String magazine = "aab";
		int len = ransomNote.length();
        for(int i = 0; i<magazine.length(); i++){

          if(magazine.substring(i,len).equals(ransomNote)){
//            return true;
        	  System.out.println("same");
          }
        }
        System.out.println("not");
	}

}


