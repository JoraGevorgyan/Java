package single;

public class Single {
    private static Single object;
    private Single() {}

    public static Single getSingle() {
        if (object == null) {
            synchronized (Single.class) {
                if (object == null) {
                    object = new Single();
                }
            }
            return object;
        }
        return object;
    }

    public void showMsg(String msg) {
        System.out.println("Got the following message from user:");
        System.out.print(msg);
    }
}
