# Java Level UP 

Below is the **1Z0-829 (Oracle Certified Professional: Java SE 17 Developer)** syllabus, organized by the **official exam objectives**, with **compact code examples** for each area. (Exam format: multiple choice, 90 minutes, passing score 68%.) ([Oracle University][1])

---

## 1) Handling date, time, text, numeric and boolean values ([mughal.no][2])

### Core ideas

* primitives vs wrappers, casting/promotion
* `String`, `StringBuilder`, **text blocks**
* `Math`, `BigDecimal` basics
* `java.time` (date/time, formatting)

```java
import java.math.BigDecimal;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
    // Numeric + wrappers + promotion
    int a = 5;
    double b = a + 2.5;        // promotion int -> double
    Integer w = Integer.valueOf("10");
    int sum = w + 3;

    // Text blocks (Java 15+)
    String json = """
      {
        "name": "Abdulmalik",
        "role": "Java Dev"
      }
      """;

    // StringBuilder
    String s = new StringBuilder().append("Hello ").append("Java 17").toString();

    // BigDecimal (money-safe)
    BigDecimal price = new BigDecimal("10.50").multiply(new BigDecimal("2"));

    // java.time
    LocalDate d = LocalDate.of(2026, 2, 23);
    LocalDateTime dt = LocalDateTime.now();
    String formatted = dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);

    System.out.println(b);
    System.out.println(sum);
    System.out.println(json);
    System.out.println(s);
    System.out.println(price);
    System.out.println(d);
    System.out.println(formatted);
  }
}
```

---

## 2) Controlling program flow ([mughal.no][2])

### Core ideas

* loops, `break/continue`
* `switch` statement + **switch expression**
* pattern-friendly `if`/conditions

```java
public class Flow {
  public static void main(String[] args) {
    int x = 7;

    // switch expression
    String level = switch (x) {
      case 0, 1, 2 -> "LOW";
      case 3, 4, 5 -> "MED";
      default -> "HIGH";
    };

    // loops
    int total = 0;
    for (int i = 0; i < 5; i++) {
      if (i == 2) continue;
      total += i;
    }

    System.out.println(level);
    System.out.println(total);
  }
}
```

---

## 3) Utilizing Java object-oriented approach ([mughal.no][2])

### Core ideas

* inheritance, overriding/overloading, polymorphism
* interfaces + default methods
* **records**
* **sealed classes**
* `instanceof` pattern matching

```java
// record (immutable data carrier)
record User(String name, int age) {}

// sealed types (restrict inheritance)
sealed interface Payment permits Card, Cash {}
final class Card implements Payment { String last4 = "1234"; }
final class Cash implements Payment {}

class OOP {
  static String describe(Object o) {
    // pattern matching for instanceof
    if (o instanceof User u) return u.name() + ":" + u.age();
    return "unknown";
  }

  public static void main(String[] args) {
    User u = new User("Abdulmalik", 30);
    Payment p = new Card();

    System.out.println(describe(u));
    System.out.println(p.getClass().getSimpleName());
  }
}
```

---

## 4) Handling exceptions ([mughal.no][2])

### Core ideas

* checked vs unchecked
* multi-catch
* try-with-resources

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex {
  public static void main(String[] args) {
    Path p = Path.of("a.txt");

    try (BufferedReader br = Files.newBufferedReader(p)) {
      System.out.println(br.readLine());
    } catch (IOException e) {
      System.out.println("IO problem: " + e.getMessage());
    } catch (RuntimeException e) {
      System.out.println("Runtime problem: " + e.getMessage());
    }
  }
}
```

---

## 5) Working with arrays and collections ([mughal.no][2])

### Core ideas

* arrays basics
* `List`, `Set`, `Map`
* `Comparable` vs `Comparator`
* generics variance basics (`? extends`, `? super`)

```java
import java.util.*;

public class Col {
  public static void main(String[] args) {
    int[] arr = {3, 1, 2};
    Arrays.sort(arr);

    List<String> list = new ArrayList<>(List.of("b", "a", "c"));
    list.sort(Comparator.naturalOrder());

    Set<String> set = new HashSet<>(list);

    Map<String, Integer> map = new HashMap<>();
    map.put("a", 1);
    map.merge("a", 1, Integer::sum); // a becomes 2

    System.out.println(Arrays.toString(arr));
    System.out.println(list);
    System.out.println(set);
    System.out.println(map);
  }
}
```

---

## 6) Working with streams and lambda expressions ([mughal.no][2])

### Core ideas

* functional interfaces
* Stream pipeline: `map/filter/flatMap/reduce/collect`
* `Optional`

```java
import java.util.*;
import java.util.stream.*;

public class Streams {
  public static void main(String[] args) {
    List<String> names = List.of("ali", "abdulmalik", "sara", "saud");

    int totalLen = names.stream()
        .filter(n -> n.length() >= 4)
        .map(String::toUpperCase)
        .mapToInt(String::length)
        .sum();

    Optional<String> firstLong = names.stream()
        .filter(n -> n.length() > 5)
        .findFirst();

    System.out.println(totalLen);
    System.out.println(firstLong.orElse("NONE"));
  }
}
```

---

## 7) Concurrency ([mughal.no][2])

### Core ideas

* `ExecutorService`, `Callable/Future`
* synchronization basics
* parallel streams (know behavior/tradeoffs)

```java
import java.util.concurrent.*;

public class Con {
  public static void main(String[] args) throws Exception {
    ExecutorService pool = Executors.newFixedThreadPool(2);

    Future<Integer> f = pool.submit(() -> 40 + 2);
    System.out.println(f.get()); // blocks until done

    pool.shutdown();
  }
}
```

---

## 8) I/O (including NIO.2 paths/files) ([mughal.no][2])

### Core ideas

* `Path`, `Files` operations
* reading/writing text
* directory operations basics

```java
import java.nio.file.*;
import java.util.List;

public class Nio {
  public static void main(String[] args) throws Exception {
    Path p = Path.of("notes.txt");

    Files.write(p, List.of("line1", "line2"));
    List<String> lines = Files.readAllLines(p);

    System.out.println("Exists? " + Files.exists(p));
    System.out.println(lines);
  }
}
```

---

## 9) JDBC (database access) ([mughal.no][2])

### Core ideas

* `Connection`, `PreparedStatement`, `ResultSet`
* transactions (`commit/rollback`)

```java
import java.sql.*;

public class JdbcDemo {
  public static void main(String[] args) throws Exception {
    String url = "jdbc:postgresql://localhost:5432/app";
    String user = "app";
    String pass = "secret";

    try (Connection c = DriverManager.getConnection(url, user, pass)) {
      c.setAutoCommit(false);

      try (PreparedStatement ps = c.prepareStatement(
          "select id, name from employees where id = ?")) {
        ps.setInt(1, 10);

        try (ResultSet rs = ps.executeQuery()) {
          while (rs.next()) {
            System.out.println(rs.getInt("id") + " " + rs.getString("name"));
          }
        }
      }

      c.commit();
    } catch (SQLException e) {
      System.out.println("SQL error: " + e.getMessage());
    }
  }
}
```

---

## 10) Modules (JPMS) ([mughal.no][2])

### Core ideas

* `module-info.java`
* `exports`, `requires`
* compile/run with module path

**module-info.java**

```java
module com.example.app {
  requires java.sql;
  exports com.example.app.api;
}
```

**Compile / Run**

```bash
# compile
javac -d out --module-source-path src $(find src -name "*.java")

# run
java --module-path out -m com.example.app/com.example.app.Main
```

---

If you want it “exam-ready”, tell me which areas you’re weakest at (Streams, Concurrency, Modules, JDBC are usually the heaviest), and I’ll generate a **topic-by-topic checklist + practice-style questions format** aligned to these objectives.

[1]: https://education.oracle.com/java-se-21-developer/pexam_1Z0-829?utm_source=chatgpt.com "Java SE 17 Developer Exam Number: 1Z0-829"
[2]: https://www.mughal.no/jse17ocp/JSE17_AppB_Exam_Objectives.pdf?utm_source=chatgpt.com "Exam Topics: Java SE 17 Developer"
