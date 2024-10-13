package example_1;

public class TodoMain {
    public static void main(String[] args) {
        TodoApp todoApp = new TodoApp();
        todoApp.addTaskAuto(new Task("Balsuoti", "Balsuoti seimo rinkimuose", 3, "Edvinas"));
        todoApp.addTaskAuto(new Task("Namu darbai", "Atlikti namu darbus", 3, "Jonas"));
        todoApp.addTaskAuto(new Task("Atsikelti", "Atsikelti 9 ryto", 1, "Aldona"));
        todoApp.addTaskAuto(new Task("Paserti", "Paserti suni", 2, "Liudvikas"));
        todoApp.addTaskAuto(new Task("Papusryciauti", "Pasigaminti ir suvalgyti pusrycius", 2, "Arturas"));
        todoApp.addTaskAuto(new Task("Pirkti", "Apsipirkti parduotuveje", 3, "Mauzeris"));
        todoApp.menu();
        }
}
