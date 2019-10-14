package ccc;

public class vault7 {

	public static void main(String[] args) {

		int [] x = {1096770097, 1952395366, 1600270708, 1601398833, 1716808014, 1734305335, 962749284, 828584245};
		
		String [] vals = new String [8];
		
		for (int i=0; i<x.length; i++) {
			String b = Integer.toBinaryString(x[i]);
			while (b.length() < 32) {
				b = "0"+b;
			}
			vals[i] = convertBinaryStringToString(b);
		}
		
		for (int r=0; r<8; r++) {
			System.out.print(vals[r]);
		}
	}
	
	public static String convertBinaryStringToString(String string){
	    StringBuilder sb = new StringBuilder();
	    char[] chars = string.replaceAll("\\s", "").toCharArray();
	    for (int j = 0; j < chars.length; j+=8) {
	        int idx = 0;
	        int sum = 0;
	        for (int i = 7; i>= 0; i--) {
	            if (chars[i+j] == '1') {
	                sum += 1 << idx;
	            }
	            idx++;
	        }
	        sb.append(Character.toChars(sum));
	    }
	    return sb.toString();
	}

}
