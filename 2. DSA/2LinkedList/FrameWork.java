import java.util.LinkedList;

public class FrameWork {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("is");
        list.addFirst("name");
        System.out.println(list);

        list.addLast("Gogan");
        list.add("Ahir");
        System.out.println(list);
        
        list.addFirst("My");
        System.out.println(list);

        System.out.println(list.size());

        for (int i=0;i<list.size();i++) {
            System.out.print(list.get(i) + " --> ");
        }
        System.out.println("null");

        list.remove();
        // list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    }
}
