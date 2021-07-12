import com.example.entities.StaticClassA;
import com.example.entities.StaticClassB;
import com.example.interfaces.TestInterface;
import com.example.javase.AbstractClass;
import com.example.javase.CharsetDemo;
import com.example.javase.CurrentSynch;
import com.example.javase.ReflectDemo;

public class App {
    public static void main(String[] args) throws Exception {
        TestInterface ti ;
        // TestInterface ti =  new CharsetDemo();
        // ti = new CurrentSynch();
        // ti = new AbstractClass();
        ti = new ReflectDemo();


        ti.test();
    }
}
