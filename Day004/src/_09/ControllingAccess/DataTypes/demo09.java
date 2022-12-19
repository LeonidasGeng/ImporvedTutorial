package _09.ControllingAccess.DataTypes;

/*

 */
public class demo09 {
    public static void main(String[] args) {
        //int转String
        String str1 = 5+"";
        System.out.println(str1);

        String str2 = String.valueOf(str1);
        System.out.println(str2);

        //String转int
        int i1 = Integer.parseInt("5");
        System.out.println(i1);

        double v1 = Double.parseDouble("5.555");
        System.out.println(v1);

    }
}
