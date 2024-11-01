public class Main {
    public static void main(String[] args){

        User user1 = new User(1, "Pera", "Peric");
        User user2 = new User(2, "Zika", "Zikic");
        User user3 = new User(3, "Mika", "Mikic");

        Account account1 = new Account(1, 100, user1);
        Account account2 = new Account(2, 200, user2);
        Account account3 = new Account(3, 300, user3);
        Account account4 = new Account(4, 400, user1);

        Account[] accounts = {account1, account2, account3, account4};

        AccountServiceImpl service = new AccountServiceImpl(accounts);


        Account foundAccount = service.findAccountByOwnerId(1);
        if(foundAccount == null)
            System.out.println("Did not find an account");
        else
            System.out.println("Found an account");


        long sumOfAccounts = service.countAccountsWithBalanceGreaterThan(200);
        System.out.println("Number of accounts with a value grater than 200 is " + sumOfAccounts);


    }
}
