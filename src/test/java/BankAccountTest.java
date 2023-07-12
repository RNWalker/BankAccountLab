import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount bankAccount;
    @BeforeEach
    public void setUp(){
        bankAccount = new BankAccount();
    }

    @Test
    public void canGetFirstName(){
        String result = bankAccount.getFirstName();
        String expected = "Rebecca";
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void canGetLastName(){
        String result = bankAccount.getLastName();
        String expected = "Walker";
        assertThat(result).isEqualTo(expected);
    }
@Test
    public void canGetDateOfBirth(){
        String result = bankAccount.getDateOfBirth();
        String expected = "18th November 1998";
        assertThat(result).isEqualTo(expected);
    }
@Test
    public void canGetAccountNumber(){
        int result = bankAccount.getAccountNumber();
        int expected = 1234;
        assertThat(result).isEqualTo(expected);
    }
@Test
    public void canGetBalance(){
        int result = bankAccount.getBalance();
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

@Test
    public void canSetFirstName(){
        String result = bankAccount.setFirstName();
        String expected = "Noelia";
    assertThat(result).isEqualTo(expected);
}
    @Test
    public void canSetLastName(){
        String result = bankAccount.setLastName();
        String expected = "Benson";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetDateOfBirth(){
        String result = bankAccount.setDateOfBirth();
        String expected = "18th November 2000";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void canSetAccountNumber(){
        int result = bankAccount.setAccountNumber();
        int expected = 5678;
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void canSetBalance(){
        int result = bankAccount.setBalance();
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }


}
