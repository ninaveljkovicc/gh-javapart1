public class AccountServiceImpl implements AccountService{

    private Account[] accounts;

    public AccountServiceImpl(Account[] accounts) {
        this.accounts = accounts;
    }


    @Override
    public Account findAccountByOwnerId(long id) {

         for(Account acc: accounts){
             if(id == acc.getOwner().getId())
                 return acc;
         }
         return null;
    }

    @Override
    public long countAccountsWithBalanceGreaterThan(long value) {
        int sum= 0;
        for(Account acc: accounts){
            if(acc.getBalance() > value){
                sum++;
            }
        }
        return sum;
    }
}
