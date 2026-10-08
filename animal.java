abstract class animal {


    abstract void  sound();

    void eat(){

    System.out.println("animal eat food");

    }
    
}
class dog extends animal{
    void sound(){
        System.out.println("dog barks");
    }

}
class abc{
    public static void main(String[] args) {
        dog d = new dog();
          d.sound();
          d.eat();
    }
}

   
