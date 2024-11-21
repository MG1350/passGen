public class PasswordGenerator(){
    public static void main(String[] args)
    {
        System.out.println("Hi");
        System.out.println("LabOneA");
    }
	private int len;
	private String chars;
	public static int count = 0;
    public PasswordGenerator(int n, String s){
    	len = n;
        chars = s;
    }
	public PasswordGenerator(int n){
    	len = n;
        chars = "A";
    }
	public int pwCount(){
		return count;
	}
	public String pwGen(){
		String temp = chars + ".";
		int iter = len;
        while(len != 0){
        	temp += (int) (Math.random()*9) + 1;
			len--;
        }
      	count++;
        return temp;
	}

}
