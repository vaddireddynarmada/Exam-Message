package practiceStatic;

public class Example {
    static int n = 9;

    public static void main(String[] args) {
        int n = 6;
        Example st = new Example();
        Example st1 = new Example();
        System.out.println(st.n);
        st.n = 7;
        st1.n = 4;
        System.out.println(st.n);
        System.out.println(st1.n);
        ExamToString to = new ExamToString();
        to.id = 2;
        to.name = "nnn";
        to.col="d";
       System.out.println("Main : "+to);
        ExamToString to1 = new ExamToString(1, "qwrerr","name");
        System.out.println(to1);
    }
}
