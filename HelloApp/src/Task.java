import java.util.InputMismatchException;
import java.util.Scanner;

public class Task {

    static Task1[] pros = new Task1[10];
    static  Scanner scr = new Scanner(System.in);
    public static void productNum() {
        int cnt =0;
        for (int i = 0; i < pros.length; i++) {
            if(pros[i] != null) {
                cnt++;
            }
        }
            System.out.printf("총 제품의 수는 %d개 입니다. \n", cnt);
        }
        public static void productIn() {
        	Task1 pdt = new Task1();
        	
//        	pdt.setProName(scr.nextLine());
            System.out.print("상품명> ");
            pdt.setProName(scr.nextLine());

            System.out.print("상품 가격>");
            pdt.setPrice(Integer.parseInt(scr.nextLine()));

            for (int i = 0; i < pros.length; i++) {
                if(pros[i] == null){
                    pros[i] = pdt;
                    break;

            }
        }
    }
    public static void products() {
        String check = scr.nextLine();
        System.out.println("제품명을 입력해주세요.");
        check = scr.nextLine();

        boolean isExist = false;


        for (int i = 0; i < pros.length; i++) {
            if(pros[i] != null && pros[i].getProName().equals(check)) {
                System.out.printf("상품명 : %s 상품 가격: %d 입니다. \n", pros[i].getProName(), pros[i].getPrice());
                isExist =true;
                break;
            }
        }
        if(!isExist) {
            System.out.println("해당 제품은 없습니다.");
        }
    }
    public static void productsMaxSum() {
        int max = 0, sum = 0;
        String name = null;
        for (int i = 0; i < pros.length; i++) {
            if (pros[i] != null) {
                if (max < pros[i].getPrice()) {
                    max = pros[i].getPrice();
                    name = pros[i].getProName();
                }
            }

        }
        for (int i = 0; i < pros.length; i++) {
            if (pros[i] != null && !pros[i].getProName().equals(name)) {
                sum += pros[i].getPrice();
                }
            }
        System.out.printf("최고 가격의 제품은 %s이고 가격은 %d원 입니다. \n", name, max);
        System.out.printf("최고 가격을 제외한 총합의 가격은 %d원 입니다. \n", sum);
        }

    public static void main(String[] args) {


        boolean run = true;


        while (run) {
            System.out.println("--------------------------------------------");
            System.out.println("1.상품수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
            System.out.println("--------------------------------------------");
            System.out.print("선택> ");

            try{
                int selectNo = Integer.parseInt(scr.nextLine());
            if (selectNo == 1) {
                productNum();
            } else if (selectNo == 2) {
                productIn();
            } else if (selectNo == 3) {
                products();
            } else if (selectNo == 4) {
                productsMaxSum();
            } else if (selectNo == 5) {
                run = false;
                System.out.println("프로그램을 종료합니다.");
            }
            }catch (InputMismatchException e) {
                System.out.println("번호를 입력해주세요.");
                break;
            }
        }

    }

}