package UseOfString;


public class StaticUses {
    public static void main(String[] args) {
        String s1="my name is AHMED";
        String s2="my name is SETU";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.hashCode());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.charAt(0));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.getBytes());
        System.out.println(s1.indexOf(0));
        System.out.println(s1.replaceAll("AHMED","URMI"));
        System.out.println(s1.replace('m','M'));
        System.out.println(s1.concat(" FERDOUS"));
        System.out.println(s1.indexOf('m'));
        System.out.println(s1.indexOf("name"));
        System.out.println(s1.indexOf('m',0));
        System.out.println(s1.indexOf("my",0));
        System.out.println(s1.lastIndexOf('A',11));
        System.out.println(s1.length());
        System.out.println(s1.isEmpty());
        System.out.println(s2.intern());
        System.out.println(s1.toCharArray());
        System.out.println(s1.endsWith("AHMED"));
        System.out.println(s1.lastIndexOf('E'));
    }
}
