package bank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a new AccountBank object
        AccountBank account = new AccountBank();

        // Input account information
        System.out.println("Nhập số tài khoản:");
        account.setAccountNumber(scanner.nextLine());

        System.out.println("Nhập tên chủ tài khoản:");
        account.setAccountHolderName(scanner.nextLine());

        while (true){
            menu();
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Nhập số dư ban đầu:");
                    double initialBalance = scanner.nextDouble();
                    account.setBalance(initialBalance);
                    break;

                case 2:
                    System.out.println("\nthông tin tài khoản:");
                    account.displayAccountInfo();
                    break;
                case 3:
                    System.out.println("\nNhập số tiền gửi:");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 4:
                    System.out.println("\nNhập số tiền rút:");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 5:
                    // Create another account for testing transfer
                    AccountBank destinationAccount = new AccountBank();
                    destinationAccount.setAccountNumber("123456789");
                    destinationAccount.setAccountHolderName("HongNgoc Holder");
                    destinationAccount.setBalance(1000.0);

                    System.out.println("\nNhập số tiền chuyển:");
                    double transferAmount = scanner.nextDouble();
                    account.transfer(destinationAccount, transferAmount);
                    break;
                case 6:
                    // Create another account for testing transfer
                    AccountBank destinationAccount1 = new AccountBank();
                    destinationAccount1.setAccountNumber("123456789");
                    destinationAccount1.setAccountHolderName("HongNgoc Holder");
                    destinationAccount1.setBalance(1000.0);

                    // Display updated account information
                    System.out.println("\nThông tin tài khoản được cập nhật:");
                    account.displayAccountInfo();
                    System.out.println("\nHongNgoc Account Information:");
                    destinationAccount1.displayAccountInfo();
                case 0:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Khong co lua chon nay: ");
                    break;
            }
        }

    }
    public static void menu(){
        System.out.println("Lua chon cua ban: ");
        System.out.println("1: Nhập số dư ban đầu: ");
        System.out.println("2: Thông tin tài khoản: ");
        System.out.println("3: Nhập số tiền gửi: ");
        System.out.println("4: Nhập số tiền rút:  ");
        System.out.println("5: Nhập số tiền chuyển:  ");
        System.out.println("6: Thông tin tài khoản được cập nhật:  ");

        System.out.println("0: Thoat");
    }


}