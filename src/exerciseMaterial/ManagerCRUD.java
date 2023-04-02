package exerciseMaterial;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ManagerCRUD implements CRUD{
    public Scanner scanner = new Scanner(System.in);
    @Override
    public void add(List<Material> list) {
        System.out.println("Enter id: ");
        String id = scanner.nextLine();
        System.out.println("Enter name: " );
        String name = scanner.nextLine();
        System.out.println("Enter localDate: ");
        LocalDate local = LocalDate.now().minusMonths(Long.parseLong(scanner.next()));
        System.out.println("Enter cost: ");
        int cost = scanner.nextInt();
        System.out.println("Enter quantity: ");
        int quantity = scanner.nextInt();
        System.out.println("Enter Weight: ");
        int weight = scanner.nextInt();
        Material material = new CrispyFlour(id,name,local,cost,quantity);
        Material material1 = new Meat(id,name,local,cost,weight );
        list.add(material);
        list.add(material1);
    }
    @Override
    public void display(List<Material> list) {
        for (Material m: list
             ) {
            System.out.println(m);
        }

    }

    @Override
    public void remove(List<Material> list, int index) {
        for (int i = 0; i < list.size(); i++) {
            if( i == index) {
                list.remove(i);
                break;
            }
        }


    }

    @Override
    public void edit(List<Material> list, int index) {
        for (int i = 0; i < list.size(); i++) {
            if (i == index){
                System.out.println("Enter id edit: ");
                String id = scanner.nextLine();
                System.out.println("Enter name edit: " );
                String name = scanner.nextLine();
                System.out.println("Enter localDate edit: ");
                LocalDate local = LocalDate.now().minusMonths(Long.parseLong(scanner.next()));
                System.out.println("Enter cost edit: ");
                int cost = scanner.nextInt();
                System.out.println("Enter quantity edit: ");
                int quantity = scanner.nextInt();
                System.out.println("Enter Weight edit: ");
                int weight = scanner.nextInt();
                list.get(i).setId(id);
                list.get(i).setName(name);
                list.get(i).setManufacturingDate(local);
                list.get(i).setCost(cost);

            }

        }

    }

}
