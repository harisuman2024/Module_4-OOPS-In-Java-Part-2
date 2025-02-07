class Lab582{
public static void main(String as[]){

StringBuilder sb1=new StringBuilder();
System.out.println(sb1.length());  //0
System.out.println(sb1.capacity()); //16

StringBuilder sb2=new StringBuilder("Hello");
System.out.println(sb2); //Hello
System.out.println(sb2.length()); //5
System.out.println(sb2.capacity()); //21

sb2.append(" Guys!!!");
System.out.println(sb2);   // Hello Guys!!!
System.out.println(sb2.length());  //13
System.out.println(sb2.capacity()); // 21

sb2.append("1234567899");
System.out.println(sb2);  
System.out.println(sb2.length());
System.out.println(sb2.capacity());

sb2.trimToSize();
System.out.println(sb2);
System.out.println(sb2.length());
System.out.println(sb2.capacity());

}
}
