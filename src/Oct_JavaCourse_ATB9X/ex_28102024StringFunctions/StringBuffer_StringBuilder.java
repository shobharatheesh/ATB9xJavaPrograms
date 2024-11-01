package Oct_JavaCourse_ATB9X.ex_28102024StringFunctions;

public class StringBuffer_StringBuilder {

    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Shobha");
        stringBuffer.append(" Rao");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());

        StringBuilder stringBuilder = new StringBuilder("Shobha ");
        stringBuilder.append("Rao");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.append(" World"));
        System.out.println(sb.reverse());


        String s1 ="Hello ";
        String s2 ="World";
        String s3 = s1 +s2;
        System.out.println(s3);


    }
}
