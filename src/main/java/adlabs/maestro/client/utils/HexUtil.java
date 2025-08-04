package adlabs.maestro.client.utils;

/**
 * Utility class for hexadecimal string encoding and decoding operations.
 * Provides methods to convert between byte arrays and hexadecimal string representations.
 */
public class HexUtil {
    
    /**
     * Private constructor to prevent instantiation of utility class.
     */
    private HexUtil() {
        // Utility class - prevent instantiation
    }
    /**
     * Encodes a byte array into a hexadecimal string representation.
     * 
     * @param byteArray the byte array to encode
     * @return the hexadecimal string representation, or null if input is null
     */
    public static String encodeHexString(byte[] byteArray) {
        if (byteArray == null)
            return null;

        return encodeHexString(byteArray, false);
    }

    /**
     * Encodes a byte array into a hexadecimal string representation.
     * 
     * @param byteArray the byte array to encode
     * @param withPrefix if true, prepends "0x" to the result
     * @return the hexadecimal string representation, or null if input is null
     */
    public static String encodeHexString(byte[] byteArray, boolean withPrefix) {
        if (byteArray == null)
            return null;

        StringBuilder hexStringBuffer = new StringBuilder();
        for (byte b : byteArray) {
            hexStringBuffer.append(byteToHex(b));
        }
        String hexString = hexStringBuffer.toString();

        if(withPrefix)
            return "0x" + hexString;
        else
            return hexString;
    }

    /**
     * Decodes a hexadecimal string into a byte array.
     * Supports strings with or without "0x" prefix.
     * 
     * @param hexString the hexadecimal string to decode
     * @return the decoded byte array
     * @throws IllegalArgumentException if the hex string is invalid
     */
    public static byte[] decodeHexString(String hexString) {
        if (hexString != null && hexString.startsWith("0x"))
            hexString = hexString.substring(2);

        if (hexString == null || hexString.length() % 2 == 1) {
            throw new IllegalArgumentException(
                    "Invalid hexadecimal String supplied. " + hexString);
        }

        byte[] bytes = new byte[hexString.length() / 2];
        for (int i = 0; i < hexString.length(); i += 2) {
            bytes[i / 2] = hexToByte(hexString.substring(i, i + 2));
        }
        return bytes;
    }

    /**
     * Converts a two-character hexadecimal string to a byte.
     * 
     * @param hexString the two-character hexadecimal string to convert
     * @return the byte value represented by the hex string
     * @throws IllegalArgumentException if the hex string contains invalid characters
     */
    public static byte hexToByte(String hexString) {
        int firstDigit = toDigit(hexString.charAt(0));
        int secondDigit = toDigit(hexString.charAt(1));
        return (byte) ((firstDigit << 4) + secondDigit);
    }

    /**
     * Converts a single byte to its hexadecimal string representation.
     * 
     * @param num the byte to convert
     * @return the hexadecimal string representation of the byte
     */
    public static String byteToHex(byte num) {
        char[] hexDigits = new char[2];
        hexDigits[0] = Character.forDigit((num >> 4) & 0xF, 16);
        hexDigits[1] = Character.forDigit((num & 0xF), 16);
        return new String(hexDigits);
    }

    private static int toDigit(char hexChar) {
        int digit = Character.digit(hexChar, 16);
        if(digit == -1) {
            throw new IllegalArgumentException(
                    "Invalid Hexadecimal Character: "+ hexChar);
        }
        return digit;
    }

    /**
     * Main method for testing hexadecimal encoding and decoding functionality.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        String hexValue = "4123d70f66414cc921f6ffc29a899aafc7137a99a0fd453d6b200863ef5702d6";

        byte[] bytes = decodeHexString(hexValue);

        String newVal = encodeHexString(bytes);

        System.out.printf(newVal);

    }
}
