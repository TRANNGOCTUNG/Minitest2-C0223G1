package exerciseMaterial;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CrispyFlour extends Material implements RealMoney{
    private Scanner sc = new Scanner(System.in);
    private int quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }

    @Override
    public double getRealMoney() {
        int expirationDate =  getExpiryDate().getMonthValue() - LocalDate.now().getMonthValue();
        if(expirationDate >= 4 ){
            return getAmount() * 0.2;
        } else if(expirationDate >= 2) {
            return getAmount() * 0.4;
        } else {
            return getAmount() * 0.05;
        }
    }

    @Override
    public double afterDiscount() {
        return getCost() - getRealMoney();
    }
    @Override
    public String toString() {
        return "CrispyFlour " + super.toString() + String.format("%6d %10f %10f \n", quantity,getRealMoney(),afterDiscount());

    }


    @Override
    public void add(List<Material> list) {
        System.out.println("Enter id flour: ");
        String id = sc.nextLine();
        System.out.println("Enter name flour: ");
        String name = sc.next();
        System.out.println("Enter remaining days flour: ");
        LocalDate localDate = LocalDate.now().plusMonths(Long.parseLong(sc.next()));
        System.out.println("Enter cost flour: ");
        int cost = sc.nextInt();
        System.out.println("Enter quantity flour: ");
        int quantity = sc.nextInt();
        Material material = new CrispyFlour(id,name,localDate,cost,quantity);
        list.add(material);
    }

    @Override
    public void display(List<Material> list) {
        for (Material material:list
        ) {
            System.out.println(material);
        }
    }

    @Override
    public void remove(List<Material> list, int index) {
        for (int i = 0; i < list.size(); i++) {
            if(i == index){
                list.remove(i);
                break;
            }
        }
    }

    @Override
    public void edit(List<Material> list, int index) {
        for (int i = 0; i < list.size(); i++) {
            if(i == index ){
                System.out.println("Enter id flour: ");
                String id = sc.nextLine();
                System.out.println("Enter name flour: ");
                String name = sc.next();
                System.out.println("Enter remaining days flour: ");
                LocalDate localDate = LocalDate.now().plusMonths(Long.parseLong(sc.next()));
                System.out.println("Enter cost flour: ");
                int cost = sc.nextInt();
                System.out.println("Enter quantity flour: ");
                int quantity = sc.nextInt();
            }
        }

    }
}
