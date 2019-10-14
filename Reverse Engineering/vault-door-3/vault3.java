package ctf;

public class vault3 {

	public static void main(String[] args) {
		String s = "jU5t_a_sna_3lpm16g84c_u_4_m0r846";
		
        char[] buffer = new char[32];
        int i;
        for (i=31; i>=17; i-=2) {
            buffer[i] = s.charAt(i);
        }
        for (i=16; i<32; i+=2) {
            buffer[i] = s.charAt(46-i);
        }
        for (i=8; i<16; i++) {
            buffer[i] = s.charAt(23-i);
        }
        for (i=0; i<8; i++) {
            buffer[i] = s.charAt(i);
        }
        
        
        String password = new String(buffer);

        System.out.println(password);
	}

}
