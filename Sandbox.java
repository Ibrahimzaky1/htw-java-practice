public class Sandbox {
     public static void main(String[] args) {
       try {
          Write();
       }
       catch (IOException e) {
          System.out.println("Something went wrong while writing the file.");
       }
     }
     public static void Write() throws IOException {
          BufferedWriter W = new BufferedWriter(new FileWriter("name.txt"));
          W.write("test");
          W.close();
     }
}
