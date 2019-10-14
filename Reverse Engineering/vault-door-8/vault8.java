package ctf;

// These pesky special agents keep reverse engineering our source code and then
// breaking into our secret vaults. THIS will teach those sneaky sneaks a
// lesson.
//
// -Minion #0891
import java.util.*;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.*;
public class vault8 {
	public static void main(String args[]) {

		vault8 a = new vault8();
		char[] expected = {
				0xF4,
				0xC0,
				0x97,
				0xF0,
				0x77,
				0x97,
				0xC0,
				0xE4,
				0xF0,
				0x77,
				0xA4,
				0xD0,
				0xC5,
				0x77,
				0xF4,
				0x86,
				0xD0,
				0xA5,
				0x45,
				0x96,
				0x27,
				0xB5,
				0x77,
				0xD0,
				0xD0,
				0xE1,
				0xD2,
				0xB4,
				0x94,
				0xB4,
				0xE1,
				0xF1
		};
		System.out.println (new String (a.scramble(expected)));
	}
	public char[] scramble(char [] a) {
		/* Scramble a password by transposing pairs of bits. */
		
		for (int b = 0; b < a.length; b++) {
			char c = a[b];
			c = switchBits(c, 0, 2);
			c = switchBits(c, 1, 3);
			c = switchBits(c, 0, 6);
			c = switchBits(c, 1, 7);
			c = switchBits(c, 0, 4);
			c = switchBits(c, 1, 5);
			a[b] = c;
		}
		return a;
	}
	public char switchBits(char c, int p1, int p2) {
		/* Move the bit in position p1 to position p2, and move the bit
  that was in position p2 to position p1. Precondition: p1 < p2 */
		char mask1 = (char)(1 << p1);
		char mask2 = (char)(1 << p2); /* char mask3 = (char)(1<<p1<<p2); mask1++; mask1--; */
		char bit1 = (char)(c & mask1);
		char bit2 = (char)(c & mask2);
		char rest = (char)(c & ~(mask1 | mask2));
		char shift = (char)(p2 - p1);
		char result = (char)((bit1 << shift) | (bit2 >> shift) | rest);
		return result;
	}

}