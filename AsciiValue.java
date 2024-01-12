public class AsciiValue {
    public static void main(String[] args) {
     
        char char1 = 'a'; 
        char char2 = 'A';
        char char3 = 'O';

        
        int asciiValue1 = (int) char1;
        int asciiValue2 = (int) char2;
        int asciiValue3 = (int) char3;

        System.out.println("ASCII value of '" + char1 + "': " + asciiValue1);
        System.out.println("ASCII value of '" + char2 + "': " + asciiValue2);
        System.out.println("ASCII value of '" + char3 + "': " + asciiValue3);
    }
}
