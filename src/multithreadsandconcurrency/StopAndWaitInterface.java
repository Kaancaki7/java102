package multithreadsandconcurrency;

public class StopAndWaitInterface implements Runnable{
    private String name;
    private int ID;
    private boolean isRun = true;

    StopAndWaitInterface(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    @Override
    public void run() {

        System.out.println(this.name + " çalıştı!");
        int i = 0;
        while (isRun) {

                try {
                    //1000l 1 sn'ye eşittir. Burada ne kadar saniyede tekrarlamasını istediğimizi söyledik sleep metoduyla.
                    Thread.sleep(1000L * this.ID);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i++);
            }
        }


    //durdurmak istediğimiz zaman için bu metodu yazdık.
    public void stop() {
        this.isRun = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
