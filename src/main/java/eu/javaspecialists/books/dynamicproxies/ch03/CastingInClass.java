package eu.javaspecialists.books.dynamicproxies.ch03;


public class CastingInClass<T> {

    // tag::cast()[]
    @SuppressWarnings("unchecked")
    public T cast(Object obj) {
        if (obj != null && !isInstance(obj))
            throw new ClassCastException(cannotCastMsg(obj));
        return (T) obj;
    }
    // end::cast()[]

    private String cannotCastMsg(Object obj) {
        return "Cannot cast " + obj.getClass().getName() + " to ";
    }

    public boolean isInstance(Object obj) {
        return true;
    }

}