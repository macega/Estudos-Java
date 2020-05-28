package estudos.java.string;

/**
 *
 * @author juliano Alves Medina
 */
public class NovaLinha {

    /**
     * 
     * Como você adiciona um separador de linhas em Java?
     * @param args
     */
    public static void main(String[] args) {
        String s;
        
        s = "linha 1";
        s += System.getProperty("line.separator");
        s += "linha 2";
        s += System.getProperty("line.separator");
        s += "linha 3";
        
        System.out.println(s);
    }
}
