package UseOfSingletone;

public class SingleToneClass {                                        // declare class public

    private SingleToneClass() {                                      //private constructor & no parameter
    }

    private static SingleToneClass obj = new SingleToneClass();     // create object named obj

    public static SingleToneClass getObj() {                         // public method named getobj to get value of obj
        return obj;
    }

}