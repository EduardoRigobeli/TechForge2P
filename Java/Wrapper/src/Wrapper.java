public class Wrapper {
    public static void main(String[] args) {
        String[] palavrasValidas = {"help", "use", "inventory", "get", "with"};
        String palavra = "Vamos ESTUDAR muito TADS";

        String[] strings = palavra.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if(i == 0) {
                String plv = strings[i];
                for (int j = 0; j < palavrasValidas.length; j++) {
                    if (plv.equalsIgnoreCase(palavrasValidas[j])) {
                        System.out.println("comando válidos: " + plv);
                        break;
                    } else {
                        System.out.println("não compreendi...");
                    }
                }
            } else {
                System.out.println("outras palavras: " + strings[i]);
            }
        }
    }
}
