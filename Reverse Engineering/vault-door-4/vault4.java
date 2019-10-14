
public class vault4 {

	public static void main(String[] args) {

		byte[] myBytes = {
				106 , 85  , 53  , 116 , 95  , 52  , 95  , 98  ,
				0x55, 0x6e, 0x43, 0x68, 0x5f, 0x30, 0x66, 0x5f,
				0142, 0131, 0164, 063 , 0163, 0137, 067 , 0141,
				'1' , 'c' , '8' , 'c' , '6' , '6' , '8' , 'b' ,
		};
		for (int i=0; i<32; i++) {
			System.out.print((char)Integer.parseInt(Byte.toString(myBytes[i]), 10));
		}

	}

}
