import java.util.*;
class A{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a=s.indexOf('{');
        int b=s.indexOf('}');
        s=s.substring(a+1,b);
        String c[]=s.split(",");
        for(int i=0;i<c.length;i++){
            int d=Integer.parseInt(c[i]);
            int k=0;
            for(int j=1;j<=d;j++){
                if(d%j==0){
                    k++;
                }
            }
            if(k==2){
                System.out.print(d+" ");
            }
        }
    }
}