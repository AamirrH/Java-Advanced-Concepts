
## Java Records

Sometimes you will come across classes in your projects that are specifically meant for storing data.
For these, the layout is always the same:

* Variables (fields)
* Getters
* A constructor taking all fields
* Overridden `toString()`, `equals()`, and `hashCode()`

This is where **Records** come to your rescue.

---

## Records

A **record**, like a class, is a way to declare a new type in Java.

You might wonder why we need records when classes already exist.
The answer is **boilerplate reduction**.

Compared to tools like Lombok:

* Records have **language-level support**
* No third-party dependencies are required
* They are **immutable by default**
* They act as **value objects out of the box**

Once a record is created, its state **cannot be modified**.

---

## Defining Records

A record is declared using the `record` keyword, followed by the name and parentheses.

### Empty Record

```java
record User() {
    // empty body
}
```

This record is valid but not very useful yet.

---

### Record with Fields

```java
record User(String username, String password) {
    // empty body
}
```

Here:

* `username` and `password` are the record components
* Getters and constructor are **automatically generated**

---

## What the Compiler Generates

The above record is roughly equivalent to the following class:

```java
public final class User {

    private final String username;
    private final String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String username() {
        return username;
    }

    public String password() {
        return password;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        var that = (User) obj;
        return Objects.equals(this.username, that.username) &&
               Objects.equals(this.password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }

    @Override
    public String toString() {
        return "User[" +
               "username=" + username + ", " +
               "password=" + password + ']';
    }
}
```

### Why Records?

They eliminate a **huge amount of boilerplate code** for immutable data classes.

---

## Custom Constructors

Although records generate a constructor automatically, you can customize it.

### Compact Constructor

```java
public record User(String username, String password) {
    public User {
        if (username == null || password == null) {
            throw new IllegalArgumentException(
                "Username and password must not be null"
            );
        }
    }
}
```

**Notes:**

* No formal parameter list
* Fields are already in scope
* Mostly used for validation
* Called a **compact constructor**

---

## Custom Getters

Record getters are named after the component itself.

Example:

* Component → `username`
* Getter → `username()`

```java
public record User(String username, String password) {

    public String username() {
        return username.toUpperCase(Locale.ENGLISH);
    }
}
```

---

## Record Patterns (Java 21)

Record Patterns allow **destructuring records directly** during pattern matching.

### Using `instanceof`

```java
Object obj = new User("alice", "secret");

if (obj instanceof User(String username, String password)) {
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
}
```

✔ Type checking and data extraction in one step.

---

### Using `switch`

```java
static void printUser(Object obj) {
    switch (obj) {
        case User(String username, String password) ->
            System.out.println("User: " + username);
        default ->
            System.out.println("Not a User");
    }
}
```

---

## Nested Record Patterns

```java
record Name(String first, String last) {}
record User(Name name, String password) {}

Object obj = new User(new Name("Alice", "Smith"), "secret");

if (obj instanceof User(Name(String first, String last), String password)) {
    System.out.println("First name: " + first);
    System.out.println("Last name: " + last);
}
```

**Use cases:**

* Parsing JSON
* AST traversal
* Domain models
* Structured data handling

---

## Features and Limitations

### ❌ Records cannot

* Be abstract
* Extend classes
* Declare additional instance fields
* Be extended by other classes

---

### ✅ Records can

* Be declared inside a class
* Implement interfaces
* Be generic
* Use annotations
* Have static fields, methods, and initializers
* Have constructors
* Have instance methods

---

## Conclusion

Records provide a concise, expressive way to model immutable data in Java.

**Key benefits:**

* Massive boilerplate reduction
* Compiler-generated methods
* No external dependencies
* Built-in immutability
* Seamless pattern matching support

---

### ⚠️ Important Rule (remember this)

* Use `#`, `##`, `###` **outside** code blocks
* Use `java ` **only for code**
* Never wrap the *entire file* in triple backticks

This will render perfectly on **GitHub, VS Code preview, and Markdown viewers**.
