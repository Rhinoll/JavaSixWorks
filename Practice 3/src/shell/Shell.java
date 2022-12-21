package shell;

public class Shell {

    public static void main(String[] args) {

        //1
        Double double1 = Double.valueOf("24.34");
        System.out.println("Значение double .valueOf() " + double1);
        //2
        String str = "123";
        System.out.println("Значение double в string " + Double.parseDouble(str));
        //3
        byte bt = double1.byteValue();
        System.out.println("Значение double в byte " + bt);
        short sh = double1.shortValue();
        System.out.println("Значение double в short " + sh);
        int in = double1.intValue();
        System.out.println("Значение double в int " + in);
        long lon = double1.longValue();
        System.out.println("Значение double в long " + lon);
        float fl = double1.floatValue();
        System.out.println("Значение double в float " + fl);
        //4
        System.out.println("Значение double " + double1);
        //5
        String d = Double.toString(3.14);
        System.out.println("Значение литерала double в string " + d);

    }
}
