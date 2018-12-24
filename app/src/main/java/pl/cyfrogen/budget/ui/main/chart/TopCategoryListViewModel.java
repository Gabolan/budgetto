package pl.cyfrogen.budget.ui.main.chart;

import pl.cyfrogen.budget.firebase.models.Currency;
import pl.cyfrogen.budget.models.Category;

public class TopCategoryListViewModel {
    private final float percentage;
    private long money;
    private final Currency currency;
    private final Category category;
    private String categoryName;

    public TopCategoryListViewModel(Category category, String categoryName, Currency currency, long money, float percentage) {
        this.category = category;
        this.categoryName = categoryName;
        this.currency = currency;
        this.money = money;
        this.percentage = percentage;

    }

    public String getCategoryName() {
        return categoryName;
    }

    public Currency getCurrency() {
        return currency;
    }

    public long getMoney() {
        return money;
    }

    public Category getCategory() {
        return category;
    }

    public float getPercentage() {
        return percentage;
    }
}
