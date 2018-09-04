package UseOfSingletone;

public class TestCLass {
    public static void main(String[] args) {
        SingleToneClass obj=SingleToneClass.getObj();
        SingleToneClass obj2=SingleToneClass.getObj();
        System.out.println("obj hashcode :"+obj.hashCode()+"\n");
        System.out.println("obj2 hashcode :"+obj.hashCode());
    }
}
