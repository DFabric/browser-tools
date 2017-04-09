import javax.tools.*;
import java.io.*;

public class FrozenCompile {
  public static void main(String args[]) {
    final long start = System.currentTimeMillis();
    final int ans = compile("Test", "public class Test {}");
    final long end1 = System.currentTimeMillis();
    final int ans2 = compile("Test2", "public class Test2 { public static void main() {} }");
    final long end2 = System.currentTimeMillis();
    System.out.println(ans + ans2);
    System.out.println("Time taken (ms): " + (end1 - start) + ", " + (end2 - end1));
  }

  private static void writeToFile(final File path, final String data) throws IOException{
    try(final java.io.FileWriter fileWriter = new java.io.FileWriter(path)) {
      fileWriter.write(data);
    }
  }

  public static int compile(final String className, final String scriptText) {
    try {
      final String filePath = "/tmp/" + className + ".java";
      writeToFile(new File(filePath), scriptText);

      final JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
      final String[] compileData = {"-d", "/tmp", filePath};
      System.out.println("Compiling: " + java.util.Arrays.toString(compileData));

      final int result = compiler.run(null, null, null, compileData);
      return result;
    } catch (final IOException e) {
      e.printStackTrace();
      return -1;
    }
  }
}
