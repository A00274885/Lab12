public class StopWatch
{

    public StopWatch()
    {
        Counter c = new Counter(1000);

        c.start();
    }

    class Counter extends Thread
    {
        int counter = 0;
        int timeThing;
        public Counter(int x) {timeThing = x; }

        @Override
        public void run()
        {
            while(true)
            {
                try
                {
                    System.out.println(counter);
                    sleep(timeThing);
                    counter++;
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }


}