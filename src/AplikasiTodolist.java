import java.util.stream.Stream;

public class AplikasiTodolist {

    public static String[] model = new String[10];

    public static void main(String[] args) {
//        testShowTodoList();


    }

    /**
     * Menampilkan todo list
     */
    public static void showTodoList(){
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
     * Menghapus todo list
     */
    public static void removeTodoList(){

    };


    /**
     * Menampilkan view todo list
     */
    public static void viewShowTodoList(){

    };

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