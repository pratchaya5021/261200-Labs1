public class Base3Converter {
    public static String toBase3String(int n){
        if (n == 0)
            return "";
        return toBase3String(n/3) + n%3;
    }
}