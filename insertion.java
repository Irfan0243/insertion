 import java.util.Scanner;
 public class insertion {
    public static void main(String[] args){
        int size,loc,item,i;
        Scanner r= new Scanner(System.in);
        System.out.print("enter size of array :");
size=r.nextInt();
int a[]= new int[size+1];
System.out.print("Enter your element : ");
for(i=0;i<a.length;i++){
    a[i]=r.nextInt();
}
System.out.print("Enter location :");
loc=r.nextInt();
System.out.print("enter new item:");
item=r.nextInt();
for(i=size;i>loc;i--){
    a[i]=a[i-1];
}
a[loc]=item;
size++;
    
    for(i=0;i<a.length;i++){
        System.out.print(a[i] +" ");
    }
} 
}
