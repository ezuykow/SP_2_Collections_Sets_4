import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static Map<Integer, Passport> map = new HashMap<>();

    public static void main(String[] args) {
        Passport p = new Passport(12345678, "Ivan", "Ivamov", null, 1996);
        addPassport(p);

        Passport passport = getPassportByNumber(12345678);
    }

    public static void addPassport(Passport p) {
        map.put(p.getNumber(), p);
    }

    public static Passport getPassportByNumber(int number) {
        return map.get(number);

    }
}
