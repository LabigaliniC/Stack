import java.util.Scanner;

public class StackTest {
    public static void main(String[] args) {
        Stack<Aluno> a = new ObjectStack<>();

        a.push(new Aluno(1, "Junior", 21));
        a.push(new Aluno(2, "Emanuel", 22));
        a.push(new Aluno(3, "Augusto", 23));

        try { // tente
            System.out.println(a.pop());
            System.out.println(a.pop());
            System.out.println(a.pop());
            // Erro! fila vazia
            System.out.println(a.pop());
        } catch (IndexOutOfBoundsException ex) { // se pegar ....
            System.out.println(ex.getMessage());
        }
        System.out.println("Fim do programa!");
    }
}