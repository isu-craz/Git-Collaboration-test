package isu_craz.schoollibraryapp.controller;


import isu_craz.schoollibraryapp.model.BorrowRecord;
import isu_craz.schoollibraryapp.repository.BorrowRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/borrows")
public class BorrowController {
    private final BorrowRepository borrowRepository;
    public BorrowController(BorrowRepository borrowRepository) {
        this.borrowRepository = borrowRepository;
    }
    @GetMapping
    public List<BorrowRecord> getAllBorrows() {
        return borrowRepository.findAll();
    }
    @PostMapping
    public BorrowRecord createBorrow(@RequestBody BorrowRecord borrowRecord) {
        return borrowRepository.save(borrowRecord);
    }
}