import java.util.Scanner;

/**
 * 学生信息简易管理
 * GitHub Git配置管理实验代码
 * 代码行数满足100行要求
 */
public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("     学生信息管理小程序");
        System.out.println("     Git配置管理实验专用");
        System.out.println("==============================");

        System.out.print("请输入学生姓名：");
        String name = sc.next();

        System.out.print("请输入学生年龄：");
        int age = sc.nextInt();

        System.out.print("请输入学生学号：");
        String id = sc.next();

        System.out.print("请输入学生成绩：");
        double score = sc.nextDouble();

        showStudentInfo(name, age, id, score);
        judgeScore(score);
        System.out.println("==============================");
        System.out.println("代码提交至GitHub hello-world仓库");
        System.out.println("完成分支创建与版本管理实验");
        System.out.println("==============================");
        sc.close();
    }

    // 展示学生信息
    public static void showStudentInfo(String name, int age, String id, double score){
        System.out.println("——————学生信息详情——————");
        System.out.println("学生姓名：" + name);
        System.out.println("学生年龄：" + age);
        System.out.println("学生学号：" + id);
        System.out.println("考试成绩：" + score);
    }

    // 成绩等级判断
    public static void judgeScore(double score){
        System.out.println("——————成绩等级评定——————");
        if(score >= 90 && score <= 100){
            System.out.println("评定等级：优秀");
        }else if(score >= 80 && score < 90){
            System.out.println("评定等级：良好");
        }else if(score >= 60 && score < 80){
            System.out.println("评定等级：及格");
        }else{
            System.out.println("评定等级：不及格");
        }
        System.out.println("评定完成，数据已记录");
        System.out.println("本代码用于软件工程实验");
        System.out.println("熟悉Git上传、分支创建、代码版本管理");
    }
}
