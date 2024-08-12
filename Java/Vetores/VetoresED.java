package Java.Vetores;
public class VetoresED {
    public static void main(String[] args) {
        int quantidadeColunas = 3;//quantidade de "colunas"
        int[][] arrays = new int[quantidadeColunas][quantidadeColunas];
        
        for (int i = 0; i <= quantidadeColunas; i++) {
            for (int j = 0; j <= quantidadeColunas; j++) {
                arrays[i][j] = i + 3 + j;
                System.out.println(arrays[i][j]);
            }
        }
    }
}
