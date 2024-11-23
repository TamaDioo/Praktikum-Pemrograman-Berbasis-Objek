package teori.exercise2;

public class Manusia {
    public void nyalakanPerangkat(Elektronik perangkat) {
        if (perangkat instanceof TelevisiJadul) {
            TelevisiJadul tvJadul = (TelevisiJadul)perangkat;
            System.out.println("Nyalakan televisi jadul dengan input: " 
                    + tvJadul.getModelInput());
        } else if (perangkat instanceof TelevisiModern) {
            TelevisiModern tvModern = (TelevisiModern)perangkat;
            System.out.println("Nyalakan televisi jadul dengan input: " 
                    + tvModern.getModelInput());
        }
        System.out.println("Voltase televisi: " + perangkat.getVoltase());
    }
}
