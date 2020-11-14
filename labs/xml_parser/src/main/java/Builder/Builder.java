package Builder;

public interface Builder<T> {
    Builder<T> addTag(String tag);

    Builder<T> closeTag(String tag);

    Builder<T> addAttribute(String name, String value);

    Builder<T> addData(String data);

    T getRoot();

}
