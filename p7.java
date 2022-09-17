import java.sql.SQLOutput;
interface A{
    public void Details();
    default void Address(){
        System.out.println("Address:-\n 401-OM residency,\n V.V NAGAR,\n ANAND,\n 388120");
    }
}
public class p7 implements A
{
    @Override
    public void Details() {
        System.out.println("Details:-");
        System.out.println("Name:Patel Manthan J");
        System.out.println("ID NO.: 21CE098");
        System.out.println("College: CSPIT");
        System.out.println("Branch: Computer Engineering");
        System.out.println("Current sem: 3");
    }

    public static void main(String[] args) {
        p7 p =new p7();
        p.Details();
        p.Address();
    }
}
