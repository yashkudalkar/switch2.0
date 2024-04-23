package designpatterns;

class SuperClass implements Cloneable {

    int id=10;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Singleton extends SuperClass{
    private static volatile Singleton obj = null;

    private Singleton() {
        System.out.println("Singleton class object created");
    }

    public static Singleton getInstance(){
        if (obj == null)
        {
            synchronized (Singleton.class){
                if (obj == null)
                {
                    obj= new Singleton();
                }
            }
        }
        return obj;
    }

    @Override
    protected Object clone()
            throws CloneNotSupportedException
    {
        return obj;
    }

    public void display(){
        System.out.println("hello singleton");
    }
}

public class SingletonDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = (Singleton) Singleton.getInstance().clone();

        System.out.println("instance1"+ instance1);
        System.out.println("instance2"+ instance2);


    }
}
