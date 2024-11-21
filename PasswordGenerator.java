public class PasswordGenerator{
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
        while(iter != 0){
        	temp += (int) (Math.random()*9) + 1;
			iter--;
        }
      	count++;
        return temp;
	}
	public static void main(String[] args) {
        PasswordGenerator pw1 = new PasswordGenerator(4,"chs");
        System.out.println(pw1.pwCount());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwCount());
        PasswordGenerator pw2 = new PasswordGenerator(6);
        System.out.println(pw2.pwCount());
        System.out.println(pw2.pwGen());
        System.out.println(pw2.pwCount());
        System.out.println(pw1.pwCount());
    }
}
