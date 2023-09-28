/**
 * Asadel
 * BNSP
 * bismillah
*/
package Program;

import com.View.View;
import pKlasemen.Tim;


public class Main2 {
    public static void main(String[] args) {
        Tim A = new Tim("A");
        Tim B = new Tim("B");
        Tim C = new Tim("C");
        Tim D = new Tim("D");
        Tim E = new Tim("E");
        
        A.menang(B, 3, 0);
        B.menang(C, 3, 0);
        C.menang(D, 3, 0);
        A.menang(D, 3, 0);
        E.seri(B, 3, 0);
        C.menang(A, 3, 0);
        B.menang(D, 3, 0);
        E.menang(A, 3, 0);
        C.menang(E, 3, 0);
        D.seri(E, 3, 0);
        
        View.home();
    }
}
