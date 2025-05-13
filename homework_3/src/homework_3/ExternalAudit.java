package homework_3;

import homework_3.Account;

public class ExternalAudit {
    public void checkAccess() {
        Account acc = new Account();

        acc.owner = "Bob";           // ✅ public – immer sichtbar
        // acc.balance = 1000.0;     // ❌ private – nicht sichtbar
        // acc.pin = 1111;           // ❌ protected – nur sichtbar in Subklassen
        // acc.internalNote = "..." // ❌ default – nur im selben Package sichtbar
    }
}
