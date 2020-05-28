package estudos.java.systemProperties;

/**
 * 
 * @author juliano alves Medina
 */
public class exemplosSystem {

    public static void main(String[] args) {
        
        // Character that separates components of a file path. This is "/" on UNIX and "\" on Windows.
        System.out.println(System.getProperty("file.separator"));
        // Path used to find directories and JAR archives containing class files. Elements of the class path are separated by a platform-specific character specified in the path.separator property.
        System.out.println(System.getProperty("java.class.path"));
        // Installation directory for Java Runtime Environment (JRE)
        System.out.println(System.getProperty("java.home"));
        // JRE vendor name
        System.out.println(System.getProperty("java.vendor"));
        // JRE vendor URL
        System.out.println(System.getProperty("java.vendor.url"));
        //JRE version number
        System.out.println(System.getProperty("java.version"));
        //Sequence used by operating system to separate lines in text files
        System.out.println(System.getProperty("line.separator"));
        //Operating system architecture
        System.out.println(System.getProperty("os.arch"));
        //Operating system name
        System.out.println(System.getProperty("os.name"));
        //Operating system version
        System.out.println(System.getProperty("os.version"));
        //Path separator character used in java.class.path
        System.out.println(System.getProperty("path.separator"));
        //User working directory
        System.out.println(System.getProperty("user.dir"));
        //User home directory
        System.out.println(System.getProperty("user.home"));
        //User account name
        System.out.println(System.getProperty("user.name"));

    }
}
