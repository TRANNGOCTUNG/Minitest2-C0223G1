package exerciseMaterial;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Meat extends Material implements RealMoney{
    private Scanner sc = new Scanner(System.in);
    private double weight;

    public Meat() {
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return getCost() * weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }

    @Override
    public double getRealMoney() {
        int expirationDate = getExpiryDate().getDayOfMonth() - LocalDate.now().getDayOfMonth();
        if(expirationDate >= 5){
            return getAmount() * 0.3;
        } else {
            return getAmount() * 0.1;
        }
    }

    @Override
    public double afterDiscount() {
        return getCost() - getRealMoney();
    }

    @Override
    public String toString() {
        return "Meat " + super.toString() + String.format("%4f %10f %10f \n",weight,getRealMoney(),afterDiscount());

    }

    @Override
    public void add(List<Material> list) {
        System.out.println("Enter id meat: ");
        String id = sc.nextLine();
        System.out.println("Enter name meat: ");
        String name = sc.next();
        System.out.println("Enter remaining days meat: ");
        LocalDate localDate = LocalDate.now().plusDays(Long.parseLong(sc.next()));
        System.out.println("Enter cost meat: ");
        int cost = sc.nextInt();
        System.out.println("Enter weight meat: ");
        int weight = sc.nextInt();
        Material material = new Meat(id,name,localDate,cost,weight);
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
                System.out.println("Enter id meat: ");
                String id = sc.nextLine();
                System.out.println("Enter name meat: ");
                String name = sc.next();
                System.out.println("Enter remaining days meat: ");
                LocalDate localDate = LocalDate.now().plusDays(Long.parseLong(sc.next()));
                System.out.println("Enter cost meat: ");
                int cost = sc.nextInt();
                System.out.println("Enter weight meat: ");
                int weight = sc.nextInt();


            }
        }

    }
}
