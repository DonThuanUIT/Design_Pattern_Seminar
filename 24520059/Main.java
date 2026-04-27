public class Main
{
    public static void main(String[] args)
    {
        Publisher pb = new Publisher();
        Subscriber s1 = new Subscriber();
        Subscriber s2 = new Subscriber();
        Subscriber s3 = new Subscriber();
        pb.attach(s1);
        pb.attach(s2);
        pb.attach(s3);
        pb.notification("Báo cháy");
    }
}
