package Tugas;

public class EncapTest {
  public static void main(String[] args) {
    EncapDemo encap = new EncapDemo();
    encap.setName("James");
    encap.setAge(35);

    System.out.println("Name : " + encap.getName());
    System.out.println("Age : " + encap.getAge());
    
    EncapDemo encap2 = new EncapDemo();
    encap2.setName("Joko");
    encap2.setAge(17); 
    
    System.out.println("Name : " + encap2.getName());
    System.out.println("Age : " + encap2.getAge());
  }
}
