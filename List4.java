import java.util.ArrayList;
import java.util.List;

public class List4 {
public static void main(String[] args) {
List<Integer> list = new ArrayList<>();
list.add(45);
list.add(35);
list.add(56);
list.add(67);
list.add(78);
list.add(89);
list.add(78);
list.add(12);
list.add(20);


int key = 67;


int index = -1; 
for (int i = 0; i < list.size(); i++) {
if (list.get(i) == key) {
index = i;
break;
}
}
if (index != -1) {
System.out.println("The key " + key + " is found at index: " + index);
} else {
System.out.println("The key " + key + " is not found in the list.");
}
}
}
