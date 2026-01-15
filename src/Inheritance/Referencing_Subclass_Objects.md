
# Referring to Subclass Objects in Java

In Java, classes can form a **hierarchy** using inheritance.

* **Superclass** → Parent class
* **Subclass** → Child class (extends the superclass)

A subclass **is a special type of** its superclass.

---

## Example Class Hierarchy

```java
class Person {
    protected String name;
    protected int yearOfBirth;
    protected String address;
}

class Client extends Person {
    protected String contractNumber;
    protected boolean gold;
}

class Employee extends Person {
    protected Date startDate;
    protected Long salary;
}
```

---

## Two Ways to Refer to a Subclass Object

### 1️⃣ Using Subclass Reference

Reference type and object type are the **same**.

```java
Client client = new Client();
Employee employee = new Employee();
```

✔ You can access **all methods and fields** of the subclass.

---

### 2️⃣ Using Superclass Reference

Reference type is **parent**, object type is **child**.

```java
Person client = new Client();
Person employee = new Employee();
```

✔ Allowed because every subclass object **is also** a superclass object.

---

## What Is NOT Allowed ❌

```java
Client c = new Employee();   // ❌ siblings
Client c = new Person();    // ❌ parent → child
```

### Rule:

> A superclass reference can point to a subclass object,
> but a subclass reference **cannot** point to a superclass object.

---

## Accessing Methods with Superclass Reference

You can access **only those methods that exist in the superclass**.

```java
Person p = new Employee();

p.setName("Aamir");     // ✔ OK (defined in Person)
p.setSalary(50000);    // ❌ Compile-time error
```

Why?
Because `Person` **does not know** about `setSalary()`.

---

## Casting Between Superclass and Subclass

### ✔ Safe Casting (actual object is subclass)

```java
Person p = new Client();
Client c = (Client) p;   // ✔ OK
```

### ❌ Unsafe Casting (wrong subclass)

```java
Person p = new Client();
Employee e = (Employee) p; // ❌ ClassCastException
```

⚠️ Only cast **if the object is actually of that subclass**.

---

## When to Use Superclass Reference (Very Important ⭐)

### 1️⃣ Handling Different Objects Together

```java
Person[] people = {
    new Client(),
    new Employee(),
    new Person()
};
```

### 2️⃣ Writing Generic Methods

```java
public static void printNames(Person[] persons) {
    for (Person p : persons) {
        System.out.println(p.getName());
    }
}
```

Works for:

* `Person`
* `Client`
* `Employee`

---

## Key Takeaways 🧠

* A subclass object can be referenced by:

    * its **own class**
    * its **superclass**
* Superclass reference:

    * ❌ cannot access subclass-specific methods
    * ✔ useful for collections & common behavior
* Casting:

    * ✔ subclass → superclass (always safe)
    * ⚠ superclass → subclass (only if object matches)


