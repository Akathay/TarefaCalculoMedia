public class Notas {
    public static void main(String args[]) {
        calculoMedia();
    }
    public static void calculoMedia() {
        System.out.println("-- Cálculo da Média de Notas --");
        int nota1 = 8;
        int nota2 = 7;
        int nota3 = 4;
        int nota4 = 9;
        int media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Nota 4: " + nota4);
        System.out.println("----------");
        System.out.println("Média: " + media);
    }
}
