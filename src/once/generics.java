package once;

public class generics {
    public static void main(String[] args) {
//        Books();
        Integer[] a = {100, 22, 58, 41, 6, 50};
        Character[] c = {'v', 'g', 'a', 'c', 'x', 'd', 't'};
        String[] s = {"Virat", "Rohit", "Abhinay", "Chandu", "Sam", "Bharat", "Kalam"};

        System.out.print("Sort Integer array: ");
        sort_generic(a);

        System.out.print("Sort Character array: ");
        sort_generic(c);

        System.out.print("Sort String array: ");
        sort_generic(s);
    }

    private static void Books() {
        Dictionary<String, String, Integer> l = new Book("Study", "name", 234);
        String english = l.getKey();
        String vietnamese = l.getKey();
        int quantity = l.getInfo();
        System.out.println(english + ": " + vietnamese + "\nQuantity: " + quantity);
    }

    public static <T extends Comparable<T> > void sort_generic(T[] a)
    {

        for (int i = 0; i < a.length - 1; i++) {

            for (int j = 0; j < a.length - i - 1; j++) {

                if (a[j].compareTo(a[j + 1]) > 0) {

                    swap(j, j + 1, a);
                }
            }
        }

        for (T i : a)
        {
            System.out.print(i + ", ");
        }
        System.out.println();

    }

    public static <T> void swap(int i, int j, T[] a)
    {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}