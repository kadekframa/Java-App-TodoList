import java.util.stream.Stream;

public class AplikasiTodolist {

    public static String[] model = new String[10];

    public static void main(String[] args) {



    }

    /**
     * Menampilkan todo list
     */
    public static void showTodoList(){
        for (var i = 0; i < model.length; i++){
            String todo = model[i];
            var no = i + 1;

            if (todo != null){
                System.out.println(no + "." + todo);
            }
        }
    };

    /**
     * Menambahkan todo list
     */
    public static void addTodoList(){

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