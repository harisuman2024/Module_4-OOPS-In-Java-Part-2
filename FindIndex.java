public class FindIndex {

    public static int findIndex(char[] chArr, char ch) {
        for (int i = 0; i < chArr.length; i++) {
            if (chArr[i] == ch) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        char[] chArr = {'a', 'b', 'c', 'd', 'e'};
        char ch = 'c';
        System.out.println(findIndex(chArr, ch));
    }
}
