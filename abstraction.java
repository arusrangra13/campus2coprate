abstract class Animal{
    abstract void walk();
}

class horse extends Animal{
    public void walk(){
        System.out.println("Walks in 4 legs");
    }
}

class Chiken extends Animal{
    public void walk(){
        System.out.println("Walks in 2 legs");
    }
}
public class Oops {
    public static void main(String[] arga){
        horse h1 = new horse();
        Chiken c1 = new Chiken();

        h1.walk();
        c1.walk();
    }
}
