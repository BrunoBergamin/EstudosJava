import entities.Champion;

import java.util.Scanner;

public class Main {

    public static void Main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do primeiro campeão:");
        System.out.print("Nome: ");
        String name1 = sc.nextLine();
        System.out.print("Vida inicial: ");
        int life1 = sc.nextInt();
        System.out.print("Ataque: ");
        int attack1 = sc.nextInt();
        System.out.print("Armadura: ");
        int armor1 = sc.nextInt();
        sc.nextLine();

        Champion c1 = new Champion(name1, life1, attack1, armor1);

        System.out.println("Digite os dados do segundo campeão:");
        System.out.print("Nome: ");
        String name2 = sc.nextLine();
        System.out.print("Vida inicial: ");
        int life2 = sc.nextInt();
        System.out.print("Ataque: ");
        int attack2 = sc.nextInt();
        System.out.print("Armadura: ");
        int armor2 = sc.nextInt();

        Champion c2 = new Champion(name2, life2, attack2, armor2);

        System.out.print("Quantos turnos você deseja executar? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            if (c1.getLife() == 0 || c2.getLife() == 0) {
                break;
            }

            c1.takeDamage(c2);
            c2.takeDamage(c1);

            System.out.println("Resultado do turno " + i + ":");
            System.out.println(c1.status());
            System.out.println(c2.status());
        }

        System.out.println("FIM DO COMBATE");

        sc.close();
    }
}
