package isu_craz.schoollibraryapp.model;


import jakarta.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "borrow_records")
public class BorrowRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate borrowDate;
    // Many borrow records can belong to 1 Student
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
    // Many borrow records can belong to 1 Book
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
    public BorrowRecord() {
        this.borrowDate = LocalDate.now();
    }
    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public LocalDate getBorrowDate() { return borrowDate; }
    public void setBorrowDate(LocalDate borrowDate) { this.borrowDate = borrowDate; }
    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }
    public Book getBook() { return book; }
    public void setBook(Book book) { this.book = book; }
}