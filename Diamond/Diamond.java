import module java.base;

public class Diamond {

    static List<List> list;
    static boolean isdiamond;
    static String lastnode = "";

    public static void main(String[] args) {
        sample_3();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).size() < 3) {
                continue;
            }
            goinsides(i);
            if (isdiamond) {
                System.out.println("\nis diamond : " + isdiamond + " ➔ last node : " + lastnode);
                isdiamond = false;
            }
        }
    }

    static String goinsides(int node) {

        for (int i = 1; i < list.get(node).size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(node).get(i).equals(list.get(j).get(0))) {
                    System.out.print(list.get(node).get(0) + ",");
                    goinsides(j);
                }
            }
        }
        if (list.get(node).size() == 1) {
            isdiamond = lastnode.equals(list.get(node).get(0));
            lastnode = list.get(node).get(0).toString();
            System.out.println(list.get(node).get(0) + ",");
        }
        return list.get(node).get(0).toString();
    }

    static void sample_1() {
        list = new ArrayList();
        List<String> row = new ArrayList();
        row.add("new");
        row.add("old");
        row.add("basic");
        list.add(row);

        row = new ArrayList();
        row.add("old");
        list.add(row);

        row = new ArrayList();
        row.add("better");
        row.add("old");
        row.add("alternative");
        row.add("scott");
        list.add(row);

        row = new ArrayList();
        row.add("alternative");
        row.add("basic");
        row.add("scott");
        list.add(row);

        row = new ArrayList();
        row.add("basic");
        list.add(row);

        row = new ArrayList();
        row.add("scott");
        list.add(row);
    }

    static void sample_2() {
        list = new ArrayList();
        List<String> row = new ArrayList();
        row.add("a");
        row.add("b");
        row.add("c");
        list.add(row);

        row = new ArrayList();
        row.add("b");
        row.add("d");
        list.add(row);

        row = new ArrayList();
        row.add("c");
        row.add("e");
        row.add("d");
        list.add(row);

        row = new ArrayList();
        row.add("d");
        row.add("e");
        list.add(row);

        row = new ArrayList();
        row.add("e");
        list.add(row);

    }
    
    static void sample_3() {
        list = new ArrayList();
        List<String> row = new ArrayList();
        row.add("simple");
        row.add("number");
        row.add("integer");
        list.add(row);
        
        row = new ArrayList();
        row.add("integer");
        row.add("number");
        list.add(row);
        
        row = new ArrayList();
        row.add("number");
        list.add(row);
    }
}
