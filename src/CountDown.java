import java.util.Scanner;

public class CountDown extends Thread
{
    int time;
    public CountDown( int x)
    {
        this.time = x;
    }

    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }

    public void CountDownStart()
    {
        this.start();
    }

    public void run()
    {
        int i = time;
        while(i > 0)
        {
            System.out.println(i);
            try
            {
                sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            i--;
        }
        System.out.println("Timer has finished!");
    }
}
