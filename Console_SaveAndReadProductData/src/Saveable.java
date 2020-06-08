import java.util.ArrayList;
import java.util.List;

public interface Saveable {
    // using List generic interface for maximum flexibility => in the future we can use any type of list
    List<String> write();
    // another word to mean SAVE
    void read(List<String> readValues);
}
