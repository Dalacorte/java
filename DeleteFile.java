import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File myObj = new File("name.txt");
        if (myObj.delete()) {
            System.out.println("O arquivo foi deletado: " + myObj.getName());
        } else {
            System.out.println("Falha ao deletar o arquivo.");
        }
    }
}