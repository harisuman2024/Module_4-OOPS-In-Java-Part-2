public class Lab529{
public static void main(String[] args) {
String str1 = "JLC";
String str2 = new String("JLC");
String str3 = str2.intern();

System.out.println(str1 == str2);
System.out.println(str1 == str3);
System.out.println(str2 == str3);
System.out.println();

String str4 = "OK".intern();
String str5 = "OK";
System.out.println(str4 == str5);
}
}

// How Many objects Created - 3 
// Inside Pool - 1
//  Outside pool - 2( Unused ) 








