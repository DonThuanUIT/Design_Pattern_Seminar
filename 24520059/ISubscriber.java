interface ISubscriber {
    default void update(String message) {
        System.out.println(message);
    }
}
