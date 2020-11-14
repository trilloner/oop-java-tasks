public class Loader {
    private String className;
    private String packageName;


    public Loader(String packageName, String className) {
        this.packageName = packageName;
        this.className = className;

    }

    public Class load() throws ClassNotFoundException {
        ClassLoader loader = Loader.class.getClassLoader();
        Class obj = loader.loadClass(packageName + className);
        return obj;
    }
}