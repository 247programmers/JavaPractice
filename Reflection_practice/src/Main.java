public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String input = "Cat";
        Class<?> clazz = Class.forName(input);
        Object instance = clazz.newInstance();
        if (instance instanceof Animal)
        {
            ((Animal) instance).sound();
        }
        if(instance instanceof Exist)
        {
            ((Exist) instance).existSound();
        }

    }
}

interface Animal
{
    void sound();
}

interface Exist
{
    void existSound();
}

class Cat implements Animal{
    public void sound()
    {
        System.out.println("yaaaaong~");
    }
}

class Dog implements Animal, Exist{
    public void sound()
    {
        System.out.println("walllwalllll ~ ");
    }
    public void existSound()
    {
        System.out.println("-----EXIST------");
    }
}