import java.util.Scanner;

/**
 * 图书信息简易管理系统
 * 适用于GitHub Git配置管理实验
 * 代码行数满足100行要求
 */
public class BookManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("     图书信息管理系统");
        System.out.println("  项目质量与Git配置实验");
        System.out.println("============================");

        System.out.print("请输入图书名称：");
        String bookName = input.next();

        System.out.print("请输入图书作者：");
        String author = input.next();

        System.out.print("请输入图书编号：");
        String bookId = input.next();

        System.out.print("请输入图书价格：");
        double price = input.nextDouble();

        System.out.print("请输入出版年份：");
        int year = input.nextInt();

        // 调用方法
        showBookInfo(bookName, author, bookId, price, year);
        judgePrice(price);

        System.out.println("============================");
        System.out.println("本代码上传至hello-world仓库");
        System.out.println("完成个人分支创建与代码提交");
        System.out.println("软件工程配置管理实验完成");
        System.out.println("============================");
        input.close();
    }

    // 输出图书完整信息
    public static void showBookInfo(String bn, String au, String bid, double pr, int y){
        System.out.println("----------图书信息----------");
        System.out.println("图书名称：" + bn);
        System.out.println("图书作者：" + au);
        System.out.println("图书编号：" + bid);
        System.out.println("图书价格：" + pr + " 元");
        System.out.println("出版年份：" + y + " 年");
    }

    // 根据价格划分档次
    public static void judgePrice(double p){
        System.out.println("----------价格档次----------");
        if(p >= 80){
            System.out.println("图书档次：高端书籍");
        }else if(p >= 40){
            System.out.println("图书档次：中端书籍");
        }else if(p >= 20){
            System.out.println("图书档次：平价书籍");
        }else{
            System.out.println("图书档次：低价书籍");
        }
        System.out.println("信息录入成功，可进行版本控制");
        System.out.println("熟悉Git拉取、提交、分支合并流程");
    }
}
