# Java Enums – Complete Notes (with Constructor, Fields & Switch)
 
> **Concept focus:** `enum` with fields, constructor, methods, iteration, and switch usage

---

## 1. What is an Enum?

An **enum** (short for *enumeration*) is a special Java type used to define a **fixed set of constant values**.

Typical use cases:

* States (ON, OFF)
* Days (MONDAY–SUNDAY)
* Directions (NORTH, SOUTH)
* Status codes, roles, moods, etc.

> Enums provide **type safety**, **readability**, and **compile-time checking**, unlike `int` or `String` constants.

---

## 2. Enum Declaration (Reference Code)

```java
public enum EnumExample {
    ANGRY(78),
    SAD(67),
    HAPPY(54),
    DEPRESSED(4),
    MOTIVATED(100),
    FLIRTY(69);

    private final int moodScore;

    EnumExample(int moodScore) {
        this.moodScore = moodScore;
    }
}
```

---

## 3. Important Rules About Enums

* Enum constants are **public static final** by default
* Enum constructors are **implicitly private**
* You **cannot instantiate enums** using `new`
* Enum constants are created **once** (singleton behavior)

---

## 4. Enum with Fields and Constructor

### Why add fields to enums?

To associate **additional data** with each constant.

In this example:

* Each mood has an associated `moodScore`

```java
private final int moodScore;
```

* `final` ensures immutability
* Enum values become **state + behavior**, not just labels

---

## 5. Accessing Enum Constants

```java
EnumExample mood1 = EnumExample.FLIRTY;
```

* `EnumExample` is the enum type
* `FLIRTY` is a predefined constant

---

## 6. Built-in Enum Methods

### 6.1 `name()`

```java
mood1.name();
```

* Returns the **exact name** of the enum constant
* Output: `FLIRTY`

---

### 6.2 `ordinal()`

```java
mood1.ordinal();
```

* Returns the **position** of the enum constant
* Index starts from `0`

Order in this enum:

```
0 → ANGRY
1 → SAD
2 → HAPPY
3 → DEPRESSED
4 → MOTIVATED
5 → FLIRTY
```

⚠️ **Warning:** Never use `ordinal()` for business logic — order can change.

---

### 6.3 `values()`

```java
for (EnumExample mood : EnumExample.values()) {
    System.out.println(mood);
}
```

* Returns an array of all enum constants
* Useful for iteration, dropdowns, validation

---

## 7. Accessing Enum Fields

```java
System.out.println(mood1.moodScore);
```

* Prints the value associated with the enum constant
* Allowed because the code is in the same file

### Best Practice (Recommended)

```java
public int getMoodScore() {
    return moodScore;
}
```

Encapsulation is preferred, especially outside the enum.

---

## 8. Immutability of Enums

```java
private final int moodScore;
```

* Enum fields should usually be `final`
* Prevents modification of constant data
* Makes enums thread-safe and predictable

---

## 9. Enum in Switch Statement

```java
switch (mood1) {
    case MOTIVATED:
        System.out.println("I AM MOTIVATED");
        break;
    case DEPRESSED:
        System.out.println("I AM DEPRESSED");
        break;
    case FLIRTY:
        System.out.println("I AM FLIRTY");
        break;
    case SAD:
        System.out.println("I AM SAD");
        break;
    case ANGRY:
        System.out.println("I AM ANGRY");
        break;
    case HAPPY:
        System.out.println("I AM HAPPY");
        break;
}
```

### Why enums are perfect for `switch`

* No need for `break` ambiguity with values
* Compile-time safety
* Cleaner than `String` or `int` switches

---

## 10. Why Enums Are Better Than Constants

| Using Enum                | Using Constants        |
| ------------------------- | ---------------------- |
| Type-safe                 | Error-prone            |
| Fixed set                 | Can add invalid values |
| Can have fields & methods | Only values            |
| Switch-friendly           | Risky                  |

---

## 11. Behind the Scenes (Important Concept)

An enum is actually a **class** that:

* Extends `java.lang.Enum`
* Has static instances for each constant

So this:

```java
EnumExample.FLIRTY
```

Is internally:

```java
public static final EnumExample FLIRTY = new EnumExample(69);
```

---

## 12. Common Pitfalls

❌ Using `ordinal()` for logic  
❌ Making enum fields mutable  
❌ Comparing enums with `equals()` instead of `==`

✅ Correct comparison:

```java
if (mood1 == EnumExample.FLIRTY) { }
```

---

## 13. Key Takeaways (Exam + Interview)

* Enums represent a **fixed set of constants**
* Enums can have **fields, constructors, and methods**
* Enum constructors are private by default
* `values()`, `name()`, `ordinal()` are built-in
* Enums work exceptionally well with `switch`
* Prefer enums over constants for clarity and safety

---

