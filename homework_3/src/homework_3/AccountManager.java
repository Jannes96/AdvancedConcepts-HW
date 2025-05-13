package homework_3;

public class AccountManager {
	public void checkAccess() {
        Account acc = new Account();

        acc.owner = "Alice";         // ✅ public – immer sichtbar
        // acc.balance = 1000.0;     // ❌ private – nicht sichtbar
        acc.pin = 1234;              // ✅ protected – im selben Package sichtbar
        acc.internalNote = "Note";   // ✅ default – im selben Package sichtbar
    }
}
