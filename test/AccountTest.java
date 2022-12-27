import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    private Account account = new Account();

    @Test
    void createAccount() {
        account.setName("Ridwan");
        assertEquals("Ridwan", account.getName());
    }

    @Test
    void depositAccount() {
        account.deposit(20000);
        assertEquals(20000, account.getBalance());
    }
    @Test
    void withdrawAccount(){
        account.deposit(20000);
        account.withdraw(10000);
        assertEquals(10000,account.getBalance());
    }
}

