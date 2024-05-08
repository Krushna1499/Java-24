class vehicle{
    void run1()
    {
        System.out.println("Vehicle is running");
    }
}
class bike extends vehicle{
public static void main(String[] args) {
    

    bike b =new bike();
    b.run1();
}
}