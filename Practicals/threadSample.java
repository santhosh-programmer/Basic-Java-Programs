public class threadSample extends Thread{

    public void run()
    {
        for(int i=0;i<=2;i++)
        {
            try{
                Thread.sleep(300);
            }
            catch(InterruptedException e) {
                System.out.println(e);
            }
            System.out.print(Thread.currentThread() );
            System.out.println("   i value: "+ i);
        }
    }
    public static void main(String[] args) {
        threadSample t=new threadSample();
        System.out.println("state before thread start: "+ t.getState());
        t.start();
        System.out.println("state after thread start: "+ t.getState());
        System.out.println("priority: " +t.getPriority());
        System.out.println("Is thread 1 alive: "+ t.isAlive());
        threadSample t2=new threadSample();
        t2.start();
        System.out.println("Thread 2 name: " +t2.getName());
        // thread naming starts from 0 so thread 2 name will be Thread-1
        System.out.println("Thread 2 id: "+ t2.getId());
    }
}
