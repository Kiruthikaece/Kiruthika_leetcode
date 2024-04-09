import java.util.Scanner;
class MulDiv {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        int res1=(n<<4)-n;
        int res2=(n<<3)-(n>>1);
        int res3=((n<<4)-n)>>4;
        System.out.println(res1+"\n"+res2+"\n"+res3);
    }
}