# Data Structure 101: LinkedList  

![hero image](images/hero.jpg)

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

---

### 1. Why do we need LinkedList?
Many of us are familiar with array as a data structure. An array is an amazing data structure because:
1. It supports random access to the element. means you can access any element in the array with constant time O(1).
2. Easy to implement and easy to learn.
3. Array store elements with reference to indexes that make it more flexible to work with.

With all these advantages there is one thing that array is not capable of is dynamic in size.

> Arrays are fixed in size.  

![array](images/array.jpeg)

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

### 2. What is LinkedList?

![LinkedList](images/LinkedList.png)

So LinkedList stores information in a Node. A Node is a collection of data and pointer point to the next Node. That it. Now if you look into your problem related to storing Employee information it seems like already solve. now you can hire as many employees as you can. And not worry about how to store them because you just need to insert a new Employee(Node) into the existing LinkedList. No more copying from one array to another.

### 3. How does LinkedList Store data?

As discuss above LinkedList stores data in a node. Every Node has two-part first part is data itself and send part a pointer that point to next similar node and sequence goes up to where the end node point to null. Before we discuss how LinkedList is store in computer memory let me introduce you to our friend "head".

> Head is the pointer that points to the first Node of our LinkedList. why?

Have you wondered what happens to the variable that goes out of scope? Those variables are [garbage collected](https://en.wikipedia.org/wiki/Garbage_collection_(computer_science)). Garbage collection is a concept introduce by many high-level languages to overcome memory leakage issues. under the hood, if a variable is not pointed by any of the pointers(referenced) then the variables are going to garbage collected. And we don't want our sweet Employee information to be garbage collected. So we need one reference(head) that points to the first node since the first node is pointing to the next node we don't need any extra reference that points to the next node.
At the hardware level, A Node takes a chunk of heap memory and store data and pointers. Since every chunk of heap memory has to be referenced otherwise garbage collectors will come and collect all the memory that's why we need to head pointer. But we need to be careful because whoever has access to our head pointer can have access to all our Employee information. so we need to make it private(Access Specifier) so that other classes don't have access to it.

### 4. What is Generic programming?

It is a fancy way of saying that our data structure will work no matter what kind of data you want to store and operate with. for e.g. in the previous we saw that why we need LinkedList, in a similar way what if your business expanded and you need to create new department who deal with shipping of your product in that case you also need to store the worker information who work with the new department. Because you are a Good Boss you need to find a way to store information. So you come with a solution that what if our LinkedList can store both kinds of employee objects. That is Generic Programming. In case you need more information refer to [this](https://en.wikipedia.org/wiki/Generic_programming) link.

### 5. What are boundary conditions we need to take care of?

There are some boundary conditions we need to take care of while working with LinkedList.

1. Empty data structure
2. A single element in data structure
3. Adding and removing from the beginning of data structure
4. Adding and removing from end of data structure
5. Working in middle

These boundary conditions are self-explanatory but we will drive deeper when we build our LinkedList.

### 6. How does addFirst() work?

we have our LinkedList that store employee of your company now you want to add a new employee at the beginning of your LinkedList.
Approach: We could create a new node with the given object and insert that at the beginning of the LinkedList.

```java
public void addFirst(E obj){  
    Node<E> node = new Node<E>(obj);  
    node.next = head;  
    head = node; 
}
```

Now we have to take a look at boundary conditions:

1. **Empty data Structure:** if it is an empty LinkedList then the `head` should point to `null`. Hence out LinkedList only stores one node, `node.next` should be `null`. So our addFirst() method will works.
2. **A single element in data structure:** if LinkedList contains a single element then the `node.next` should be `head`. So our addFirst() method will works.

rest of the boundary conditions are not related to this method.
Now talk about complexity, because this is a constant time operation complexity is `O(1)`.

### 7. How does addLast() work?
Approach: Traverse all the way to check if the current node point to null if it points to null insert our new node after the current node. our code should look like this

```java
public void addLast(E obj){  
    Node<E> node = new Node<E>(obj);  
    Node<E> current= head;  
    while(current.next!=null){   
        current= current.next;  
    }  
    current.next = node; 
}
```
Now take a look at boundary conditions:
1. **Empty Data Structure:** Now we have a problem if our LinkedList is empty so our `head` pointer should point to `null` and it will generate `Null Pointer Exception`. To avoid this we have to check if the `head` pointer point to null if it is `null` we just simply insert our node where the `head` is pointing to. So our modified code should look like this,

```java
public void addLast(E obj){  
    Node<E> node = new Node<E>(obj);  
    if(head==null){   
        head=node;   
        return   
    }  
    Node<E> temp = head;  
    while(temp.next!=null){   
        temp = temp.next;  
    }  
    temp.next = node; 
}
```

The rest of the boundary conditions are not related to this method. Now take a look at time complexity: Since we have to traverse the entire LinkedList it will take O(n) where n is a number of nodes in the LinkedList. Can we do better in terms of time complexity? the answer is **YES**. How? By introducing a tail pointer that points to the last node in our LinkedList. So our modified code should look like this

```java
public void addLast(E obj){  
    Node<E> node =  new Node<E>(obj);  
    if(head==null){   
       head=tail=node;   
       return;  
    }  
    tail.next=node;  
    tail=node;  
    return; 
}
```
So now our time complexity becomes O(1).

### 8. How does removeFirst() work?

Approach: Take our head pointer and point to the second node in our LinkedList. We can simply achieve this by `head = head.next`; But what if the head point to null i.e Empty LinkedList. So we have to care about boundary condition, let see our code after taken care of all boundary conditions

```java
public E removeFirst(){  
    if(head==null)    
        return null;  
    E temp = head.data;  
    if(head==tail)    
        head=tail=null;  
    else    
        head=head.next;   
    return temp; 
}
```

The above code will handle all the boundary conditions like
- Empty LinkedList
- One element in Our LinkedList
- More than one element
