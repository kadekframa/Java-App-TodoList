import java.util.stream.Stream;

public class AplikasiTodolist {

    public static String[] model = new String[10];
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
//        testShowTodoList();
//        testAddTodoList();
//        testRemoveTodoList();
//        testInput();
        testViewShowTodoList();
    }

    /**
     * Menampilkan todo list
     */
    public static void showTodoList(){
        System.out.println("TODOLIST");
        for (var i = 0; i < model.length; i++){
            String todo = model[i];
            var no = i + 1;

            if (todo != null){
                System.out.println(no + ". " + todo);
            }
        }
    };

    /**
     * Testing menampilkan todo list
     */
    public static void testShowTodoList(){
        model[0] = "Belajar Java Dasar";
        model[1] = "Belajar Java App Todo List";
        model[2] = "Tetap Semangat";
        showTodoList();
    };


    /**
     * Menambahkan todo list
     */
    public static void addTodoList(String todo){
        // cek apakah model penuh?
        var isFull = true;
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null){
                // model masih ada yang kosong
                isFull = false;
                break;
            }
        }

        // jika penuh, kita resize ukuran array 2X lipat
        if (isFull){
            var temp = model;
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        // tambahkan ke posisi yang data arraynya NULL.
        for (var i = 0; i < model.length; i++){
            if (model[i] == null){
                model[i] = todo;
                break;
            }
        }
    };

    /**
     * Testing menambah todo list
     */
    public static void testAddTodoList(){
        for (int i = 0; i < 24; i++) {
            addTodoList("Todo List ke " + i);
        }

        showTodoList();
    }


    /**
     * Menghapus todo list
     */
    public static boolean removeTodoList(Integer number){
        if ((number - 1) >= model.length){
            return false;
        }else if(model[number - 1] == null){
            return false;
        }else {
            for (int i = (number - 1); i < model.length; i++){
             if (i == (model.length) - 1){
                 model[i] =null;
             }else{
                 model[i] = model[i + 1];
             }
            }
            return  true;
        }
    };

    /**
     * Testing menghapus todo list
     */
    public static void testRemoveTodoList(){
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat");
        addTodoList("lima");

        var result = removeTodoList(20);
        System.out.println(result);

        result = removeTodoList(7);
        System.out.println(result);

        result = removeTodoList(2);
        System.out.println(result);

        showTodoList();
    };


    /**
     * Membuat input data.
     * @param info
     * @return
     */
    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    /**
     * Testing membuat input data.
     */
    public static void testInput(){
        var name = input("Nama");
        System.out.println("Hi " + name);

        var channel = input("Channel");
        System.out.println(channel);
    }


    /**
     * Menampilkan view todo list
     */
    public static void viewShowTodoList(){
        while (true){
            showTodoList();

            System.out.println("MENU :");
            System.out.println("1. Tambah todo list");
            System.out.println("2. Hapus todo list");
            System.out.println("x. Keluar");

            var input = input("Pilih");
            if (input.equals("1")){
                viewAddTodoList();
            }else if (input.equals("2")){
                viewRemoveTodoList();
            }else if(input.equals("x")){
                break;
            }else {
                System.out.println("Pilihan tidak dimengerti.");
            }
        }
    };

    /**
     * Testing menampilkan view todo list
     */
    public static void testViewShowTodoList(){
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat");
        addTodoList("lima");
        viewShowTodoList();
    }


    /**
     * Menampilkan view menambahkan todo list
     */
    public static void viewAddTodoList(){

    };

    /**
     * Menampilkan view menghapus todo list
     */
    public static void viewRemoveTodoList(){

    };
}