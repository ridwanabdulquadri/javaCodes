import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTTTest {
    private AccountTT account = new AccountTT();

    @Test
    void createAccount(){
        account.setName("Ridwan");
        assertEquals("Ridwan", account.getName());
    }

    @Test
    void depositTest(){
        account.deposit(2000.00);
        assertEquals(2000.00, account.getBalance());
        }

    @Test
    void withdrawTest() {
        account.deposit(2000.00);
        account.withdraw(1500.00);
        assertEquals(500, account.getBalance());
    }
}

