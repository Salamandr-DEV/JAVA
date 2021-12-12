import java.io.IOException;
import java.util.Map;

public class LR3 {
    public static void main(String[] args) {
        HuffManTree huffManTree = new HuffManTree("D:\\Projects JAVA\\eclipse-workspace\\LR3\\src\\text.txt");
        try {
            huffManTree.createTree();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(String.format("Huffman code: %s",  huffManTree.getTextCode()));
        System.out.println();
        System.out.println(String.format("Huffman decode: %s", huffManTree.decode(huffManTree.getTextCode())));
    }
}