public class ArrayMethod{
    static void ab(int[] r){
        
        r[0]=98;
        
    }
    public static void main(String[] args) {
        int[] marks = {45,56,67,78,89};
        ab(marks);
        System.out.println(marks[0]);
    }
}