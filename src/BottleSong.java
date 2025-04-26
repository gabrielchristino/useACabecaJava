public class BottleSong {
    public static void main(String[] args) {
        int bottlesNum = 10;
        String word = "bottles";

        while (bottlesNum > 0) {
//            Abaixo o if original do código
//            if(bottlesNum == 1) {
//                word = "bottle";
//            }

            System.out.println(bottlesNum + " green " + word + ", hanging on the wall.");
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall.");
            System.out.println("And if one green bottle should accidentally fall,");
            bottlesNum = bottlesNum - 1;
            
//          Aqui o local correto para que no final, não imprima
//          There'll be 1 green *bottles*, hanging on the wall.
            if(bottlesNum == 1) {
                word = "bottle";
            }

            if(bottlesNum > 0) {
                System.out.println("There'll be " + bottlesNum + " green " + word + ", hanging on the wall.");
            } else {
                System.out.printf("There'll be no green bottles, hanging on the wall.");
            }
        }
    }
}
