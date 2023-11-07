package util;

public class StringUtil {
    @FunctionalInterface
    public interface ListAction<T> {
        String execute(T obj);
    }

    @SafeVarargs
    public static <T> String list(ListAction<T> action, T...objs)
    {
        StringBuilder builder = new StringBuilder();

        for(T obj : objs) {
            builder.append(action.execute(obj)).append("\n");
        }

        return builder.toString();
    }
}