//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    public static void main(String[] args) {
//
//        try {
//            String text = null;
//            System.out.println(text.length());
//
//        } catch (NullPointerException e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args){
        try
        {
        String text = "lorem ipsum";
        int textLength = text.length();
        double dividing = (double)textLength / 2;
        System.out.println(dividing);
    }
    catch (NullPointerException e){
        System.out.println("text was null");
    }
        catch (ArithmeticException e){
            System.out.println("cant divide by zero");
        }
}
}