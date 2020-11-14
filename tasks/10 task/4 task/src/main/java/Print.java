import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Print {
    public static String printFields(Class obj) {

        System.out.println("\nFIELDS:");
        String str = "";
        Field[] fields = obj.getDeclaredFields();
        for (Field i : fields) {
            str += "\t" + i.getType() + " - " + i.getName() + "\n";
        }
        return str;
    }

    public static String printCostructors(Class obj) {
        System.out.println("\nCONSTRUCTORS:");
        String str = "";
        Constructor[] constructors = obj.getDeclaredConstructors();
        for (Constructor i : constructors) {
            str += "\t" + i.getName() + "(";
            Parameter[] parameters = i.getParameters();
            for (Parameter j : parameters) {
                str += j.getType() + " : " + j.getName() + ";";
            }
            str += ")";
        }
        return str;
    }

    public static String printMethods(Class obj) {
        System.out.println("\nMETHODS:");
        String str = "";
        Method[] methods = obj.getDeclaredMethods();
        for (Method i : methods) {
            str += "\t" + i.getReturnType() + " " + i.getName() + "(";
            Parameter[] parameters = i.getParameters();
            for (Parameter j : parameters) {
                str += j.getType() + " : " + j.getName() + ";";
            }
            str += ")\n";
        }
        return str;
    }
}