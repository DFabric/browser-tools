import javax.script.*;
import java.util.Date;
/**
 * Tests DoppioJVM's ability to pull in Nashorn's JAR file and use it seamlessly.
 * Sample code taken from http://winterbe.com/posts/2014/04/05/java8-nashorn-tutorial/
 */
class NashornBenchmark {
  public static String prop1 = "I'm a property.";
  public static String fun1(String name) {
    System.out.format("Hi there from Java, %s", name);
    return "greetings from java";
  }
  public static void main(String[] args) throws Exception {
    // Run JS code.
    ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
    engine.eval("print('Hello World!');");
    engine.eval("function isPrime(n) { var i = 3,l=Math.sqrt(n);while(i < l){ if (n % i++ === 0) return false} return true;}");
    engine.eval("print(isPrime(Math.pow(2,31) - 1))");

    // JVM -> JS
    engine.eval("var fun1 = function(name) {\nprint('Hi there from Javascript, ' + name);\nreturn 'greetings from javascript';};\nvar fun2 = function (object) {\nprint('JS Class Definition: ' + Object.prototype.toString.call(object));\n};");
    Invocable invocable = (Invocable) engine;
    Object result = invocable.invokeFunction("fun1", "Peter Parker");
    System.out.println(result);
    System.out.println(result.getClass());
    invocable.invokeFunction("fun2", new Date());
  }
}
