package sk.stopangin.spring.l1.dependencyinjection;

import sk.stopangin.spring.l1.Expense;
import sk.stopangin.spring.l1.ExpenseRepository;
import sk.stopangin.spring.l1.ExpenseService;

public class ExpenseServiceImpl implements ExpenseService {

    private ExpenseRepository expenseRepository;

    public ExpenseServiceImpl(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @Override
    public double getSumOfAllExpenses() {
        return expenseRepository.getAllExpenses()
                .stream()
                .mapToDouble(Expense::getAmount)
                .sum();
    }
}
