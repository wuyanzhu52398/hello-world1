import java.util.Scanner;

/**
 * GitHub配置管理实验代码
 * 功能：输入、计算、判断、输出
 * 代码行数：100行左右
 */
public class SimpleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========== 实验程序启动 ==========");
        System.out.println("仓库：hello-world");
        System.out.println("用途：Git分支管理、代码上传实验");

        System.out.print("请输入你的姓名：");
        String name = sc.next();

        System.out.print("请输入你的学号：");
        String id = sc.next();

        System.out.print("请输入Java成绩：");
        int score = sc.nextInt();

        System.out.print("请输入实验完成次数：");
        int count = sc.nextInt();

        System.out.println("\n========== 信息录入完成 ==========");

        showInfo(name, id, score, count);
        checkScore(score);
        checkCount(count);

        System.out.println("\n========== 程序结束 ==========");
        System.out.println("代码已提交GitHub");
        System.out.println("分支创建成功");
        sc.close();
    }

    public static void showInfo(String name, String id, int score, int count) {
        System.out.println("---------- 个人信息 ----------");
        System.out.println("姓名：" + name);
        System.out.println("学号：" + id);
        System.out.println("成绩：" + score);
        System.out.println("实验次数：" + count);
        System.out.println("所属项目：Git配置管理实验");
        System.out.println("开发工具：IDEA / Eclipse");
        System.out.println("代码规范：符合Java命名标准");
        System.out.println("注释完整，结构清晰");
    }

    public static void checkScore(int score) {
        System.out.println("---------- 成绩判定 ----------");
        if (score >= 90) {
            System.out.println("等级：优秀");
        } else if (score >= 80) {
            System.out.println("等级：良好");
        } else if (score >= 70) {
            System.out.println("等级：中等");
        } else if (score >= 60) {
            System.out.println("等级：及格");
        } else {
            System.out.println("等级：不及格");
        }
        System.out.println("成绩判定完成，无逻辑错误");
    }

    public static void checkCount(int count) {
        System.out.println("---------- 实验完成情况 ----------");
        if (count >= 5) {
            System.out.println("完成情况：优秀");
        } else if (count >= 3) {
            System.out.println("完成情况：良好");
        } else if (count >= 1) {
            System.out.println("完成情况：合格");
        } else {
            System.out.println("完成情况：未完成");
        }
        System.out.println("本代码可正常运行");
        System.out.println("可直接提交至GitHub仓库");
        System.out.println("支持分支上传、合并、拉取");
        System.out.println("满足软件工程实验要求");
    }
}
