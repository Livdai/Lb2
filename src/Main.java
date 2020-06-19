import java.util.*;

class Main {
    public static void main(String[] args){
/*        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long start1 = System.nanoTime();

        for (int i=0; i<100000; i++){
            arrayList.add(0,i);

        }
        long stop1 = System.nanoTime();
        System.out.println("Время выполнения операций вставки в начало 'ArrayList' = " + (stop1 - start1)/1e9 + " с");

        long start2 = System.nanoTime();

        for (int i=0; i<100000; i++){
            linkedList.add(0,i);

        }
        long stop2 = System.nanoTime();
        System.out.println("Время выполнения операций вставки в начало 'LinkedList' = " + (stop2 - start2)/1e9 + " с");



        long start3 = System.nanoTime();

        for (int i=0; i<100000; i++){
            arrayList.get(i);

        }
        long stop3 = System.nanoTime();
        System.out.println("Время выполнения операций чтения каждого эл-та 'ArrayList' = " + (stop3 - start3)/1e9 + " с");

        long start4 = System.nanoTime();

        for (int i=0; i<100000; i++){
            linkedList.get(i);

        }
        long stop4 = System.nanoTime();
        System.out.println("Время выполнения операций чтения каждого эл-та 'LinkedList' = " + (stop4 - start4)/1e9 + " с");

        *//*для записи значения set(i,100)
        для удаления remove(0);
         *//*
        long start5 = System.nanoTime();

        for (int i=0; i<100000; i++){
            arrayList.set(i, 100);

        }
        long stop5 = System.nanoTime();
        System.out.println("Время выполнения операций записи значения каждого эл-та 'ArrayList' = " + (stop5 - start5)/1e9 + " с");

        long start6 = System.nanoTime();

        for (int i=0; i<100000; i++){
            linkedList.set(i, 200);

        }
        long stop6 = System.nanoTime();
        System.out.println("Время выполнения операций записи значения каждого эл-та 'LinkedList' = " + (stop6 - start6)/1e9 + " с");


        long start7 = System.nanoTime();

        for (int i=0; i<100000; i++){
            arrayList.remove(0);

        }
        long stop7 = System.nanoTime();
        System.out.println("Время выполнения операций удаления первого элемента 'ArrayList' = " + (stop7 - start7)/1e9 + " с");

        long start8 = System.nanoTime();

        for (int i=0; i<100000; i++){
            linkedList.remove(0);

        }
        long stop8 = System.nanoTime();
        System.out.println("Время выполнения операций удаления первого элемента 'LinkedList' = " + (stop8 - start8)/1e9 + " с");




        List<Integer> arrayList1 = new ArrayList<>();
        List<Integer> arrayList2 = new ArrayList<>();
        List<Integer> arrayList3 = new ArrayList<>();


        for (int i=0; i<10; i++){
            arrayList1.add(0,i);
            arrayList2.add(0,i);
            arrayList3.add(0,i+1);
        }
        System.out.println("Списки 'List1' и 'List2' равны: " + arrayList1.equals(arrayList2));
        System.out.println("Списки 'List1' и 'List3' равны: " + arrayList1.equals(arrayList3));*/

        List<User> user = new ArrayList<>();

        user.add(new User("Danil","nick1", 20));
        user.add(new User("Tima","nick2",19));
        user.add(new User("Dima","nick3",21));

        System.out.println(user);

        user.remove(new User("Danil","nick1", 20));

        System.out.println(user);
        System.out.println(user.contains(new User("Dima","nick3",21)) +" "+ user.contains(new User("Danil","nick1", 20)));


        HashSet<String> hash = new HashSet<>();
        hash.add("Литвиненко");
        hash.add("Кравецкий");
        hash.add("Никулин");
        hash.add("Медведев");
        hash.add("Богачев");
        hash.add("Никитин");
        hash.add("Плешков");
        hash.add("Шевченко");
        hash.add("Самойлик");
        hash.add("Бэк");
        hash.add("Повелица");
        hash.add("Коломиец");
        hash.add("Волошенко");
        hash.add("Мирошниченко");
        hash.add("Яковлев");


        System.out.println("***");
        System.out.println("Фамилии:");
        System.out.println("");
        hash.forEach(surname -> System.out.println(surname));
        System.out.println("");
        System.out.println("Фамили, начинающиеся на согласные: ");
        System.out.println("");

        for(String str: hash){
            boolean test = str.matches("^(?i:[АЕЄИІОУЯ]).*");
            if(test) {
                ;
            }
            else{
                System.out.println(str);
            }

        }
        System.out.println("");

        TreeSet<String> tree = new TreeSet<>();
        tree.add("Литвиненко");
        tree.add("Кравецкий");
        tree.add("Никулин");
        tree.add("Медведев");
        tree.add("Богачев");
        tree.add("Никитин");
        tree.add("Плешков");
        tree.add("Шевченко");
        tree.add("Самойлик");
        tree.add("Бэк");
        tree.add("Повелица");
        tree.add("Коломиец");
        tree.add("Волошенко");
        tree.add("Мирошниченко");
        tree.add("Яковлев");

        System.out.println("Вывод первых 5 фамилий: ");
        System.out.println("");


        Iterator<String> iterator = tree.iterator();
        int i=0;
        while(iterator.hasNext()){
            while (i<5) {
                String name = iterator.next();
                System.out.println(name);
                i++;
            }
            break;
        }

        HashSet<Student> student = new HashSet<>();
        student.add(new Student("Данил", "Литвиненко","ЕСТМу-19-1",3));
        student.add(new Student("Тимофей", "Кравецкий","ЕСТМу-19-1",3));
        student.add(new Student("Олег", "Никулин","ЕСТМу-19-1",3));
        student.add(new Student("Дима", "Богачев","ЕСТМу-19-1",3));

        System.out.println("Студенты: " + student);

        System.out.println("Есть ли Данил: " + student.contains(new Student("Данил", "Литвиненко","ЕСТМу-19-1",3)));
        System.out.println("Есть ли Денис: " +  student.contains(new Student("Денис", "Беспалько","ЕСТМу-19-1",2)));


        Set<Student> treestudent = new TreeSet<>();
        student.add(new Student("Данил", "Литвиненко","ЕСТМу-19-1",3));
        student.add(new Student("Тимофей", "Кравецкий","ЕСТМу-19-1",3));
        student.add(new Student("Олег", "Никулин","ЕСТМу-19-1",3));
        student.add(new Student("Дима", "Богачев","ЕСТМу-19-1",3));




    }
}
