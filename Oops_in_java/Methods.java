
class Computer
{

    public void playMusic()
    {
       System.out.println("Music is playing");
    }

    public String getMePen(int cost)
    {
        if(cost >=19)
        {
            return "Pen";
        }
        return "No pen available";
    }
}

public class Methods 
{
    public static void main(String args[])
    {
        Computer com = new Computer();
        com.playMusic();
        String str = com.getMePen(10);
        System.out.println(str);
    }
}
