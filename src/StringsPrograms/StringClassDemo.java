package StringsPrograms;
public class StringClassDemo
{
    public static void main(String[]args){
        // String is prebuilt class in Java
        // 1.Define String using string literal
        String str = "Hello";
        String strSplit = "Java/Dynamic/Language";
        //2. Using String object
        String strObj = new String("Hello");
        System.out.println("Char At index " +str.charAt(2));
        System.out.println("Index of char given "+ str.indexOf('e'));
        System.out.println("Chars from index to index(Substring) " + str.substring(3,str.length()));
        System.out.println("Chars from start index only " + str.substring(3));
        System.out.println(("concat "+ str.concat("Rakhi")));
        System.out.println("Uppercase " + str.toUpperCase());
        System.out.println("Lowercase " + str.toLowerCase());
        //split
        String strArr[] = strSplit.split("/");
        System.out.println();
        for(int i=0;i<strArr.length;i++)
            System.out.print("Split according to the / " + strArr[i]);
        //replace string
        System.out.println("Replace str "+ str.replace('l','m'));


    }

}
