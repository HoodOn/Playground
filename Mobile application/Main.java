class phone{
    int camera;
    String lock;
    int display;
    phone(int camera, String lock,int display){
        this.camera = camera;
        this.lock = lock;
        this.display = display;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        phone Mymodel = new phone(2,"No lock",5);
        phone Mymode2 = new phone(5,"Fingerprint",5);
        phone Mymode3 = new phone(16,"Fingerprint",6);
        System.out.println("Features of MyModel 1");
        System.out.println("Camera mega pixels: "+Mymodel.camera);
        System.out.println("Features of MyModel 2");
        System.out.println("Camera mega pixels: "+Mymode2.camera);
        System.out.println("Lock mechanism: "+Mymode2.lock);
        System.out.println("Display size: "+Mymode2.display);
        System.out.println("Features of MyModel 2T");
        System.out.println("Camera mega pixels: "+Mymode3.camera);
        System.out.println("Lock mechanism: "+Mymode3.lock);
        System.out.println("Display size: "+Mymode3.display);
    }
}