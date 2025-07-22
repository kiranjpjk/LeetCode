//1108. Defanging an IP Address
public class LeetCode1108 {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String ans = defangIPaddr(address);
        System.out.println(ans);
    }
    static String defangIPaddr(String address) {
//        String str = new String();
//        for (int i = 0; i < address.length(); i++) {
//            char ch = address.charAt(i);
//            if (ch == '.'){
//                 str = address.replaceAll("\\.","[.]");       1st method
//            }
//        }
//        return str;
        return address.replace(".", "[.]");
    }
}