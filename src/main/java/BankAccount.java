import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    /** Bank account setter.
     *
     * @param name of owner
     * @param accountCategory the account type
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        this.ownerName = name;
        this.accountType = accountCategory;
        this.accountBalance = 0;
    }

    /** Account number setter.
     *
     * @param number account number
     */
    public void setAccountNumber(final int number) {
        this.accountNumber = number;
    }

    /** Account balance setter.
     *
     * @param balance account balance
     */
    public void setAccoundBalance(final double balance) {
        this.accountBalance = balance;
    }

    /** Adjust account balance.
     *
     * @param balance account balance
     */
    public void adjustBalance(final double balance) {
        this.accountBalance += balance;
    }

    /** Owner name setter.
     *
     * @param name owner name
     */
    public void setOwnerName(final String name) {
        this.ownerName = name;
    }

    /** Get accountNumber.
     *
     * @param bankAccount instance title
     * @return instance's account number
     */
    public int getAccountNumber(final BankAccount bankAccount) {
        return this.accountNumber;
    }

    /** Get accountBalance. */
    public double getAccountBalance() {
        return this.accountBalance;
    }

    /** Get ownerName. */
    public String getOwnerName() {
        return this.ownerName;
    }
}
