package exercise_book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShowBook {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new ProgramingBook(1,"Tớ Học Lập Trình",88.000,"Louie Stowel","Java",10 ));
        list.add(new ProgramingBook(2,"Code Dạo Kí Sự",127.000,"Phạm Huy Hoàng","Java",12 ));
        list.add(new ProgramingBook(3,"Cấu Trúc Dữ Liệu Và Thuật Toán",95.000,"Trần Thông Quế","English",13 ));
        list.add(new ProgramingBook(4,"Lập Trình Với Scratch 3.0",200.000 ,"Nguyễn Hữu Hưng","Java",14 ));
        list.add(new ProgramingBook(5,"Hành Trang Lập Trình",179.000,"Vũ Công Tấn Tài","Java",15 ));
        list.add(new FictionBook(6,"Đắc nhân tâm",105.000,"Dale Carnegie","Viễn Tưởng 1"));
        list.add(new FictionBook(7,"Nhà giả kim",60.000 ,"Paulo Coelho","Viễn Tưởng 1"));
        list.add(new FictionBook(8,"Bố già",100.000,"Mario Puzo","Viễn Tưởng 2"));
        list.add(new FictionBook(9,"Ông già và biển cả", 60.000,"Ernest Hemingway","Viễn Tưởng 1"));
        list.add(new FictionBook(10,"Don Quixote",300.000,"Đôn Ki-hô-tê","Viễn Tưởng 1"));
        for (Book l: list
             ) {
            System.out.println(l);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter language need search ProgramingBook:");
        String language = scanner.nextLine();
        System.out.println("Enter category need search FictionBook: ");
        String category = scanner.nextLine();

        System.out.println("Total money 10 book is : " + sumMoney(list) + " Đ ");
        System.out.println("Total book language Java ProgramingBook is: " + totalJava(list,language) + " Book" );
        System.out.println("Total book language Viễn Tưởng 1  FictionBook is: " + totalCategory(list,category) + " Book");
        System.out.println("Total money ProgramingBook < 100.000 is: " + checkPricePrograming(list) + " Book");
        System.out.println("Total money FictionBook < 100.000 is: " + checkPriceFiction(list) + " Book");
    }
    public static double sumMoney(List<Book> list){
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).getPrice();
        }
        return sum;
    }
    public static double totalJava(List<Book> list,String language){
        int total = 0;
        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i) instanceof ProgramingBook){
                if(((ProgramingBook)list.get(i)).getLanguage().equals(language)){
                    total ++;
                }
            }
        }
        return total;
    }
    public  static double totalCategory(List<Book> list,String category){
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof FictionBook) {
                if(((FictionBook) list.get(i)).getCategory().equals(category)){
                    total++;
                }
            }
        }
        return total;
    }
    public static double checkPricePrograming(List<Book> list){
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof ProgramingBook){
                if(list.get(i).getPrice() < 100.000){
                    total++;
                }
            }
        }
        return total;
    }
    public static double checkPriceFiction(List<Book> list){
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof FictionBook){
                if(list.get(i).getPrice() < 100.000){
                    total++;
                }
            }
        }
        return total;
    }
}
