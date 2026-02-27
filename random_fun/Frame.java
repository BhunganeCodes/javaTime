public class Frame {
    public static void main(String[] args) {
        String characters = "12345abcdefghijklmonopqrstuvwxyz";
        int width = 5;
        int height = 4;
        int index = 0;

        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                if (j == 0 | j == width - 1 | i == 0 | i == height - 1){
                    System.out.print(characters.charAt(index));
                    index += 1;
                } else{
                    System.out.print(" ");
                }
                
            }
            
            System.out.println();
        }
        
    }
}