# TP2 - Concepts POO
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">Overview</a>
      <ul>
        <li><a href="#built-with">Technologies Used</a></li>
      </ul>
    </li>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Exercise 1 </a></li>
        <li><a href="#built-with">Exercise 2 </a></li>
        <li><a href="#built-with">Exercise 3 </a></li>
        <li><a href="#built-with">Exercise 4 </a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Implementation</a>
      <ul>
        <li><a href="#prerequisites">Screenshots</a></li>
      </ul>
    </li>
   
    
  </ol>
</details>

## Overview
This project focuses on key OOP principles in Java, including inheritance, polymorphism, abstract classes, and interfaces, through practical applications. The exercises cover different scenarios: managing a library system, calculating salaries in a company, handling computer orders in a store, and managing a product list with a console-based menu. Each exercise involves creating classes with specific attributes and behaviors, utilizing inheritance to extend base classes, and implementing polymorphism with overridden methods. The final exercise introduces an interface for managing product collections, demonstrating how Java interfaces and lists work together in a simple menu-driven application.

### Technologies Used

- <img src="https://upload.wikimedia.org/wikipedia/en/3/30/Java_programming_language_logo.svg" width="30" height="30"/> &nbsp;&nbsp;**Java**
- <img src="https://resources.jetbrains.com/storage/products/company/brand/logos/IntelliJ_IDEA_icon.svg" width="30" height="30"/> &nbsp;&nbsp;**IntelliJ IDEA**

- <img src="https://git-scm.com/images/logos/downloads/Git-Icon-1788C.png" width="30" height="30"/> &nbsp;&nbsp;**Git**
- <img src="https://github.githubassets.com/images/modules/logos_page/GitHub-Mark.png" width="30" height="30"/> &nbsp;&nbsp;**GitHub**

## About The Project
### Exercise 1: Library Management System
In this exercise, you’ll create a simple library system in Java. Start by defining a **Personne** class with basic attributes (name, email, etc.), then extend it to create two subclasses: **Adherent** for library members and **Auteur** for authors. Each subclass redefines a display method to show unique details. Additionally, a **Livre**  class stores the author and book details. Finally, a **main** method creates an Adherent and a Livre instance to demonstrate how inherited attributes and methods are used in practice.
### Exercise 2: Employee Salary Management System
Here, you will use an abstract class **Employe** with an abstract method for calculating salaries, which subclasses are required to implement. The **Ingénieur** and **Manager** classes inherit from Employe, each with a specific salary calculation method (15% and 20% increases, respectively). In the main method, instances of Ingénieur and Manager are created to showcase how polymorphism allows different implementations of the salary calculation for each type of employee.
### Exercise 3: Computer Store Order Management
This exercise introduces aggregation and composition by defining classes like **Ordinateur**, Catégorie, **Commande**, **LigneCommande**, and **Client**. You’ll implement methods to add and remove items, search for products by price, and manage customer orders with order lines. The main method sets up a small example order to test how different objects and relationships work together to represent a store’s inventory and order system.
  #### Class diagram
  ![image](https://github.com/user-attachments/assets/95bf611d-4172-48dc-91f2-4e235fe9c75d)

### Exercise 4: Product Collection Management with Interfaces
The final exercise focuses on interfaces and collection management by creating a **Produit** class for products and an **IMetierProduit** interface to define methods for adding, retrieving, finding, and deleting products. The **MetierProduitImpl** class implements this interface, managing a list of products. In the main method, you’ll create a console menu allowing the user to interact with the list, demonstrating how interfaces help organize and manage collections in Java applications.

## Implementation
  ### ScreenShots
   #### 1 - Exercise 1:
   ![image](https://github.com/user-attachments/assets/6f146227-72d5-4062-9e6e-649f6f9f13c9)

   #### 2 - Exercise 2:
   ![image](https://github.com/user-attachments/assets/c20088ba-c60c-4ad6-8080-8633e277196d)

   #### 3 - Exercise 3:  
   ![image](https://github.com/user-attachments/assets/1fec812d-dc31-404b-b4e2-a8fa9735d873)

   #### 4 - Exercise 4:
   ![image](https://github.com/user-attachments/assets/b1c7bd47-48d8-4ad5-a725-b3e8ab607b79)
   ![image](https://github.com/user-attachments/assets/a9cbeeed-07b0-4d9c-8fc8-3ace045968c4)
   ![image](https://github.com/user-attachments/assets/0cc8f7db-0388-4acc-8288-43df2dfccd69)
   ![image](https://github.com/user-attachments/assets/bf38aeb3-ea4a-4f02-abfb-0cd4539899a3)
   ![image](https://github.com/user-attachments/assets/4753d5dc-b208-4689-8e4e-cb1e6ea0f36e)
   ![image](https://github.com/user-attachments/assets/e7acb1ff-7d73-426f-98ff-3e15e3eb5621)






