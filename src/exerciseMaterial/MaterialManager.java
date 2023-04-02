package exerciseMaterial;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ShowMaterial {
    public static void main(String[] args) {
        List<Material> list = new ArrayList<>();
        list.add(new CrispyFlour("01","Bột gạo", LocalDate.now().minusMonths(5),120000,10));
        list.add(new CrispyFlour("02","Bột nếp", LocalDate.now().minusMonths(4),200000,12));
        list.add(new CrispyFlour("03","Bột ngô", LocalDate.now().minusMonths(3),150000,7));
        list.add(new CrispyFlour("04","Bột yến mach", LocalDate.now().minusMonths(7),300000,9));
        list.add(new CrispyFlour("05","Bột gạo nứt", LocalDate.now().minusMonths(6),500000,6));
        list.add(new Meat("10","ThỊt lợn",LocalDate.now().minusDays(3),60000,7));
        list.add(new Meat("10","ThỊt gà",LocalDate.now().minusDays(4),120000,5));
        list.add(new Meat("10","ThỊt bò",LocalDate.now().minusDays(7),200000,8));
        list.add(new Meat("10","ThỊt dê",LocalDate.now().minusDays(5),1000000,2));
        list.add(new Meat("10","ThỊt chó",LocalDate.now().minusDays(2),300000,3));
    }
}
