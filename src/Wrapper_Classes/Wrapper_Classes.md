# Wrapper Classes in Java

## What are Wrapper Classes?

Each primitive type in Java has a corresponding **wrapper class**. Wrapper classes:

* Are **immutable** (like `String`)
* Are **reference types**
* Allow primitives to be treated as objects

### When to Use Wrapper Classes

* When a variable can be **null** (absence of value)
* When working with **generic collections** (`List`, `Set`, `Map`)
* When you need **utility methods** provided by wrapper classes

---

## Primitive Types and Their Wrappers

| Primitive | Wrapper     |
| --------- | ----------- |
| `byte`    | `Byte`      |
| `short`   | `Short`     |
| `int`     | `Integer`   |
| `long`    | `Long`      |
| `float`   | `Float`     |
| `double`  | `Double`    |
| `char`    | `Character` |
| `boolean` | `Boolean`   |

---

## Boxing and Unboxing

* **Boxing**: primitive → wrapper
* **Unboxing**: wrapper → primitive

### Manual

```java
int x = 100;
Integer y = Integer.valueOf(x); // boxing
int z = y.intValue();           // unboxing
```

### Autoboxing / Auto-unboxing

```java
double d = 10.8;
Double wd = d;     // autoboxing
double d2 = wd;    // auto-unboxing
```

⚠️ Autoboxing works **only when types match exactly**:

```java
Long a = 10L;   // OK
Integer b = 10; // OK

Long c = 10;    // ❌ int → Long
Integer d = 10L;// ❌ long → Integer
```

---

## Creating Wrapper Objects

### From Strings (Preferred way)

```java
Integer i = Integer.valueOf("100");
Long l = Long.valueOf("2000");
Double d = Double.valueOf("10.5");
Boolean b = Boolean.valueOf("true");
```

### Parsing to Primitives

```java
int x = Integer.parseInt("123");
long y = Long.parseLong("456");
```

⚠️ Invalid strings throw `NumberFormatException`

🚫 **Note**: Wrapper constructors are **deprecated since Java 9**. Avoid `new Integer()` etc.

---

## Comparing Wrapper Objects

* `==` → compares **references**
* `equals()` → compares **values**

```java
Long a = Long.valueOf("2000");
Long b = Long.valueOf("2000");

System.out.println(a == b);      // false
System.out.println(a.equals(b)); // true
```

✅ Always use `equals()` for value comparison.

---

## NullPointerException (NPE) with Unboxing

Unboxing a `null` wrapper causes NPE:

```java
Long l = null;
long x = l; // NPE
```

### Safe Unboxing

```java
long x = l != null ? l : 0;
```

### Arithmetic with Wrappers

```java
Integer a = 10;
Integer b = null;
Integer c = a / b; // NPE (auto-unboxing)
```

---

## Primitive vs Wrapper Types

| Primitive                 | Wrapper               |
| ------------------------- | --------------------- |
| Faster                    | Slower                |
| Cannot be null            | Can be null           |
| Not usable in collections | Usable in collections |

---

## Key Takeaways

* Wrapper classes represent primitives as objects
* Use wrappers when **null** or **collections** are needed
* Avoid `==` for wrapper comparison
* Be careful with **auto-unboxing and null values**
* Prefer `valueOf()` and `parseXxx()` over constructors
