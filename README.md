# Prodigy_SD_Task5

# 📦 E-commerce Product Scraper (Java)

This project is a simple Java-based web scraper that extracts product information (title, price, and rating) from an e-commerce website — [Books to Scrape](http://books.toscrape.com/) — and stores the extracted data in a structured CSV file.

---

## 🎯 Objective

To build a program that automatically collects product data (names, prices, and ratings) from an online store and saves it in a `.csv` file for further analysis or use.

---

## ✅ Features

- Scrapes product **Title**, **Price**, and **Rating**
- Stores extracted data in a file named `books.csv`
- Uses the `jsoup` library for HTML parsing
- Simple, clean, and beginner-friendly Java code

---

## 🧰 Tools Used
- Java
- jsoup (HTML parser)
- FileWriter (Java I/O)

---

## ▶️ How to Run

1. **Download** and add [`jsoup`](https://jsoup.org/download) to your classpath.
2. **Compile** and **run** the program from your terminal or IDE.

### 🔧 Terminal commands:

```bash
javac -cp jsoup-1.16.1.jar task5.java
java -cp .;jsoup-1.16.1.jar task5
```

---

## 📂 Output
A file named books.csv will be generated in your working directory with content like:
```yaml
Title,Price,Rating
A Light in the Attic,51.77,Three
Tipping the Velvet,53.74,One
Soumission,50.10,One
Sharp Objects,47.82,Four
...

```

---

## 📌 Note
This project uses books.toscrape.com, a public website built for scraping practice and educational purposes.
