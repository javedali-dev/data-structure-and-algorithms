# Data Structure 101: LinkedList  

![hero image](image/hero.jpg)

### Agenda

1. Why do we need LinkedList?
2. What is LinkedList?
3. How does LinkedList Store data?
4. What is Generic Programming? 
5. What are boundary conditions we need to take care of?
6. How does addFirst() work?
7. How does addLast() work?
8. How does removeFirst() work?
9. How does removeLast() work?
10. How does remove() work?
11. How does find() work?
12. Conclusion


### 1. Why do we need LinkedList?
Many of us are familiar with array as a data structure. An array is an amazing data structure because:
1. It supports random access to the element. means you can access any element in the array with constant time O(1).
2. Easy to implement and easy to learn.
3. Array store elements with reference to indexes that make it more flexible to work with.

With all these advantages there is one thing that array is not capable of is dynamic in size.

> Arrays are fixed in size.  

Although you can make a dynamic array like double the size when an array is in an overflow state. But it is not come out of the box especially in low-level languages. Some high-level language does implement dynamic array like Java provides `ArrayList` API and python has `list` API.
This limitation can be overcome with LinkedList. I think this is the only reason we should need LinkedList. Let understand it by an example, So you are the boss of your company as a boss you need to take care of your employees since you don't know about LinkedList you store the information(Objects of Employee) in an array. Now you can easily access information about your employees, and you are happy.  

```java
//Your employee class should look like this
class Employee{
     int id;
     String name;
     .
     .
     .
}
// you store them in an array and you have 100 employee.
Employee[] arrayOfEmployee = new Employee[100]();  
arrayOfEmployee[id] = new Employee(...);
now you can access the employee with their id;
```

This worked fine for you until you got a big client and you need to hire more employees. let say you have hired five people. because you are a good boss you need to store their information as well. Now you run into the problem. Initially, you only have 100 employees and you have created 100 indexes for your employee. A short and quick solution to this problem is to create a second array of size more than the first array(100+5) copy(expensive task) all the elements from the first array to the second array and you are good to go. until you got another big client and you need to hire some more employees. Now you understand the drawback of the array clearly, let see what LinkedList has to say about the same problem.