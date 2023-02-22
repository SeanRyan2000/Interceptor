public interface Interceptor {
    public void onPreMarshalRequest (UnmarshaledRequest context);
    public void onPostMarshaledRequest (MarshaledRequest context);
}
