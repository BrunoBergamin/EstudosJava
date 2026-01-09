public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n, sum;
    System.out.print("Qual a ordem da matriz? ");
    n = sc.nextInt();

    int[][] mat = new int[n][n];

    for (int i = 0; i < mat.length; i ++){
        for (int j = 0; j < mat[i].length; j ++){
            System.out.print("Elemento [" + i + ", " + j + "]: ");
            mat[i][j] = sc.nextInt();
        }
    }

    sum = 0;
    for (int i = 0; i < mat.length; i ++){
        for (int j = 0; j < mat[i].length; j ++){
            if (i < j){
                sum += mat[i][j];
            }
        }
    }
    System.out.printf("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = %d", sum);

    sc.close();
}