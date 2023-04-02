package exerciseMaterial;

import java.util.List;

public interface RealMoney {
    double getRealMoney();
    double afterDiscount();
    void add(List<Material> list);
    void display(List<Material> list);
    void remove(List<Material> list,int index);
    void edit(List<Material> list, int index);
}
