package Oct_JavaCourse_ATB9X.ex_28102024StringFunctions;

public class SubStringFunc {

    public static void main(String[] args) {

        String str = "Niagara. O roar again! ";
        String roar = str.substring(11,15);

        System.out.println(roar);
        System.out.println("Length of the string : " +str.length());

        String again = str.substring(16,23);
        System.out.println(again);

        //Sub string concat

        String s1 = "Shobha ";
        String s2 = "Rao";
        System.out.println(s1.concat(s2));

        String fruits = " apple , banana , cherry";
        String[] split_fruits = fruits.split(",");
        System.out.println(split_fruits[0]);
        System.out.println(split_fruits[1]);
        System.out.println(split_fruits[2]);
        System.out.println(split_fruits[0].toUpperCase());
        System.out.print(split_fruits[0]);
        System.out.print(split_fruits[1]);
        System.out.print(split_fruits[2]);
        System.out.println();


        String fruits2 = "ABC-DEF-XYZ ";
        String[] split_fruits2 = fruits2.split("-");
        System.out.println(split_fruits2[0]);
        System.out.println(split_fruits2[1]);
        System.out.println(split_fruits2[2]);

        //charAt string function
        String s3 = "Shobha";
        System.out.println(s3.length()); //6
        System.out.println(s3.charAt(2)); //charAt(2) is o

        //trim function
        String s4 = " Shobha ";
        System.out.println(s4.trim()); //removes the spaces in the string

        //indexof function
        String s5 = "Shobha";
        System.out.println(s5.indexOf("b"));
        System.out.println(s5.indexOf("o"));
        System.out.println(s5.indexOf("S"));
        System.out.println(s5.indexOf("a"));

        //contains --> return true or false
       String s6 = "Shobha";
        System.out.println(s6.contains("bha"));
        System.out.println(s6.contains("rao"));

        //lastindexof
        String s7 = "NidhiRao";
        System.out.println(s7.lastIndexOf("R"));
        System.out.println(s7.lastIndexOf("o"));

        //replace and replaceall
        String s8 = "Shobhaji";
        System.out.println(s8.replace("ji" ," "));
        System.out.println(s8.replaceAll("ji" ," Rao"));

        //startsWith and endsWith
        String s9 = "Shobha";
        System.out.println(s9.startsWith("sho")); //false
        System.out.println(s9.startsWith("Sho")); //true
        System.out.println(s9.endsWith("bha")); //true
        System.out.println(s9.endsWith("rao")); //false

        //replace and replace all

        String s10 = "Mummy";
        System.out.println(s10.replace("u" , "o"));
        System.out.println(s10.replaceAll("m" ,"n"));













    }
}
