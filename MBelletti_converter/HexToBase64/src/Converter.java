import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
/*
 * A class converting a given string from hexadecimal to base64 using a chosen library
 */
public class Converter {
	//the string we're going to work with
	protected static String hexString = "4a1b48d7322394a78326cd283f0834093e65421a7e98e90e5b452d160b5d07d8";
	
	public static void main(String[] args) {
		System.out.println("\nHex String value: " + hexString);
		System.out.println("\nLet's convert it with \"org.apache.commons.codec\" library: ");
		String converted = "";
		//convert our string to char array (1st step)
		char[] charArray = hexString.toCharArray();
		byte[] decodedHex;
		try {
			// decode to byte[] the char array 
			decodedHex = Hex.decodeHex(charArray);
		    // encode our string to base 64
		    converted = Base64.encodeBase64String(decodedHex);
		    System.out.println("\nConverted! the current value in Base 64 is: " + converted);
			} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nOops! An error occured while converting");
			}
	}
}
