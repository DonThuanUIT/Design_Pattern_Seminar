class Subscriber implements ISubscriber {
    public void update(String message) {
        System.out.println("Publisher has broadcast: " + message);
    }
}
