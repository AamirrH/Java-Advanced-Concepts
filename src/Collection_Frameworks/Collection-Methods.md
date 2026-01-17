# Java Collections Framework – List & Collection Interface Notes

> **Reference implementation:** `ArrayList`  
> **Style:** Interface-based programming (best practice)
---

## 1. What This Code Demonstrates

This note covers **core methods of the `Collection` and `List` interfaces**, using `ArrayList` as the concrete implementation.

Key ideas demonstrated:

* Programming to **interfaces**, not implementations
* Difference between **overloaded methods** (`remove(int)` vs `remove(Object)`)
* Bulk operations (`addAll`, `removeAll`, `retainAll`)
* Conversion between **Collection → Array → Object casting**

---

## 2. Interface-Based Reference (Very Important)

```java
List<Integer> list = new ArrayList<>();
```

### Why this is important

* `List` is an **interface**
* `ArrayList` is a **concrete class**
* Using interface reference enables:

    * Polymorphism
    * Easy replacement (`LinkedList`, `Vector`)
    * Loose coupling (good design)

> ⚠️ Restriction: You can only access methods declared in `List` / `Collection`, not `ArrayList`-specific ones.

---

## 3. Core Collection Methods

### 3.1 `add(E e)` – *(Collection Interface)*

```java
list.add(100);
list.add(200);
list.add(300);
```

* Adds element to the collection
* Maintains insertion order (List property)
* **Time Complexity (ArrayList):** `O(1)` amortized

---

### 3.2 `size()` – *(Collection Interface)*

```java
list.size();
```

* Returns number of elements present
* **Time Complexity:** `O(1)`

---

### 3.3 `remove(int index)` – *(List Interface)*

```java
list.remove(2);
```

* Removes element at specified index
* Causes **left shift** of elements
* **Time Complexity:** `O(n)`

---

### 3.4 `remove(Object o)` – *(Collection Interface)*

```java
list.remove(Integer.valueOf(200));
```

* Removes first occurrence of the object
* Required to avoid confusion with `remove(int)`

❗ **Important Overloading Trap**

```java
list.remove(200); // treated as index, NOT object
```

---

### 3.5 `contains(Object o)` – *(Collection Interface)*

```java
list.contains(100);
```

* Returns `true` if element exists
* Uses `equals()` internally
* **Time Complexity:** `O(n)`

---

## 4. Bulk Operations (Collection Interface)

### 4.1 `containsAll(Collection<?> c)`

```java
list2.containsAll(list);
```

* Checks whether **calling collection** contains *all* elements of argument

✅ Here: `list2` contains all elements of `list`

---

### 4.2 `addAll(Collection<?> c)`

```java
list3.addAll(list2);
```

* Adds all elements of `list2` into `list3`
* Duplicates are allowed
* **Time Complexity:** `O(n)`

---

### 4.3 `removeAll(Collection<?> c)`

```java
list3.removeAll(list2);
```

* Removes **all matching elements** present in argument collection
* Also removes duplicates

---

### 4.4 `retainAll(Collection<?> c)`

```java
list3.retainAll(list2);
```

* Keeps only common elements
* Performs **intersection** of collections

---

## 5. Conversion: Collection → Array

```java
Object[] a = list3.toArray();
```

* Returns `Object[]`
* No generics due to type erasure

### Downcasting Objects

```java
for (Object o : a) {
    Integer i = (Integer) o;
    System.out.print(i + " ");
}
```

⚠️ Downcasting is safe **only if** collection is type-consistent

---

## 6. Method–Interface Mapping (Quick Revision)

| Method           | Interface  |
| ---------------- | ---------- |
| `add()`          | Collection |
| `size()`         | Collection |
| `remove(Object)` | Collection |
| `contains()`     | Collection |
| `containsAll()`  | Collection |
| `addAll()`       | Collection |
| `removeAll()`    | Collection |
| `retainAll()`    | Collection |
| `remove(int)`    | List       |
| `get(int)`       | List       |

---

## 7. Key Takeaways (Exam + Interview)

* Always prefer **interface references**
* Understand **method overloading traps**
* `ArrayList` allows duplicates & maintains order
* Bulk operations modify the **calling collection**
* `toArray()` returns `Object[]`, not `Integer[]`

---

## 8. When to Use Which Collection

* `ArrayList` → Fast access, more reads
* `LinkedList` → Frequent insert/delete
* `Set` → No duplicates
* `Map` → Key–value storage

---

